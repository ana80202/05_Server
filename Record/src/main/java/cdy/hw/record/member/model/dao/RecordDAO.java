package cdy.hw.record.member.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import cdy.hw.record.dto.DayRecord;

import static cdy.hw.record.common.JDBCTemplate.*;

public class RecordDAO {
	
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private Properties prop;
	
	

	public List<DayRecord> selectAll(Connection conn, int memberNo) throws Exception {
		
		List<DayRecord> recordList = new ArrayList<DayRecord>();
		
		try {
			String sql = prop.getProperty("selectAll");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, memberNo);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				DayRecord record = new DayRecord();
				
				record.setRecordNo(rs.getInt("RECORD_NO"));
				record.setRecordTitle(rs.getString("RECORD_TITLE"));
				record.setRecordMemo(rs.getString("RECORD_MEMO"));
				record.setRecordDate(rs.getString("RECORD_DATE"));
				
				recordList.add(record);
				
			}
		
		}finally {
			close(rs);
			close(pstmt);
			
		}
		
		return  recordList;
	}

}
