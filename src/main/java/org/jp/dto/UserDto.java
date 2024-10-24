package org.jp.dto;
import org.jp.entity.UserRole;

//@Data
public class UserDto {
  
	private Long id;
	private String firstName;
    private String lastName;
    private Long phoneNo;
    private Long roleId;
    private Boolean status;
   
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	private String userEmail;
//    private UserRole userRole;
    
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
//	public UserRole getUserRole() {
//		return userRole;
//	}
//	public void setUserRole(UserRole userRole) {
//		this.userRole = userRole;
//	}
    
    
}
