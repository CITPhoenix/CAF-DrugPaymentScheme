package ie.cit.teamphoenix;

import java.util.GregorianCalendar;

public class Family {

	int familyId;
	String surname;
	String currentAddress;
	String previousAddress;
	String phone;
	String dpsId;
	double schemeBalance;
	GregorianCalendar registrationRequestDate;
	int staffId;
	GregorianCalendar decisionDate;
	boolean cardValidated;
	boolean cardPrinted;
	boolean cardPosted;
	String username;
	
	public Family(){
		
	}
	
	
	
	public Family(int familyId, String surname, String currentAddress,
			boolean cardValidated, boolean cardPrinted, boolean cardPosted) {
		super();
		this.familyId = familyId;
		this.surname = surname;
		this.currentAddress = currentAddress;
		this.cardValidated = cardValidated;
		this.cardPrinted = cardPrinted;
		this.cardPosted = cardPosted;
	}



	public Family(int familyId, String surname, String currentAddress,
			String previousAddress, String phone, String dpsId,
			double schemeBalance, GregorianCalendar registrationRequestDate,
			int staffId, GregorianCalendar decisionDate, boolean cardValidated,
			boolean cardPrinted, boolean cardPosted, String username) {
		super();
		this.familyId = familyId;
		this.surname = surname;
		this.currentAddress = currentAddress;
		this.previousAddress = previousAddress;
		this.phone = phone;
		this.dpsId = dpsId;
		this.schemeBalance = schemeBalance;
		this.registrationRequestDate = registrationRequestDate;
		this.staffId = staffId;
		this.decisionDate = decisionDate;
		this.cardValidated = cardValidated;
		this.cardPrinted = cardPrinted;
		this.cardPosted = cardPosted;
		this.username = username;
	}



	public int getFamilyId() {
		return familyId;
	}



	public void setFamilyId(int familyId) {
		this.familyId = familyId;
	}



	public String getSurname() {
		return surname;
	}



	public void setSurname(String surname) {
		this.surname = surname;
	}



	public String getCurrentAddress() {
		return currentAddress;
	}



	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}



	public String getPreviousAddress() {
		return previousAddress;
	}



	public void setPreviousAddress(String previousAddress) {
		this.previousAddress = previousAddress;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getDpsId() {
		return dpsId;
	}



	public void setDpsId(String dpsId) {
		this.dpsId = dpsId;
	}



	public double getSchemeBalance() {
		return schemeBalance;
	}



	public void setSchemeBalance(double schemeBalance) {
		this.schemeBalance = schemeBalance;
	}



	public GregorianCalendar getRegistrationRequestDate() {
		return registrationRequestDate;
	}



	public void setRegistrationRequestDate(GregorianCalendar registrationRequestDate) {
		this.registrationRequestDate = registrationRequestDate;
	}



	public int getStaffId() {
		return staffId;
	}



	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}



	public GregorianCalendar getDecisionDate() {
		return decisionDate;
	}



	public void setDecisionDate(GregorianCalendar decisionDate) {
		this.decisionDate = decisionDate;
	}



	public boolean isCardValidated() {
		return cardValidated;
	}



	public void setCardValidated(boolean cardValidated) {
		this.cardValidated = cardValidated;
	}



	public boolean isCardPrinted() {
		return cardPrinted;
	}



	public void setCardPrinted(boolean cardPrinted) {
		this.cardPrinted = cardPrinted;
	}



	public boolean isCardPosted() {
		return cardPosted;
	}



	public void setCardPosted(boolean cardPosted) {
		this.cardPosted = cardPosted;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	@Override
	public String toString() {
		return "Family [familyId=" + familyId + ", surname=" + surname
				+ ", currentAddress=" + currentAddress + ", previousAddress="
				+ previousAddress + ", phone=" + phone + ", dpsId=" + dpsId
				+ ", schemeBalance=" + schemeBalance
				+ ", registrationRequestDate=" + registrationRequestDate
				+ ", staffId=" + staffId + ", decisionDate=" + decisionDate
				+ ", cardValidated=" + cardValidated + ", cardPrinted="
				+ cardPrinted + ", cardPosted=" + cardPosted + ", username="
				+ username + "]";
	}
	
	
	
	
}
