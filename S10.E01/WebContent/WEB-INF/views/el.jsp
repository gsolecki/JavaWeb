<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	Hello ${users[0].name} <br />
	Hello ${users["1"].name} <br />
	Hello ${users['2'].name} <br />

	<c:set target="users[0]" property="name" value="Frank" />
	
	<jsp:setProperty property="" name="" value=""/>
	<jsp:getProperty property="" name=""/>
	
	<c:set var="zero2" value="${\"Zero\"}" />
	
	<%= pageContext.getAttribute("zero1").getClass() %><br />
	<%= pageContext.getAttribute("zero2").getClass() %><br />
	
	Hello ${map.golden.name} <br />
	Hello ${map["u"].name} <br />
	Hello ${map['s'].name} <br />
	
	
</body>
</html>