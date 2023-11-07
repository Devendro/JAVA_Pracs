<%-- src/main/webapp --%> 
<%-- run calculateGrade.jsp --%> 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculated Grade</title>
</head>
<body>
    <h1>Grade Calculation Result</h1>
    <%!
        // Define a method to calculate the grade based on average marks
        public String calculateGrade(double average) {
            String grade;
            if (average >= 90) {
                grade = "A+";
            } else if (average >= 80) {
                grade = "A";
            } else if (average >= 70) {
                grade = "B";
            } else if (average >= 60) {
                grade = "C";
            } else if (average >= 50) {
                grade = "D";
            } else {
                grade = "F";
            }
            return grade;
        }
    %>
    <%
        // Retrieve marks from the form for Subject 1 to Subject 5
        int subject1 = Integer.parseInt(request.getParameter("subject1"));
        int subject2 = Integer.parseInt(request.getParameter("subject2"));
        int subject3 = Integer.parseInt(request.getParameter("subject3"));
        int subject4 = Integer.parseInt(request.getParameter("subject4"));
        int subject5 = Integer.parseInt(request.getParameter("subject5"));

        // Calculate average marks
        double average = (subject1 + subject2 + subject3 + subject4 + subject5) / 5.0;

        // Calculate grade based on average
        String grade = calculateGrade(average);
    %>
    <p>Average Marks: <%= average %></p>
    <p>Overall Grade: <%= grade %></p>
</body>
</html>
