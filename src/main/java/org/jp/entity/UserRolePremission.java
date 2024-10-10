package org.jp.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table
public class UserRolePremission {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@Column(nullable = false)
	private boolean canRead;
	@Column(nullable = false)
	private boolean canWrite;
	
	@Column(nullable = false)
	private boolean canUpdate;
	@Column(nullable = false)
	private boolean canDelete;
	@Column(nullable = false)
	private boolean isDefaultLandingPage;
	@Column(nullable = false)
	private int moduleId;
	@Column(nullable = false)
	private int subModulesIds;
	
	
	@ManyToOne
	@JoinColumn(name = "role_id")
	private UserRole userRole;
	
}
