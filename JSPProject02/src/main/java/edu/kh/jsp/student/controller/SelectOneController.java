package edu.kh.jsp.student.controller;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import edu.kh.jsp.student.dto.Student;
import edu.kh.jsp.student.model.service.StudentService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/jstl/student/selectOne")
public class SelectOneController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		StudentService service = new StudentService();
		
		
		try {
			
			String deptName = req.getParameter("deptName");
			
			
			//입력받은 학과의 학생만 조회
			List<Student> stdtList = service.selectOne(deptName);
			
			
			//request scope에 stdList를 담아서 JSP 로 위임
			req.setAttribute("stdList", stdtList);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//요청 위임
		req.getRequestDispatcher("/WEB-INF/views/student/selectOne.jsp").forward(req, resp);
	}
}