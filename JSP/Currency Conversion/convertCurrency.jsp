<%-- src/main/webapp --%> 
<%-- run currencyConverter.jsp --%> 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Conversion Result</title>
</head>
<body>
	<h1>Conversion Result</h1>
    <%
        // Retrieve the amount, source currency, and target currency from the request parameters
        double amount = Double.parseDouble(request.getParameter("amount"));
        String fromCurrency = request.getParameter("fromCurrency");
        String toCurrency = request.getParameter("toCurrency");

        // Define predefined conversion rates (replace with your own rates)
        double usdToEurRate = 0.85;
        double eurToUsdRate = 1.18;
        double usdToInrRate = 73.5;
        double inrToUsdRate = 0.014;
        double usdToJpyRate = 110.0;
        double jpyToUsdRate = 0.0091;

        // Perform the currency conversion
        double convertedAmount;
        String conversionMessage;

        if ("USD".equals(fromCurrency) && "EUR".equals(toCurrency)) {
            convertedAmount = amount * usdToEurRate;
            conversionMessage = amount + " USD is equivalent to " + convertedAmount + " EUR";
        } else if ("EUR".equals(fromCurrency) && "USD".equals(toCurrency)) {
            convertedAmount = amount * eurToUsdRate;
            conversionMessage = amount + " EUR is equivalent to " + convertedAmount + " USD";
        } else if ("USD".equals(fromCurrency) && "INR".equals(toCurrency)) {
            convertedAmount = amount * usdToInrRate;
            conversionMessage = amount + " USD is equivalent to " + convertedAmount + " INR";
        } else if ("INR".equals(fromCurrency) && "USD".equals(toCurrency)) {
            convertedAmount = amount * inrToUsdRate;
            conversionMessage = amount + " INR is equivalent to " + convertedAmount + " USD";
        } else if ("USD".equals(fromCurrency) && "JPY".equals(toCurrency)) {
            convertedAmount = amount * usdToJpyRate;
            conversionMessage = amount + " USD is equivalent to " + convertedAmount + " JPY";
        } else if ("JPY".equals(fromCurrency) && "USD".equals(toCurrency)) {
            convertedAmount = amount * jpyToUsdRate;
            conversionMessage = amount + " JPY is equivalent to " + convertedAmount + " USD";
        } else {
            convertedAmount = amount;
            conversionMessage = "No conversion needed. The amount remains the same.";
        }
    %>

    <p>Amount to Convert: <%= amount %></p>
    <p>Conversion: <%= conversionMessage %></p>
</body>
</html>
