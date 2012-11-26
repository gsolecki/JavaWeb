<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:if test="${!empty param.retry}">
		Something went wrong. Please try to login again. <br />
	</c:if>

	<form action="j_security_check" method="post" >
		<input name="j_username">
		<input name="j_password" type="password">
		<input type="submit" value="Login">
	</form>
</body>
</html>