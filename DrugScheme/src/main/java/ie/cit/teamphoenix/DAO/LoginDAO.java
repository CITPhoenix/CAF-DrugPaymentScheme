package ie.cit.teamphoenix.DAO;

import ie.cit.teamphoenix.Login;

public interface LoginDAO {

	void addLogin(Login login);
	
	void updateLogin(Login login);
	
	void deleteLogin(Login login);
	
	Login findLoginByLoginId(int loginId);
	
	Login findLoginByFamilyId(int familyId);
	
	Login findLoginbyEmailAddress(String emailAddress);
	
	Login findLoginByPassword(String password);
}
