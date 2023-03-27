package com.jsp.student.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class GetAllStudent extends HttpServlet {

	StudentService studentService = new StudentService();
	public List<Student> students = studentService.getAll();

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("getAll.jsp");
		requestDispatcher.forward(req, resp);

	}

}