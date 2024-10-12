package org.jp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class UserEntity {
	@Column
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private Long phoneNo;
	@Column
	private Long roleId;
	@Column
	private Boolean status;
	@Column
	private String userEmail;
	
	@Column
	private String password;
	
	@OneToOne
	@JoinColumn(name = "user_role_id")  
	private UserRole userRole;

	
	
	
	
	
	
}
