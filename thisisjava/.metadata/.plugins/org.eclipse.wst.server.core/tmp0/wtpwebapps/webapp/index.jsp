<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>����� index.jsp�Դϴ�</h2>
	<%
	webapp.Test test = new webapp.Test();
	String greet = test.getGreet("ȫ�浿");
	out.println(greet);
	%>>
</body>
</html>