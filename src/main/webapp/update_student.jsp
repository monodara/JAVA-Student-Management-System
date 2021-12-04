<%@ page  import="com.sms.dto.StudentDto"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Student</title>
</head>
<body>
<%
StudentDto dto = (StudentDto)request.getAttribute("dto");
if(dto == null){
	dto = new StudentDto();
	dto.setRollNumber(0);
	dto.setName("");
	dto.setGender("");
	dto.setCourse("");
}
String msg = request.getParameter("msg");
if(msg == null){
	msg = "";
}
%>
<div><%@include file="header.html" %></div>
<div>
<center>
	<div class="search">
	<h1>Update Student</h1>
	<h4 style="color:green"></h4>
	<form action="./SearchStudentController" method="post">
	<pre>
	Student RollNumber: <input type="text" name="rollNumber" />
	</pre>
	<pre>
	<input type="submit" value="Search" />
	</pre>
	<h4 style="color:green"><%= msg%></h4>
	</form>
	</div>
	<div>
	<form action="./UpdateStudentController" name="student_form" method="post" onsubmit="return doValidate()">
		<table>
		<%
		String rollNum = "";
		if(dto.getRollNumber() != 0){
			rollNum = String.valueOf(dto.getRollNumber());
		}
		%>
		<tr>
			<td>Student Roll Number</td><td><input type="text" name="roll_number" value="<%= rollNum%>"></td>
			<span id="rollNumberMsg"></span>
		</tr>
		<tr>
			<td>Student Name</td><td><input type="text" name="name" value="<%= dto.getName()%>"></td>
			<span id="nameMsg"></span>
		</tr>
		<tr>
			<td>Gender</td>
			<td><input type="text" name="gender" value="<%= dto.getGender()%>"/></td>
		</tr>
		<tr>
			<td>Course<td>
			<input type="text" name="gender" value="<%= dto.getCourse()%>"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="Update Information" /></td>
			<td><input type="button" value="cancel" /></td>
		</tr>
		
		</table>
		</form>
	</div>
</center>

	</div>
<div><%@include file="footer.html" %></div>
</body>
</html>