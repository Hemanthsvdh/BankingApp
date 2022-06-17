<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>Enter Bank Loan Application data</h1> 
		<form:form action="saveBankLoanAppDto" modelAttribute="BankLoanAppDto">
			<table>
				<tr>
					<td>FullName</td>
					<td><form:input path="fullName" /></td>
				</tr>
				
				<tr>
					<td>FatherName</td>
					<td><form:input path="fatherName" /></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td><form:input path="gender" /></td>
				</tr>
				
				<tr>
					<td>Date of  birth</td>
					<td><form:input path="dateOfBirth" /></td>
				</tr>
				
				<tr>
					<td>pan Number</td>
					<td><form:input path="panNumber" /></td>
				</tr>
				
				<tr>
					<td>address</td>
					<td><form:input path="address" /></td>
				</tr>
				<tr>
					<td>Phone</td>
					<td><form:input path="phoneNumber" /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><form:input path="email" /></td>
				</tr>
				<tr>
					<td>BankAccountNumber</td>
					<td><form:input path="bankAccountNumber" /></td>
				</tr>
				<tr>
					<td>BankName</td>
					<td><form:input path="bankName" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Submit"></td>
				</tr>
			</table>



		</form:form>
		<h2><a href="home.jsp">Back to Home</a></h2>
	</div>
</body>
</html>