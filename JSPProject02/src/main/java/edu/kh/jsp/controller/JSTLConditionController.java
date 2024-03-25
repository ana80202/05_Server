package edu.kh.jsp.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/jstl/condition") //절대경로
public class JSTLConditionController extends HttpServlet {
	
	 //a태그 요청 -> do get메서드로 작성해주기
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setAttribute("name", "홍길동");
		req.setAttribute("money", 50000);
		
		req.getRequestDispatcher("/WEB-INF/views/jstl/condition.jsp").forward(req, resp);
		
		
	}
}
