package com.jsp.service;

import java.util.List;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentService {
	StudentDao studentDao = new StudentDao();

	public void create(Student student) {
		studentDao.create(student);
	}

	public void update(Student student) {
		studentDao.update(student);
	}

	public void delete(int id) {
		studentDao.delete(id);
	}

	public Student getById(int id) {
		return studentDao.getById(id);
	}

	public List<Student> getAll() {
		return studentDao.getAll();
	}
}