package com.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dto.AddressRequest;
import com.demo.dto.StudentRequest;
import com.demo.dto.StudentResponse;
import com.demo.entity.Address;
import com.demo.entity.Student;
import com.demo.repository.StudentRepositoryInter;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class StudentService {
	
	@Autowired
	StudentRepositoryInter studentRepositoryInter ;
	Student student;
	
	@Transactional
	public StudentResponse save(StudentRequest request) {
		ObjectMapper mapper= new ObjectMapper();
		List<Address> addresses = request.getAddressList().stream().map(this::setAddress).collect(Collectors.toList());
		Student stu=mapper.convertValue(request,Student.class);
		System.out.println("Student:: "+stu);
		return mapper.convertValue(studentRepositoryInter.save(stu), StudentResponse.class) ;
	}

	public List<Student> getAll() {			
		return studentRepositoryInter.findAll();
	}

	public Student getByID(int id) {
		return studentRepositoryInter.findById(id).get();
	}

	public void deleteByID(int id) {		
		studentRepositoryInter.deleteById(id);
	}
	
	public Object updateStudentById(StudentRequest request, int stId) {	

		Optional<Student> studentDetailsFromDB = studentRepositoryInter.findById(stId);
		
		if(studentDetailsFromDB.isPresent()) {
			Student studentDB = studentDetailsFromDB.get();
			studentDB.setName(request.getName());
			studentDB.setCourseName(request.getCourseName());
			studentDB.setFee(request.getFee());
			Student updatedStudent = studentRepositoryInter.save(studentDB);
			return updatedStudent;
		} else {
			return "Student of " + stId + " doesn't exist.";
		}		
	}

	private Address setAddress(AddressRequest request) {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.convertValue(request, Address.class);
		
	}
	
	/*
	 * public void updateStudentCourseName(String courseName, int stId) {
	 * studentRepositoryInter.updateStudentCourseName(courseName, stId); }
	 * 
	 * public void updateStudentName(String name, int stId) {
	 * studentRepositoryInter.updateStudentName(name, stId); }
	 * 
	 * public void updateStudentFee(double fee, int stId) {
	 * studentRepositoryInter.updateStudentFee(fee, stId); }
	 * 
	 */
	

	
	/* public Student findByName(String name) {
		 return studentRepositoryInter.findByName(name);
		
	} */
}
	
