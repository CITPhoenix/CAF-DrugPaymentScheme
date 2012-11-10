package ie.cit.teamphoenix.DAO;

import ie.cit.teamphoenix.Family;

import java.util.List;

public interface FamilyDAO {

	void addFamily(Family family);
	
	void updateFamily(Family family);
	
	void deleteFamily(Family family);
	
	List<Family> findFamilyByFamilyId(int familyID);
	
	List<Family> findFamilyBySurname(String surname);
	
	List<Family> listAllFamilies();

	
}
