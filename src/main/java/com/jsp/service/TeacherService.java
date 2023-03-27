package com.jsp.service;

import java.util.List;

import com.jsp.dao.TeacherDao;
import com.jsp.dto.Teacher;

public class TeacherService {
	TeacherDao teacherDao = new TeacherDao();

	public void create(Teacher teacher) {
		teacherDao.create(teacher);
	}

	public void update(Teacher teacher) {
		teacherDao.update(teacher);
	}

	public void delete(int id) {
		teacherDao.delete(id);
	}

	public Teacher getById(int id) {
		return teacherDao.getById(id);
	}

	public List<Teacher> getAll() {
		return teacherDao.getAll();
	}
}