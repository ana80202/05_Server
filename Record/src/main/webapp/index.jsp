<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

	<link rel="stylesheet" href="/resources/css/main.css">
	<title>today record List</title>
</head>
<body>

<main>
		<c:choose>
		
	<%--로그인을 하지 않았다면 : 로그인/회원가입 입력 폼 출력--%>
			<c:when test="${empty sessionScope.loginMember}">
				
				<h1>Today record:</h1>
				
				<form action="/login" method="post" class="login-form">
					<div>
						<p>아이디</p>
						<input type="text" name="inputId">
					</div>
					<div>
						<p>패스워드</p>
						<input type="password" name="inputPw">
					</div>
					
					<button>로그인</button>
					
					<a href = "/signup" class="signup">회원가입 </a>
					
				</form>
			</c:when>

<%--------------------------------------------------------------------------------------------------------------------- --%>	
			
			
	

	

</body>
</html>