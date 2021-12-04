<%@ page  import="java.util.ArrayList"%>
<%@ page  import="com.sms.dto.StudentDto"%>
<%@ page  import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View All Students</title>
</head>
<body>
<%
List<StudentDto> list = (ArrayList<StudentDto>)request.getAttribute("list");
%>

<div><%@include file="header.html" %></div>
<div>

<center>
	<h1>View All Students</h1>
	<table border="1px">
		<thead>
			<tr><td>Roll Number</td><td>Name of Student</td><td>Gender</td><td>Courses</td></tr>
		</thead>
		<%
		for(StudentDto d : list){%>
			<tr><td><%=d.getRollNumber() %></td><td><%=d.getName() %></td><td><%=d.getGender() %></td><td><%=d.getCourse() %></td></tr>
		<%}
		%>
	</table>
</center>

</div>
<div><%@include file="footer.html" %></div>
	
</body>
</html>