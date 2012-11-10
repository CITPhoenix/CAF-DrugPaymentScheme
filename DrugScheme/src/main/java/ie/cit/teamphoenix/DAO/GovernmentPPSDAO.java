package ie.cit.teamphoenix.DAO;

import java.util.List;

import ie.cit.teamphoenix.GovernmentPPS;

public interface GovernmentPPSDAO {

	GovernmentPPS findGovermentPPSbyPPSNumber(String ppsNumber);
	
	GovernmentPPS findGovermentPPSbyAddress(String Address);

	List<GovernmentPPS> findGovernmentPPSbySurname(String Surname);
	
	
}


