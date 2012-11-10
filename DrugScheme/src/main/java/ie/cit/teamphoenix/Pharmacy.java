package ie.cit.teamphoenix;

public class Pharmacy {

	int pharmacyId;
	String pharmacyName;
	String pharmacyAddress;
	String contactDetails;
	String contactPerson;
	
	public Pharmacy(){
	}
	
	public Pharmacy(int pharmacyId, String pharmacyName,
			String pharmacyAddress, String contactDetails, String contactPerson) {
		super();
		this.pharmacyId = pharmacyId;
		this.pharmacyName = pharmacyName;
		this.pharmacyAddress = pharmacyAddress;
		this.contactDetails = contactDetails;
		this.contactPerson = contactPerson;
	}


	public int getPharmacyId() {
		return pharmacyId;
	}


	public void setPharmacyId(int pharmacyId) {
		this.pharmacyId = pharmacyId;
	}


	public String getPharmacyName() {
		return pharmacyName;
	}


	public void setPharmacyName(String pharmacyName) {
		this.pharmacyName = pharmacyName;
	}


	public String getPharmacyAddress() {
		return pharmacyAddress;
	}


	public void setPharmacyAddress(String pharmacyAddress) {
		this.pharmacyAddress = pharmacyAddress;
	}


	public String getContactDetails() {
		return contactDetails;
	}


	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}


	public String getContactPerson() {
		return contactPerson;
	}


	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}


	@Override
	public String toString() {
		return "PharmacyTable [pharmacyId=" + pharmacyId + ", pharmacyName="
				+ pharmacyName + ", pharmacyAddress=" + pharmacyAddress
				+ ", contactDetails=" + contactDetails + ", contactPerson="
				+ contactPerson + "]";
	}
	
	
	
	
}
