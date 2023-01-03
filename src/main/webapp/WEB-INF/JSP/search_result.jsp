<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Employee Result</title>
</head>
<body>
	<h2>Employee | Search Result</h2>
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Delete</th>
			<th>update</th>
		</tr>
		<c:forEach items="${employes}" var="employe">
			<tr>
				<td>${employe.firstName}</td>
				<td>${employe.lastName}</td>
				<td>${employe.email}</td>
				<td>${employe.mobile}</td>
				<td><a href="delete?id=${employe.id}">delete</a></td>
				<td><a href="update?id=${employe.id}">update</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>