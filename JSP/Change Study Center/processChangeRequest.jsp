<%-- src/main/webapp --%> 
<%-- run changeStudyCenterForm.jsp --%> 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Study Center Request Processed</title>
</head>
<body>
	<h1>Change Study Center Request Processed</h1>
	<%
	// Retrieve form data from the request
	String studentName = request.getParameter("studentName");
	String studentID = request.getParameter("studentID");
	String currentStudyCenter = request.getParameter("currentStudyCenter");
	String newStudyCenter = request.getParameter("newStudyCenter");
	String reasonForChange = request.getParameter("reasonForChange");

	// You can process the data as needed (e.g., update a database)

	// Display a confirmation message
	%>
	<p>
		Dear
		<%=studentName%>,
	</p>
	<p>
		Your request for changing your study center from
		<%=currentStudyCenter%>
		to
		<%=newStudyCenter%>
		has been received.
	</p>
	<p>
		Reason for Change:
		<%=reasonForChange%></p>
	<p>Your request will be processed, and you will be notified of the
		outcome.</p>
</body>
</html>
