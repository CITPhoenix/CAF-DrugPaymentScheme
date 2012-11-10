package ie.cit.teamphoenix.DAO;

import java.util.List;

import ie.cit.teamphoenix.Family;
import ie.cit.teamphoenix.Staff;

public interface StaffDAO {

	void addStaff(Staff staff);
	
	void updateStaff(Staff staff);
	
	void deleteStaff(Staff staff);
	
	Staff findStaffbyStaffId(int staffId);
	
	Staff findStaffbyName(String name);
	
	List<Staff> findStaffbyRoleId(int roleId);
}
