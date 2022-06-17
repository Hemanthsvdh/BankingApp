<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>Bank Loan Applicant details</h1>
		<table border="1">
		<tr>
			<th>Id</th>
			<th>FullName</th>
			<th>Email</th>
			<th>Phone</th>
			<th>bankAccountNumber</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${Bank Loan Applicants}" var="BankLoanAppDto">
			<tr>
				<td>${BankLoanAppDto.id }</td>
				<td>${BankLoanAppDto.fullname }</td>
				<td>${BankLoanAppDto.email }</td>
				<td>${BankLoanAppDto.phone }</td>
				<td>${BankLoanAppDto.bankAccountNumber }</td>
				<td><a href="edit?id=${BankLoanAppDto.id}">Edit</a></td>
				<td><a href="delete?id=${BankLoanAppDto.id}">Delete</a></td>
			</tr>
		
		</c:forEach>
		
		
	</table>
	<h2><a href="home.jsp">Back to Home</a></h2>
	</div>
</body>
</html>