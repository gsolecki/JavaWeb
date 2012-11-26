<%@ page language="java" contentType="text/html; charset=UTF-8"pageEncoding="UTF-8"%>

<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
I am taking picture of a big elephant :)<br/>

Welcome <%= request.getUserPrincipal().getName() %>,<br />
Is user in role 'registered' <%= request.isUserInRole("registered") %>, <br />
Authentication type is <%= request.getAuthType() %>,<br />

<form action="Logout" method="post">
	<input type="submit" value="Logout" />
</form>

</body>
</html>