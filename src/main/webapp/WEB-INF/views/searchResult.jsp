<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<title>Insert title here</title>
<style>
	p{color:#006600;font-size:20px;font-family:Arial;}
	td{color:#006600;font-size:20px;font-family:Arial;}
	.center{text-align:center;}
	.centert{margin:auto;}
	div{margin:20%;}
	{border:1px solid black;}
	.back{background-color:#f2f2f2;}
	.border{border:1px solid #006600;}
	</style>
</head>
<body class="back">
<table class="centert border" style="padding:50px;">

<p class="center">${type}</p>
<c:choose>
<c:when test="${type == 'movie'}">
   
<c:forEach var = "resultList" items="${resultList}" varStatus="status">
<tr>
<td><c:out value="${status.count}"/> </td>
<td>${resultList.get("TITLE")}</td>
</tr>
</c:forEach>

</c:when>

<c:when test="${type == 'actor'}">
   
<c:forEach var = "resultList" items="${resultList}" varStatus="status">
<tr>
<td><c:out value="${status.count}"/> </td>
<td>${resultList.get("ANAME")}</td>
</tr>
</c:forEach>

</c:when>
</c:choose>

</table>
</body>
</html>