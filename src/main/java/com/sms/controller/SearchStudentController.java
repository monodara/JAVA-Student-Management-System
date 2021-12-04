package com.sms.controller;

import java.io.IOException;

import com.sms.dto.StudentDto;
import com.sms.service.StudentService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchStudentController
 */
@WebServlet("/SearchStudentController")
public class SearchStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StudentService service = null;
	
    
	protected void doPost(jakarta.servlet.http.HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int rollNumber = Integer.parseInt(request.getParameter("rollNumber"));
		service = new StudentService();
		StudentDto dto = service.searchStudent(rollNumber);
		request.setAttribute("dto", dto);
		request.getRequestDispatcher("./update_student.jsp").forward(request, response);
	}

}
