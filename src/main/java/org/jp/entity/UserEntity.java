package org.jp.entity;

<<<<<<< HEAD
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

=======
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
>>>>>>> branch 'danish' of https://github.com/erdanishrajput/User-Managament.git
@Entity
@Table(name = "users") // Added a table name for clarity
@Data
@NoArgsConstructor
public class UserEntity {
<<<<<<< HEAD
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Changed to lowercase 'id' for convention
    
    @Column(nullable = false) // Added nullable constraint for required fields
    private String firstName;

    @Column(nullable = false) // Added nullable constraint for required fields
    private String lastName;

    @Column(nullable = false, unique = true) // Added unique constraint for phone number
    private Long phoneNo;

    @Column(nullable = false)
    private Long roleId;

    @Column(nullable = false)
    private Boolean status;

    @Column(nullable = false, unique = true) // Added unique constraint for email
    private String userEmail;

    @OneToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id", insertable = false, updatable = false) // Set insertable and updatable to false
    private UserRole userRole;
=======
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
	
	@OneToOne
	@JoinColumn(name = "user_role_id")  
	private UserRole userRole;

	
	
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public UserRole getUserRole() {
		return userRole;
	}
	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}
	
	
	
>>>>>>> branch 'danish' of https://github.com/erdanishrajput/User-Managament.git
}
