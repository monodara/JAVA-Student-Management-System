package com.sms.controller;

import java.io.IOException;

import com.sms.service.StudentService;
import com.sms.vo.StudentVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateStudentController
 */
@WebServlet("/UpdateStudentController")
public class UpdateStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
		StudentVO studentVO = null;
		StudentService studentService = null;
   
	protected void doPost(jakarta.servlet.http.HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		int rollNumber = Integer.parseInt(request.getParameter("roll_number"));
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String course = request.getParameter("course");
		
		studentVO = new StudentVO();
		studentVO.setRollNumber(rollNumber);
		studentVO.setName(name);
		studentVO.setGender(gender);
		studentVO.setCourse(course);
		
		studentService = new StudentService();
		int i = studentService.modifyStudent(studentVO);
		
		if(i != 0) {
			String msg = "Successfully updated student's information";
			response.sendRedirect("./update_student.jsp?msg="+msg);
		}
	}

}
