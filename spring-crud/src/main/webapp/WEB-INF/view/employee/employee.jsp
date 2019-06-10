<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<h5><a href="/employee/new">New Employee</a></h5><h5><a href="/employee/list">Employee List</a></h5><br><br><br>
	<table>
		<thead>
			<tr>
				<th>Sr</th>
				<th>Name</th>
				<th>Email</th>
				<th>Username</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${employees}" var="employees" varStatus="index">
				<tr>
					<td>${index.index+1}</td>
					<td>${employees.employeeName}</td>
					<td>${employees.employeeEmail}</td>
					<td>${employees.employeeUsername}</td>
					<td><a href="/employee/${employees.employeeId}/edit">E</a></td>
					<td><a href="/employee/${employees.employeeId}/delete">D</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>