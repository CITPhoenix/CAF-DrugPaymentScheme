package ie.cit.teamphoenix;
import java.util.GregorianCalendar;


public class Dependants {

	int dependantID;
	int familyID;
	char gender;
	String firstName;
	String surname;
	GregorianCalendar dob;
	String ppsNumber;
	boolean student;
	GregorianCalendar studentExpiryDate;
	String dpsId;
	GregorianCalendar yearOfStudy;
	int courseLength;
	
	public Dependants(){
		
	}
	

	
	public Dependants(int dependantID, char gender, String firstName,
			String surname, GregorianCalendar dob, String ppsNumber,
			boolean student) {
		super();
		this.dependantID = dependantID;
		this.gender = gender;
		this.firstName = firstName;
		this.surname = surname;
		this.dob = dob;
		this.ppsNumber = ppsNumber;
		this.student = student;
	}




	public Dependants(int dependantID, int familyID, char gender,
			String firstName, String surname, GregorianCalendar dob,
			String ppsNumber, boolean student,
			GregorianCalendar studentExpiryDate, String dpsId,
			GregorianCalendar yearOfStudy, int courseLength) {
		super();
		this.dependantID = dependantID;
		this.familyID = familyID;
		this.gender = gender;
		this.firstName = firstName;
		this.surname = surname;
		this.dob = dob;
		this.ppsNumber = ppsNumber;
		this.student = student;
		this.studentExpiryDate = studentExpiryDate;
		this.dpsId = dpsId;
		this.yearOfStudy = yearOfStudy;
		this.courseLength = courseLength;
	}



	public int getDependantID() {
		return dependantID;
	}



	public void setDependantID(int dependantID) {
		this.dependantID = dependantID;
	}



	public int getFamilyID() {
		return familyID;
	}



	public void setFamilyID(int familyID) {
		this.familyID = familyID;
	}



	public char getGender() {
		return gender;
	}



	public void setGender(char gender) {
		this.gender = gender;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getSurname() {
		return surname;
	}



	public void setSurname(String surname) {
		this.surname = surname;
	}



	public GregorianCalendar getDob() {
		return dob;
	}



	public void setDob(GregorianCalendar dob) {
		this.dob = dob;
	}



	public String getPpsNumber() {
		return ppsNumber;
	}



	public void setPpsNumber(String ppsNumber) {
		this.ppsNumber = ppsNumber;
	}



	public boolean isStudent() {
		return student;
	}



	public void setStudent(boolean student) {
		this.student = student;
	}



	public GregorianCalendar getStudentExpiryDate() {
		return studentExpiryDate;
	}



	public void setStudentExpiryDate(GregorianCalendar studentExpiryDate) {
		this.studentExpiryDate = studentExpiryDate;
	}



	public String getDpsId() {
		return dpsId;
	}



	public void setDpsId(String dpsId) {
		this.dpsId = dpsId;
	}



	public GregorianCalendar getYearOfStudy() {
		return yearOfStudy;
	}



	public void setYearOfStudy(GregorianCalendar yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}



	public int getCourseLength() {
		return courseLength;
	}



	public void setCourseLength(int courseLength) {
		this.courseLength = courseLength;
	}



	@Override
	public String toString() {
		return "Dependants [dependantID=" + dependantID + ", familyID="
				+ familyID + ", gender=" + gender + ", firstName=" + firstName
				+ ", surname=" + surname + ", dob=" + dob + ", ppsNumber="
				+ ppsNumber + ", student=" + student + ", studentExpiryDate="
				+ studentExpiryDate + ", dpsId=" + dpsId + ", yearOfStudy="
				+ yearOfStudy + ", courseLength=" + courseLength + "]";
	}
	
	
	
	
	
	
}
