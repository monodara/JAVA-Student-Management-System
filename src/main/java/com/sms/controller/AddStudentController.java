package com.sms.controller;

import java.io.IOException;

import com.sms.service.StudentService;
import com.sms.vo.StudentVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/AddStudentController")
public class AddStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StudentVO studentVO = null;
	StudentService studentService = null;

    /**
     * Default constructor. 
     */
    public AddStudentController() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(jakarta.servlet.http.HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get data from user input
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
		int i = studentService.saveStudent(studentVO);
		
		if(i != 0) {
			String msg = "Successfully Added";
			request.setAttribute("msg", msg);
			request.getRequestDispatcher("./add_student.jsp").forward(request, response);
		}
	}

}
