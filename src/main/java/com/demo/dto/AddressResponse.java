package com.demo.dto;

import lombok.Data;

@Data

public class AddressResponse {

	public AddressResponse() {
		// TODO Auto-generated constructor stub
	}
	private Integer id;
	private String houseNo;
	private String street;
	private String  area;
	private String city;
	private String state;
	private Integer pin;

}
