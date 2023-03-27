<%@page import="com.jsp.teacher.controller.*"%>
<%@page import="com.jsp.dto.Teacher"%>
<%@page import="com.jsp.service.TeacherService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Teacher view</title>
</head>
<body>
	<%
	GetAllTeacher getAllTeacher = new GetAllTeacher();
	%>
	<table border="1" style="border-collapse: collapse;">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Subject</th>
		</tr>

		<%
		for (Teacher teacher : getAllTeacher.teachers) {
		%>
		<tr>
			<td><%=teacher.getId()%></td>
			<td><%=teacher.getName()%></td>
			<td><%=teacher.getSubject()%></td>
		</tr>
		<%
		}
		%>

	</table>

</body>
</html>