<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<style type="text/css">
	.container{
		
	}
</style>

<meta charset="ISO-8859-1">
<title>Add Student</title>
</head>
<body>
<script type="text/javascript">
	function doValidate(){
		var rollNumber = document.forms["student_form"]["roll_number"].value;
		var name = document.forms["student_form"]["name"].value;
		var course = document.forms["student_form"]["course"].value;
		var rollNumberStatus;
		var nameStatus;
		var courseStatus;
		var rollNumberMsg;
		var nameMsg;
		var courseMsg;
		
		
			if(rollNumber == ""){
				rollNumberStatus = false;
				rollNumberMsg = "*Roll Number should be there."
				var spanEle = document.getElementById("rollNumberMsg");
				spanEle.style.color = "red";
				spanEle.innerHTML = rollNumberMsg;
			}
			if(name == ""){
				nameStatus = false;
				nameMsg = "*Name should be there.";
				var spanEle = document.getElementById("nameMsg");
				spanEle.style.color = "red";
				spanEle.innerHTML = nameMsg;
			}
			if(course == ""){
				courseStatus = false;
				courseMsg = "*Please select a course.";
				var spanEle = document.getElementById("courseMsg");
				spanEle.style.color = "red";
				spanEle.innerHTML = courseMsg;
			}
		
		
		if(rollNumberStatus == false || nameStatus == false || courseStatus == false){
			return false;			
		}
	}

</script>
	<%
	String msg = (String)request.getAttribute("msg");
	if(msg == null){
		msg = "";
	}
	%>
	<div><%@include file="header.html" %></div>
	<div class="container">
	<center>
	<h1>Add Student</h1>
	<h4 style="color:green"><%= msg %></h4>
		<form action="./AddStudentController" name="student_form" method="post" onsubmit="return doValidate()">
		<table>
		<tr>
			<td>Student Roll Number<td><td><input type="text" name="roll_number"><td>
			<span id="rollNumberMsg"></span>
		</tr>
		<tr>
			<td>Student Name<td><td><input type="text" name="name"><td>
			<span id="nameMsg"></span>
		</tr>
		<tr>
			<td>Gender<td>
			<td><input type="radio" name="gender" checked="checked" value="male">Male &nbsp;&nbsp;&nbsp;<input type="radio" name="gender" value="female">Female<td>
		</tr>
		<tr>
			<td>Course<td>
			<td><select name="course">
				<option value="">--select--</option>
				<option value="java">Java</option>
				<option value="html">Html</option>
				<option value="dot net">Dot Net</option>
			</select><td>			
			<span id="courseMsg"></span>
		</tr>
		<tr>
			<td><input type="submit" value="Add Student" /></td>
			<td><input type="button" value="cancel" /></td>
		</tr>
		
		</table>
		</form>
	</center>
	</div>
	<div><%@include file="footer.html" %></div>
</body>
</html>