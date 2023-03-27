package com.jsp.teacher.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

@WebServlet("/updateTeacher")
public class UpdateTeacher extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Teacher teacher = new Teacher();
		teacher.setId(Integer.parseInt(req.getParameter("ID")));
		teacher.setName(req.getParameter("name"));
		teacher.setSubject(req.getParameter("subject"));

		TeacherService teacherService = new TeacherService();
		teacherService.update(teacher);

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("success.jsp");
		requestDispatcher.forward(req, resp);

	}
}
