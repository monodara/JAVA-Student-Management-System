<%@ page  import="com.sms.dto.StudentDto"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Student</title>
</head>
<body>
<%
String msg = (String)request.getParameter("message");
if(msg == null){
	msg = "";
}
%>
	<div><%@include file="header.html" %></div>
	<div>
	<center>
		<h1>Delete Student</h1>
		<h4 style="color:green"><%= msg %></h4>
		<form action="./DeleteStudentController" method="post">
		<pre>
		Student RollNumber: <input type="text" name="rollNumber" />
		</pre>
		<pre>
		<input type="submit" value="Delete" />
		</pre>
		</form>
	</center>

	</div>
	<div><%@include file="footer.html" %></div>
</body>
</html>