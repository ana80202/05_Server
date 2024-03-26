<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
         <!--지시자 태그-->   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력받은 학과의 학생 조회하기</title>
</head>
<body>


		<h1>입력받은 학과의 학생 목록</h1>
	
	  <table border="1">
		<tr>
			<th>번호</th>
			<th>학번</th>
			<th>이름</th>
			<th>학과</th>
			<th>주소</th>
		</tr>
		
		<c:forEach var ="std" items="${stdList}" varStatus="vs"> <%--${vs.count} 사용해서 번호 매기기 --%>
		    <tr>
				<td>${vs.count}</td>
				<td>${std.studentNo}</td>
				<td>${std.studentName}</td>
				<td>${std.departmentName}</td>
				<td>${std.studentAddress}</td>
		   </tr>
		
		
		
		
		</c:forEach>

</body>
</html>