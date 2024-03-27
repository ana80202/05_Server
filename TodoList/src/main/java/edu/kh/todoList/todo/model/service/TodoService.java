package edu.kh.todoList.todo.model.service;

import java.sql.Connection;
import java.util.List;

import static edu.kh.todoList.common.JDBCTemplate.*;

import edu.kh.todoList.common.JDBCTemplate;
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

	public int insert(String title, String memo, int memberNo) throws Exception {
		
		Connection conn = getConnection();
		
		int result = dao.insert(conn,title,memo,memberNo);
		
		if(result > 0) commit(conn);
		else           rollback(conn);
		
		
		close(conn);
		
		return result;
	}

	public int delete(String todoNo) throws Exception{
		Connection conn = getConnection();
		
		int result = dao.delete(conn,todoNo);
		
		if(result > 0) commit(conn);
		else           rollback(conn);
		
		close(conn);
		
		return  result;
	}

	/**
	 * @param parameter
	 * @return
	 * @throws Exception
	 */
	public Todo selectOne(String todoNo, int memberNo) throws Exception {
		
	Connection conn = getConnection();
		
		Todo todo = dao.update(conn, todoNo, memberNo);
		
		close(conn);
		
		return  todo;
	}

	public int update(String title, String memo, int memberNo, String todoNo) throws Exception {
		
		Connection conn = getConnection();
		
		int result = dao.update(conn, title, memo, memberNo, todoNo);
		
		if(result > 0) commit(conn);
		else           rollback(conn);
		
		close(conn);
		
		return  result;
	}
}
