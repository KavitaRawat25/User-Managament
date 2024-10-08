package com.demo.dto;

import lombok.Data;

@Data

public class AddressRequest {


	private String houseNo;
	private String street;
	private String  area;
	private String city;
	private String state;
	private Integer pin;

}
