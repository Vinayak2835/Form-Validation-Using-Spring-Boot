<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>UserName:</h3>
	${reg.userName}
	<h3>Password:</h3>
	${reg.password}
	<h3>Phone-Number:</h3>
	${reg.phone}
	<h3>Age:${reg.age}</h3>
</body>
</html>