package edu.kh.todoList.todo.model.service;

import java.sql.Connection;
import java.util.List;

import static edu.kh.todoList.common.JDBCTemplate.*;
import edu.kh.todoList.todo.model.dao.TodoDAO;
import edu.kh.todoList.todo.model.dto.Todo;

public class TodoService {
	
	private TodoDAO dao = new TodoDAO();
	
	public List<Todo> selectAll(int memberNo) throws Exception{
		Connection conn = getConnection();
		
		List<Todo> todoList = dao.selectAll(conn,memberNo);
		
		close(conn);
		
		return todoList;
		
	}
}
