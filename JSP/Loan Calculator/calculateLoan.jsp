<%-- src/main/webapp --%> 
<%-- run loanCalculator.jsp --%> 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loan Calculation Results</title>
</head>
<body>
	<h1>Loan Calculation Results</h1>
	<%
	double principal = Double.parseDouble(request.getParameter("loanAmount"));
	int years = Integer.parseInt(request.getParameter("loanPeriod"));

	String interestRateParam = request.getParameter("interestRate");
	double interestRate = 0.0; // Default value if parameter is missing or invalid

	if (interestRateParam != null && !interestRateParam.isEmpty()) {
		try {
			interestRate = Double.parseDouble(interestRateParam) / 100;
		} catch (NumberFormatException e) {
			// Handle the case where "interestRate" is not a valid number
			// You can set an error message or take appropriate action here
		}
	}

	// Automatically detect the loan period based on the entered years
	String loanPeriod;
	if (years >= 1 && years <= 7) {
		loanPeriod = "1 to 7 years at 5.35%";
		interestRate = 0.0535;
	} else if (years >= 8 && years <= 15) {
		loanPeriod = "8 to 15 years at 5.5%";
		interestRate = 0.055;
	} else if (years >= 16 && years <= 30) {
		loanPeriod = "16 to 30 years at 5.75%";
		interestRate = 0.0575;
	} else {
		loanPeriod = "Invalid loan period";
		// Set an error message or handle invalid input here
	}

	double monthlyInterestRate = interestRate / 12;
	int totalPayments = years * 12;

	double monthlyPayment = (principal * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -totalPayments));

	double balance = principal;
	double totalInterestPaid = 0;

	out.println("<h2>Loan Details:</h2>");
	out.println("<p>Principal Loan Amount: Rs" + principal + "</p>");
	out.println("<p>Loan Term: " + years + " years</p>");
	out.println("<p>Interest Rate: " + (interestRate * 100) + "%</p>");
	out.println("<p>Loan Period: " + loanPeriod + "</p>");
	out.println("<h2>Monthly Payment:</h2>");
	out.println("<p>Rs" + monthlyPayment + " per month</p>");

	out.println("<h2>Payment Schedule:</h2>");
	out.println("<table border='1'>");
	out.println("<tr><th>Payment Number</th><th>Payment Amount</th><th>Interest Paid</th><th>Loan Balance</th></tr>");

	for (int month = 1; month <= totalPayments; month++) {
		double interestPaid = balance * monthlyInterestRate;
		double principalPaid = monthlyPayment - interestPaid;
		balance -= principalPaid;
		totalInterestPaid += interestPaid;

		out.println("<tr>");
		out.println("<td>" + month + "</td>");
		out.println("<td>Rs" + monthlyPayment + "</td>");
		out.println("<td>Rs" + interestPaid + "</td>");
		out.println("<td>Rs" + balance + "</td>");
		out.println("</tr>");
	}

	out.println("</table>");

	out.println("<h2>Total Interest Paid:</h2>");
	out.println("<p>Rs" + totalInterestPaid + "</p>");
	%>
</body>
</html>
