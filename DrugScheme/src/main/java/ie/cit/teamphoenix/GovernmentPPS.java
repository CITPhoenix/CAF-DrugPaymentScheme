package ie.cit.teamphoenix;

public class GovernmentPPS {

	String ppsNumber;
	String surname;
	String address;
	
	public GovernmentPPS(){
		
	}
	
	
	public GovernmentPPS(String ppsNumber, String surname, String address) {
		super();
		this.ppsNumber = ppsNumber;
		this.surname = surname;
		this.address = address;
	}


	public String getPpsNumber() {
		return ppsNumber;
	}


	public void setPpsNumber(String ppsNumber) {
		this.ppsNumber = ppsNumber;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "GovernmentPPS [ppsNumber=" + ppsNumber + ", surname=" + surname
				+ ", address=" + address + "]";
	}
	
	
	
	
	
	
}
