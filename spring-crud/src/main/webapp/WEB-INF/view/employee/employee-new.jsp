<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee New</title>
</head>
<body>
	<h5>New Employee</h5>
	<form action="${employeeUrl}" method="post">
		<input type="hidden" name="employeeId" value="${employee.employeeId}">
		<label> Employee Name:&nbsp;&nbsp;<input type="text" name="employeeName" value="${employee.employeeName}"></label><br>
		<label> Employee Email:&nbsp;&nbsp;<input type="text" name="employeeEmail" value="${employee.employeeEmail}"></label><br>
		<label> Employee Username:&nbsp;&nbsp;<input type="text" name="employeeUsername" value="${employee.employeeUsername}"></label><br>
		<label> Employee Password:&nbsp;&nbsp;<input type="password" name="employeePassword" value="${employee.employeePassword}"></label><br>
		<input type="submit" value="Save">
	</form>
</body>
</html>