package com.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name ="address")
@Data
public class Address {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="house_no")
	private String houseNo;
	private String street;
	private String  area;
	private String city;
	private String state;
	private Integer pin;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private Student studentDetails;
}
