package com.balceda.JavaEE_JakartaEE.dao.impl;

import java.util.List;

import org.hibernate.Session;

import com.balceda.JavaEE_JakartaEE.dao.PlatziSession;
import com.balceda.JavaEE_JakartaEE.dao.exception.DAOException;
import com.balceda.JavaEE_JakartaEE.dao.interfaces.TeacherDAO;
import com.balceda.JavaEE_JakartaEE.model.Teacher;

public class TeacherDAOImpl implements TeacherDAO {

	PlatziSession platziSession;
	Session session;
	
	public TeacherDAOImpl() {
		platziSession = new PlatziSession();
	}

	@Override
	public void save(Teacher t) throws DAOException {
		session = platziSession.getSession();
		session.beginTransaction();
        session.persist(t);
        session.getTransaction().commit();
        //session.close();
	}

	@Override
	public List<Teacher> findAll() throws DAOException {
		session = platziSession.getSession();
		return session.createQuery("from Teacher").list();
	}

	@Override
	public void deleteById(Long id) throws DAOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Teacher t) throws DAOException {
		// TODO Auto-generated method stub

	}

	@Override
	public Teacher findById(long id) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Teacher findByName(String name) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

}
