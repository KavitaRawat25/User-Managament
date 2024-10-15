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
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public boolean isCanAccessMobileRequest() {
		return canAccessMobileRequest;
	}

	public void setCanAccessMobileRequest(boolean canAccessMobileRequest) {
		this.canAccessMobileRequest = canAccessMobileRequest;
	}

	public boolean isCanAccessWebRequest() {
		return canAccessWebRequest;
	}

	public void setCanAccessWebRequest(boolean canAccessWebRequest) {
		this.canAccessWebRequest = canAccessWebRequest;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
