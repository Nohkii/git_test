<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>여기는 index.jsp입니다</h2>
	<%
	webapp.Test test = new webapp.Test();
	String greet = test.getGreet("홍길동");
	out.println(greet);
	%>>
</body>
</html>