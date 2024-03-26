package edu.kh.jsp.student.model.service;

import java.sql.Connection;
import java.util.List;

import static edu.kh.jsp.common.JDBCTemplate.*;
import edu.kh.jsp.student.dto.Student;
import edu.kh.jsp.student.model.dao.StudentDAO;

public class StudentService {
	
	private StudentDAO dao = new StudentDAO();

	/**학생 전체 조회 서비스
	 * @return stdList
	 */
	public List<Student> selectAll()  throws Exception {
		
		//1. 커넥션 생성
		Connection conn = getConnection();
		
		//2. DAO  호출
		List<Student> stdList = dao.selectAll(conn);
		
		//3. 트랜잭션 제어 (select 이기 때문에 필요하지 않다)
		
		//4. 커넥션 반환
		close(conn);
		
		//5. 결과 반환
		return stdList;
	}

	/**건축 공학과인 학생 조회 서비스
	 * @return
	 */
	public List<Student> selectArch() throws Exception {
		
		Connection conn = getConnection();
		
		List<Student> stdList = dao.selectArch(conn);
		
		close(conn);
		
		return stdList;
	}

	/**입력받은 학과의 학생 조회 서비스
	 * @param input
	 * @return
	 */
	public List<Student> selectOne(String deptName) throws Exception {
		
		Connection conn = getConnection();
		
		List<Student> stdList = dao.selectOne(conn,deptName);
		
		close(conn);
		
		return stdList;
	}



}
