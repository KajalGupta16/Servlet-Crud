<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Introduction to JSP Tags</h1>

	<%!String name = "Adam";%>
	<%="Welcome to my page " + name%>
	<br>
	<br>

	<!-- declaring a method in declaration tag -->
	<%!int addTwoNumbers(int a, int b) {
	return a + b;
}%>
	<!-- Calling that method in printing tag -->
	<%=addTwoNumbers(10, 20)%><br>
	<br>

	<!-- Declaring an array using declaration tag	 -->
	<%!int array[] = { 1, 2, 3, 4, 5 };%>

	<!-- for loop in logics tag -->
	<%
	for (int i = 0; i < array.length; i++) {
	%>

	<%=array[i] + " is the element"%><br>
	<br>


	<%
	}
	%>






</body>
</html>