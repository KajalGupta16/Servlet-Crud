package com.jsp.student.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

@WebServlet("/updateStudent")
public class UpdateStudent extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Student student = new Student();
		student.setId(Integer.parseInt(req.getParameter("ID")));
		student.setName(req.getParameter("name"));
		student.setEmail(req.getParameter("email"));
		student.setStd(req.getParameter("std"));

		StudentService studentService = new StudentService();
		studentService.update(student);

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("success.jsp");
		requestDispatcher.forward(req, resp);

	}
}