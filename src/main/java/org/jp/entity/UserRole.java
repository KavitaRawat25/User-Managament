package org.jp.entity;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
import lombok.Data;

@Data
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
	
	
	
	
	

	
}
