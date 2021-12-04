package com.sms.controller;

import java.io.IOException;

import com.sms.service.StudentService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteStudentController
 */
@WebServlet("/DeleteStudentController")
public class DeleteStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StudentService service = null;
    
	protected void doPost(jakarta.servlet.http.HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int rollNumber = Integer.parseInt(request.getParameter("rollNumber"));
		service = new StudentService();
		boolean status = service.removeStudent(rollNumber);
		if(status == false) {
			String msg = "Student deleted successfully!";
			response.sendRedirect("./delete_student.jsp?message=" + msg);
//			request.setAttribute("msg", msg);
//			request.getRequestDispatcher("./delete_student.jsp").forward(request, response);
		}
	}

}
