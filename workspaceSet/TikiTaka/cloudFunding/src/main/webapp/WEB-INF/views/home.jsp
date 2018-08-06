<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<html>
<c:import url="common/header.jsp"></c:import>
<head>
	<title>Home</title>
</head>
<body>
	
<c:if test="${!empty user }">
	<c:out value="${user.email }">no user </c:out>

</c:if>
	
<h1>
	Hello world!  
</h1>

	<a href="loginPage.do">login</a>
	<a href="joinPage.do">join</a>
	<a href="projectForm.do">projectForm</a>
</body>
</html>