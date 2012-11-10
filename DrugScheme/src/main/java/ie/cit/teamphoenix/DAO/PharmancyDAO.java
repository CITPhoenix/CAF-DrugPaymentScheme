package ie.cit.teamphoenix.DAO;

import ie.cit.teamphoenix.Pharmacy;

public interface PharmancyDAO {

	void addPharmacy(Pharmacy pharmacy);
	
	void updatePharmacy(Pharmacy pharmacy);
	
	void deletePharmacy(Pharmacy pharmacy);
	
	Pharmacy findPharmancybyName(String name);
	
	Pharmacy findPharmancybyAddress(String Address);
	
	Pharmacy findPharmancybyContactPerson(String contact);
	
	
	
}
