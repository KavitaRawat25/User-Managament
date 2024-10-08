package com.demo.dto;

import java.util.List;

import com.demo.entity.Address;

import lombok.Data;

@Data
public class StudentResponse {

	private Integer id;
	
	private String name;

	private String courseName;

	private double fee;

	private List<Address> addressList;

}
