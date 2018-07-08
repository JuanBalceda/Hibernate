package com.balceda.JavaEE_JakartaEE;

import java.util.List;

import com.balceda.JavaEE_JakartaEE.dao.exception.DAOException;
import com.balceda.JavaEE_JakartaEE.dao.impl.TeacherDAOImpl;
import com.balceda.JavaEE_JakartaEE.model.Teacher;

public class App {
	public static void main(String[] args) throws DAOException {
		//Teacher teacher = new Teacher("Marco", "Avatar");

		TeacherDAOImpl teacherDAOImpl = new TeacherDAOImpl();
		//teacherDAOImpl.save(teacher);
		
		List<Teacher> list = teacherDAOImpl.findAll();
		list.stream()
			.forEach(l -> System.out.println(l.getName()));
	}
}
