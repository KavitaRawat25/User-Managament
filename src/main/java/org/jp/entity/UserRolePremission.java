package org.jp.entity;



import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class UserRolePremission {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public boolean isCanRead() {
		return canRead;
	}


	public void setCanRead(boolean canRead) {
		this.canRead = canRead;
	}


	public boolean isCanWrite() {
		return canWrite;
	}


	public void setCanWrite(boolean canWrite) {
		this.canWrite = canWrite;
	}


	public boolean isCanUpdate() {
		return canUpdate;
	}


	public void setCanUpdate(boolean canUpdate) {
		this.canUpdate = canUpdate;
	}


	public boolean isCanDelete() {
		return canDelete;
	}


	public void setCanDelete(boolean canDelete) {
		this.canDelete = canDelete;
	}


	public boolean isDefaultLandingPage() {
		return isDefaultLandingPage;
	}


	public void setDefaultLandingPage(boolean isDefaultLandingPage) {
		this.isDefaultLandingPage = isDefaultLandingPage;
	}


	public int getModuleId() {
		return moduleId;
	}


	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}


	public int getSubModulesIds() {
		return subModulesIds;
	}


	public void setSubModulesIds(int subModulesIds) {
		this.subModulesIds = subModulesIds;
	}


	public UserRole getUser() {
		return user;
	}


	public void setUser(UserRole user) {
		this.user = user;
	}


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
	private UserRole user;
	
}
