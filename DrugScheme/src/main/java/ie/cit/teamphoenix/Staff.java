package ie.cit.teamphoenix;

public class Staff {

	int staffId;
	String staffName;
	String roleId;
	String username;
	String password;
	
	public Staff(){
	}
	
	
	public Staff(int staffId, String staffName, String roleId,
			String username, String password) {
		super();
		this.staffId = staffId;
		this.staffName = staffName;
		this.roleId = roleId;
		this.username = username;
		this.password = password;
	}


	public int getStaffId() {
		return staffId;
	}


	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}


	public String getStaffName() {
		return staffName;
	}


	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}


	public String getRoleId() {
		return roleId;
	}


	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "StaffTable [staffId=" + staffId + ", staffName=" + staffName
				+ ", roleId=" + roleId + ", username=" + username
				+ ", password=" + password + "]";
	}
	
	
	
	
	
}
