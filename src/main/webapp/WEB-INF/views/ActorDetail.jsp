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

<div class="border">
<table class="centert">

<c:forEach var = "actorList" items="${actorList}" varStatus="status">
<tr>
<td><p>${actorName} - Actor</p></td>
</tr>
<tr class="center">
<td >${actorList.get("TITLE")}</td>
</tr>
</c:forEach>
</table>


<table class="centert">
<c:forEach var = "directorList" items="${directorList}" varStatus="status">
<tr>
<td><p>${actorName} - Director</p></td>
</tr>
<tr class="center">
<td>${directorList.get("TITLE")}</td>
</tr>
</c:forEach>
</table>


<table class="centert">
<c:forEach var = "producerList" items="${producerList}" varStatus="status">
<tr>
<td><p>${actorName} - Producer</p></td>
</tr>
<tr class="center">
<td>${producerList.get("TITLE")}</td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>