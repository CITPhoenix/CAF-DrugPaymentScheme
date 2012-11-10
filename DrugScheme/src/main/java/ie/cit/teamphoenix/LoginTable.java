package ie.cit.teamphoenix;

public class LoginTable {

	int LoginId;
	int familyId;
	String password;
	String email;
	
	public LoginTable(){
		
	}
	
	public LoginTable(int loginId, int familyId, String password, String email) {
		super();
		LoginId = loginId;
		this.familyId = familyId;
		this.password = password;
		this.email = email;
	}

	public int getLoginId() {
		return LoginId;
	}

	public void setLoginId(int loginId) {
		LoginId = loginId;
	}

	public int getFamilyId() {
		return familyId;
	}

	public void setFamilyId(int familyId) {
		this.familyId = familyId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "LoginTable [LoginId=" + LoginId + ", familyId=" + familyId
				+ ", password=" + password + ", email=" + email + "]";
	}
	
	
	
	
	
	
}
