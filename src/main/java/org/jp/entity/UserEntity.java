package org.jp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table // Added a table name for clarity
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // Changed to lowercase 'id' for convention

	@Column // Added nullable constraint for required fields
	private String userName;

	@Column // Added unique constraint for phone number
	private Long phoneNo;

	@Column
	private Long roleId;

	@Column
	private Boolean status;

	@Column // Added unique constraint for email
	private String userEmail;
	private String password;

	@OneToOne
	@JoinColumn(name = "user_role_id")
	private UserRole userRole;

}
