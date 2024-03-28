package cdy.hw.record.member.model.service;

import static cdy.hw.record.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;

import cdy.hw.record.dto.DayRecord;
import cdy.hw.record.member.model.dao.RecordDAO;

public class recordService {
	
	private RecordDAO dao = new RecordDAO();

	public List<DayRecord> selectAll(int memberNo) throws Exception {
		Connection conn = getConnection();
		
		List<DayRecord> recordList = dao.selectAll(conn,memberNo);
		
		close(conn);
		
		return recordList;
	}
	
	

}
