package com.jsp.teacher.controller;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

public class GetAllTeacher extends HttpServlet {
	TeacherService teacherService = new TeacherService();
	public List<Teacher> teachers = teacherService.getAll();

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("getAllTeacher.jsp");
		requestDispatcher.forward(req, resp);
	}
}