<%-- src/main/webapp --%> 
<%-- run currencyConverter.jsp --%> 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Currency Converter</title>
</head>
<body>
	<h1>Currency Converter</h1>
    <form action="convertCurrency.jsp" method="post">
        <label for="amount">Amount to Convert:</label>
        <input type="text" id="amount" name="amount" required><br>

        <label for="fromCurrency">From Currency:</label>
        <select id="fromCurrency" name="fromCurrency">
            <option value="USD">USD (US Dollar)</option>
            <option value="EUR">EUR (Euro)</option>
            <option value="INR">INR (Indian Rupee)</option>
            <option value="JPY">JPY (Japanese Yen)</option>
            <!-- Add more currency options as needed -->
        </select><br>

        <label for="toCurrency">To Currency:</label>
        <select id="toCurrency" name="toCurrency">
            <option value="USD">USD (US Dollar)</option>
            <option value="EUR">EUR (Euro)</option>
            <option value="INR">INR (Indian Rupee)</option>
            <option value="JPY">JPY (Japanese Yen)</option>
            <!-- Add more currency options as needed -->
        </select><br>

        <input type="submit" value="Convert">
    </form>
</body>
</html>
