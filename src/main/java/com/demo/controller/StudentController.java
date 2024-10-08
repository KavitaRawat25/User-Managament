package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dto.StudentRequest;
import com.demo.dto.StudentResponse;
import com.demo.entity.Student;
import com.demo.service.StudentService;

@RestController
@RequestMapping("/test")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/save")
	public ResponseEntity<StudentResponse> save(@RequestBody StudentRequest stu) {
		StudentResponse student = studentService.save(stu);
		return new ResponseEntity<StudentResponse>(student, HttpStatus.OK);
	}

	@GetMapping("/studentlist")
	public List<Student> getAll() {
		System.out.print("list");
		List<Student> stList = studentService.getAll();
		return stList;
	}

	@GetMapping("/student/{id}")
	public Student getByID(@PathVariable("id") int id) {
		return studentService.getByID(id);
	}
	
	
	/*
	 * @GetMapping("/student") public Student getByIDAndName(@RequestParam("name")
	 * String name,@RequestParam("name") String name,@RequestParam("courseName")) {
	 * return new Student(name);
	 * 
	 * }
	 */	

	@DeleteMapping("/student/{id}/delete")
	public String deleteByID(@PathVariable("id") int id) {
		studentService.deleteByID(id);
		return "Delete";

	}
	@GetMapping("/student")
	public Student getById(@RequestParam("id") int id) {
		return studentService.getByID(id);
	}
	@GetMapping("/getname")
	public String getByName(@RequestParam(required = false) String name) {
		
		
		return "Name:" + name; 
	}
	
	
	@PutMapping("/student/{id}/update")
	public ResponseEntity<Object> update(@RequestBody StudentRequest stu, @PathVariable("id") int id) {
		Object obj = studentService.updateStudentById(stu, id);
		return new ResponseEntity<Object>(obj, HttpStatus.OK);
	}
	
	/*
	 * @PutMapping("/student/{id}/update-name") public void
	 * updateStudentName(@RequestBody StudentRequest stu, @PathVariable("id") int
	 * id) { studentService.updateStudentName(stu.getName(), id); }
	 * 
	 * @PutMapping("/student/{id}/update-course_name") public void
	 * updateStudentCourseName(@RequestBody StudentRequest stu, @PathVariable("id")
	 * int id) { studentService.updateStudentCourseName(stu.getCourseName(), id); }
	 * 
	 * @PutMapping("/student/{id}/update-fee") public void
	 * updateStudentFee(@RequestBody StudentRequest stu, @PathVariable("id") int id)
	 * { studentService.updateStudentFee(stu.getFee(), id); }
	 */
/*	@GetMapping("/name/{name}/find")
	public Student findByName(@PathVariable String  name) {		   
		 return studentService.findByName(name);			
	}
*/
}