package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Teacher;

public class TeacherDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void create(Teacher teacher) {
		entityTransaction.begin();
		entityManager.persist(teacher);
		entityTransaction.commit();
	}

	public void update(Teacher teacher) {
		Teacher teacher2 = entityManager.find(Teacher.class, teacher.getId());
		if (teacher2 != null) {
			entityTransaction.begin();
			teacher2.setName(teacher.getName());
			teacher2.setSubject(teacher.getSubject());
		}
		entityManager.merge(teacher2);
		entityTransaction.commit();
	}

	public void delete(int id) {
		Teacher teacher2 = entityManager.find(Teacher.class, id);
		if (teacher2 != null) {
			entityTransaction.begin();
			entityManager.remove(teacher2);
			entityTransaction.commit();
		}
	}

	public Teacher getById(int id) {
		return entityManager.find(Teacher.class, id);
	}

	public List<Teacher> getAll() {
		String sql = "Select s From Teacher s";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}
}