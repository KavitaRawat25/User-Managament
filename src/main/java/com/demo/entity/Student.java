package com.demo.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "studentdetails")
@Data
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "names")
	private String name;
	
	@Column(name = "course_name")
	private String courseName;
	
	@Column(name = "fees")
	private double fee;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "studentDetails")
	private List<Address> addressList;

}
