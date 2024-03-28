<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

	<link rel="stylesheet" href="/resources/css/main.css">
	<title>Today record List</title>
</head>
<body id="body-container" class="body-container">

<main>

		
		<c:choose>
		
	<%--로그인을 하지 않았다면 : 로그인/회원가입 입력 폼 출력--%>
			<c:when test="${empty sessionScope.loginMember}">
				
				<h1>오늘의 기록</h1>
				
				<form action="/login" method="post" class="login-form">

					<div>
						<p>아이디</p>
						<input type="text" name="inputId" class= "bottom-b">
					</div>
					<div>
						<p>패스워드</p>
						<input type="password" name="inputPw" class= "bottom-b">
					</div>
					
					<button>로그인</button>
					
					<a href = "/signUp" class="signup">회원가입 </a>
					
				</form>
			</c:when>
	
			<%--로그인을 했다면 : 현재 로그인한 사람의 투두리스트 출력--%>
			<c:otherwise>
			
			<h1 class="intro">${sessionScope.loginMember.memberNickname}님의 기록</h1>
			
			<div class="button-div">	
			<a href="/logout" class="logout-btn">로그아웃</a>
			</div>
			
			<div id="addrecord">
			
			<div class="obox">1</div>
			<div class="tbox" >2</div>
			<div class="thbox">3</div>
			<div class="fbox" >4</div>
			
			</div>
	
			
			
				<!-- <h1>${sessionScope.loginMember.memberNickname}의 기록</h1>
				
				<c:choose>
				<c:when test="${empty recordList}">
					<h2>!</h2>
				</c:when>
				
				
				<c:otherwise>
					<table>
						<c:forEach var="DayRecord" items="${recordList}">
							<tr>
								<td>${DayRecord.recordTitle}</td>
								<td>${DayRecord.recordMemo}</td>
								<td>${DayRecord.recordDate}</td>
								<td><a href="update?recordNo=${DayRecord.recordNo}"class="update-btn">수정</a></td>
								<td><a href="/delete?recordNo=${DayRecord.recordNo}" 
								onclick="return confirm('정말 삭제하시겠습니까?');"
								class="delete-btn">삭제</a></td>
							</tr>
						</c:forEach>
					</table>
				</c:otherwise>
				</c:choose>
				
				<div class="button-div">
					<a href="/insert" class="insert-btn"> 등록하기</a>
					<a href="/logout" class="logout-btn">로그아웃</a>
				</div> -->
				
				<script>
					console.log("test");
					const backImage = document.querySelector(".body-container");
					backImage.style.backgroundImage = "none";
				</script>
				
			</c:otherwise>
			
</c:choose>
</main>
<%--------------------------------------------------------------------------------------------------------------------- --%>	
			
			
	

	

</body>
</html>