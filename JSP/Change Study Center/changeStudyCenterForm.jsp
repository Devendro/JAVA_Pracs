<%-- src/main/webapp --%> 
<%-- run changeStudyCenterForm.jsp --%> 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Study Center Application</title>
</head>
<body>
	<h1>Change Study Center Application</h1>
	<form action="processChangeRequest.jsp" method="post">
		<label for="studentName">Student Name:</label> <input type="text"
			id="studentName" name="studentName" required><br> <label
			for="studentID">Student ID:</label> <input type="text" id="studentID"
			name="studentID" required><br> <label
			for="currentStudyCenter">Current Study Center:</label> <input
			type="text" id="currentStudyCenter" name="currentStudyCenter"
			required><br> <label for="newStudyCenter">New
			Study Center:</label> <input type="text" id="newStudyCenter"
			name="newStudyCenter" required><br> <label
			for="reasonForChange">Reason for Change:</label><br>
		<textarea id="reasonForChange" name="reasonForChange" rows="4"
			cols="50" required></textarea>
		<br> <input type="submit" value="Submit Application">
	</form>
</body>
</html>
