package ie.cit.teamphoenix.DAO.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import ie.cit.teamphoenix.Dependants;
import ie.cit.teamphoenix.DAO.DAO;
import ie.cit.teamphoenix.DAO.DependantsDAO;

public class DependantsDAOHibernateImpl extends DAO implements DependantsDAO {

	public void addDependant(Dependants dependant) {
		try {
			begin();
			getSession().save(dependant);
			commit();
		} catch (HibernateException e) {
			rollback();
		}

	}

	public void updateDependant(Dependants dependant) {
		try {
			begin();
			getSession().update(dependant);
			commit();
		} catch (HibernateException e) {
			rollback();
		}

	}

	public void deleteDependant(Dependants dependant) {
		try {
			begin();
			getSession().delete(dependant);
			commit();
		} catch (HibernateException e) {
			rollback();
		}

	}

	public List<Dependants> findDependantByName(String name) {
		try {
			Query q = getSession().createQuery(
					"from familyTable where name= :Name");
			q.setString("Name", name);
			List<Dependants> list = q.list();
			return list;
		} catch (HibernateException e) {
			e.getMessage();
		}
		return null;
	}

	public List<Dependants> findDependantsByFamilyId(int familyId) {
		try {
			Query q = getSession().createQuery(
					"from dependantsTable where familyID= :ID");
			q.setInteger("ID", familyId);
			List<Dependants> list = q.list();
			return list;
		} catch (HibernateException e) {
			e.getMessage();
		}
		return null;
	}

}
