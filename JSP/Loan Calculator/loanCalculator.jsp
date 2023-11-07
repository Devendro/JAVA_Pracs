<%-- src/main/webapp --%> 
<%-- run loanCalculator.jsp --%> 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loan Calculator</title>
</head>
<body>
	<h1>Loan Calculator</h1>
	<form action="calculateLoan.jsp" method="post">
		<label for="loanAmount">Principal Loan Amount:</label> <input
			type="number" id="loanAmount" name="loanAmount" required><br>
		<label for="loanPeriod">Period of Time (in years):</label> <input
			type="number" id="loanPeriod" name="loanPeriod" required><br>
<input type="submit" value="Calculate Loan">
	</form>
</body>
</html>
