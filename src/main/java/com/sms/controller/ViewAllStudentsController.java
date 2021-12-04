package com.sms.controller;

import java.io.IOException;
import java.util.List;

import com.sms.dto.StudentDto;
import com.sms.service.StudentService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;


import jakarta.servlet.http.HttpServletResponseWrapper;


@jakarta.servlet.annotation.WebServlet("/ViewAllStudentsController")
public class ViewAllStudentsController extends jakarta.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(jakarta.servlet.http.HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentService service = new StudentService();
		List<StudentDto> list = service.getAllStudents();
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("./view_all_students.jsp").forward(request, response);
	}

}
