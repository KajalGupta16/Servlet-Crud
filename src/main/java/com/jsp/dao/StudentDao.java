package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Student;

public class StudentDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void create(Student student) {

		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
	}

	public void update(Student student) {

		Student student2 = entityManager.find(Student.class, student.getId());
		if (student2 != null) {
			entityTransaction.begin();
			student2.setName(student.getName());
			student2.setEmail(student.getEmail());
			student2.setStd(student.getStd());
			entityManager.merge(student2);
			entityTransaction.commit();
		}
	}

	public void delete(int id) {

		Student student = entityManager.find(Student.class, id);
		if (student != null) {
			entityTransaction.begin();
			entityManager.remove(student);
			entityTransaction.commit();
		}

	}

	public Student getById(int id) {
		return entityManager.find(Student.class, id);
	}

	public List<Student> getAll() {
		String sql = "Select s From Student s";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}

}