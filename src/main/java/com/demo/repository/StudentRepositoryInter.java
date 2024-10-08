package com.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.demo.entity.Student;


public interface StudentRepositoryInter extends JpaRepository<Student, Integer>{

	

	
	
	/*
	 * @Modifying
	 * 
	 * @Query("update Student sd set sd.name = ?1 where sd.id = ?2") void
	 * updateStudentName(String name, int id);
	 * 
	 * @Modifying
	 * 
	 * @Query("update Student sd set sd.courseName = :courseName where sd.id = :id")
	 * void updateStudentCourseName(String courseName, int id);
	 * 
	 * @Modifying
	 * 
	 * @Query("update Student set fee = ?1 where id = ?2") void
	 * updateStudentFee(double fee, int id);
	 */
	

	// public Student findByName(String name);
}
