package com.jsp.student.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

@WebServlet("/viewstudent")
public class GetByIdStudent extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("ID"));
		StudentService studentService = new StudentService();
		Student student = studentService.getById(id);

		PrintWriter printWriter = resp.getWriter();
		printWriter.write("<h1> ID :  <mark>" + student.getId() + "</mark></h1><h1> Name : <mark>" + student.getName()
				+ "</mark></h1><h1> Email : <mark>" + student.getEmail() + "</mark></h1><h1> std : <mark>"
				+ student.getStd() + "</mark></h1>");

	}
}

