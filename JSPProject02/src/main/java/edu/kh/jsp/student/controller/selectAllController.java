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

@WebServlet("/jstl/student/selectAll")
public class selectAllController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//서비스 객체 생성
		StudentService service = new StudentService();
		
		try {
			
			//학생 전체 조회하는 서비스 호출하고 응답
			List<Student> stdtList = service.selectAll(); // 단순 조회이기때문에 따로 전달한 파라미터는 없음!
			
			
			
			//request scope에 stdList를 담아서 JSP 로 위임
			req.setAttribute("stdList", stdtList);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//요청 위임
		req.getRequestDispatcher("/WEB-INF/views/student/selectAll.jsp").forward(req, resp);
		
		
		
	}
	
	
	
	
	
}	
	
	
	

