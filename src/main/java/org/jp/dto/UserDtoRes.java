package org.jp.dto;

import lombok.Data;

@Data

public class UserDtoRes {
	
	private Long id;
	private String roleName;
	
	private String roleDescription;
	
	private boolean canAccessMobileRequest;
	
	
	private boolean canAccessWebRequest;
	
	private int status;
	

}
