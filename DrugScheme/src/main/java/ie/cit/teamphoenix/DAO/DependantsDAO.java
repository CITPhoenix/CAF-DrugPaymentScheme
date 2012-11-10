package ie.cit.teamphoenix.DAO;

import java.util.List;

import ie.cit.teamphoenix.Dependants;

public interface DependantsDAO {

	void addDependant(Dependants dependant);
	
	void updateDependant(Dependants dependant);
	
	void deleteDependant(Dependants dependant);
	
	Dependants findDependantByName(String Name);
	
	List<Dependants> findDependantsByFamilyId(int familyId);
	
}
