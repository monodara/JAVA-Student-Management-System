package com.sms.service;

import java.util.List;

import com.sms.bo.StudentBO;
import com.sms.dao.StudentDao;
import com.sms.dto.StudentDto;
import com.sms.vo.StudentVO;

public class StudentService {
	
	StudentDao studentDao = null;
	StudentBO studentBo = null;
	public int saveStudent(StudentVO studentVO){
		//business 
		studentDao = new StudentDao();
		studentBo = new StudentBO();
		studentBo.setRollNumber(studentVO.getRollNumber());
		studentBo.setName(studentVO.getName());
		studentBo.setGender(studentVO.getGender());
		studentBo.setCourse(studentVO.getCourse());
		
		int i = studentDao.addStudent(studentBo);
		return i;
	}
	
	public List<StudentDto> getAllStudents() {
		studentDao = new StudentDao();
		return studentDao.viewStudents();
	}
	
	public boolean removeStudent(int rollNumber) {
		studentDao = new StudentDao();
		return studentDao.delete(rollNumber);
	}
	public StudentDto searchStudent(int rollNumber) {
		studentDao = new StudentDao();
		return studentDao.getStudentDetails(rollNumber);
	}
	
	public int modifyStudent(StudentVO studentVO) {
		studentDao = new StudentDao();
		studentBo = new StudentBO();
		studentBo.setRollNumber(studentVO.getRollNumber());
		studentBo.setName(studentVO.getName());
		studentBo.setGender(studentVO.getGender());
		studentBo.setCourse(studentVO.getCourse());
		
		studentDao = new StudentDao();
		return studentDao.updateStudent(studentBo);
	}
}
