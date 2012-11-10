package ie.cit.teamphoenix.DAO.impl;

import java.util.List;

import ie.cit.teamphoenix.Family;
import ie.cit.teamphoenix.DAO.DAO;
import ie.cit.teamphoenix.DAO.FamilyDAO;
import org.hibernate.HibernateException;
import org.hibernate.Query;

public class FamilyDAOHibernateImpl extends DAO implements FamilyDAO {

	public void addFamily(Family family) {
		try {
			begin();
			getSession().save(family);
			commit();
		} catch (HibernateException e) {
			rollback();
		}

	}

	public void updateFamily(Family family) {
		try {
			begin();
			getSession().update(family);
			commit();
		} catch (HibernateException e) {
			rollback();
		}

	}

	public void deleteFamily(Family family) {
		try {
			begin();
			getSession().delete(family);
			commit();
		} catch (HibernateException e) {
			rollback();
		}

	}

	public List<Family> findFamilyByFamilyId(int familyID) {
		try {
			Query q = getSession().createQuery(
					"from familyTable where familyID= :ID");
			q.setInteger("ID", familyID);
			List<Family> list = q.list();
			return list;
		} catch (HibernateException e) {
			e.getMessage();
		}
		return null;
	}

	public List<Family> findFamilyBySurname(String surname) {
		try {
			Query q = getSession().createQuery(
					"from familyTable where surname= :surname");
			q.setString("surname", surname);
			List<Family> list = q.list();
			return list;
		} catch (HibernateException e) {
			e.getMessage();
		}
		return null;
	}

	public List<Family> listAllFamilies() {
		try {
			Query q = getSession().createQuery("from familyTable");
			List<Family> list = q.list();
			return list;
		} catch (HibernateException e) {
			e.getMessage();
		}
		return null;

	}

}
