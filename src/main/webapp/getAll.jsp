<%@page import="java.util.List"%>
<%@page import="com.jsp.student.controller.*"%>
<%@page import="com.jsp.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student view</title>
</head>
<body>
	<%!GetAllStudent getAllStudent = new GetAllStudent();%>
	<table border="1" style="border-collapse: collapse;">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Std</th>
		</tr>
		<%!List<Student> students = getAllStudent.students;%>
		<%
		for (Student student2 : students) {
		%>
		<tr>
			<td><%=student2.getId()%></td>
			<td><%=student2.getName()%></td>
			<td><%=student2.getEmail()%></td>
			<td><%=student2.getStd()%></td>
		</tr>

		<%
		}
		%>
	</table>

</body>
</html>