<%-- src/main/webapp --%> 
<%-- run calculateGrade.jsp --%> 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Grade Calculator</title>
</head>
<body>
<h1>Grade Calculator</h1>
    <form action="gradeCalculator.jsp" method="post">
        <label for="subject1">Subject 1:</label>
        <input type="number" name="subject1" required><br>
        
        <label for="subject1">Subject 2:</label>
        <input type="number" name="subject2" required><br>
        
        <label for="subject1">Subject 3:</label>
        <input type="number" name="subject3" required><br>
        
        <label for="subject1">Subject 4:</label>
        <input type="number" name="subject4" required><br>
        
        <label for="subject1">Subject 5:</label>
        <input type="number" name="subject5" required><br>
        
        <input type="submit" value="Calculate Grade">
    </form>
</body>
</html>
