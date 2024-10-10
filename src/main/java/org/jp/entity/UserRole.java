package org.jp.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table
public class UserRole {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false,  unique = true)
	private String roleName;
	
	@Column(nullable = false)
	private String roleDescription;
	
	@Column(nullable  = false)
	private boolean canAccessMobileRequest;
	
	
	@Column(nullable = false)
	private boolean canAccessWebRequest;
	
	@Column(nullable = false)
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
