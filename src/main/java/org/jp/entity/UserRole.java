package org.jp.entity;

import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;


@EntityScan
@Table
@Data
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
	
	
	@OneToMany(mappedBy = "userRole", cascade = CascadeType.ALL)
	private List<UserRolePremission> rolePremissions;
	
	
	
	
	
}
