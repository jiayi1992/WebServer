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
	.centert{margin:auto;margin-top:50px;}
	div{margin:20%;}
	{border:1px solid black;}
	.back{background-color:#f2f2f2;}
	.border{border:1px solid #006600;}
	td{border:1px dotted #006600;}
	</style>
</head>
<body class="back">
<form action = "messageReview" method="post">

<table class="centert border" style="padding:50px;width:800px;">

<tr>
<td><p>Movie Review :</p></td>
<td class="center"><p> ${movie} </p></td>
</tr>

<tr>
<td> Average Rating :</td>
<td class="center">${review.get("AVG")}/5 (${review.get("COUNT")} votes)</td>
</tr>

<tr>
<td> Enter your vote(0-5) :</td>
<td class="center"><input type="number" name="rating"/></td>
</tr>

<tr>
<td>Enter your Comments :</td>
<td style="width:1000px;" class="center"><input type="text" name="comments" style="height:60px;width:400px"/></td>
</tr>

<tr> 
<td class="center"><input type="reset" name="Reset" value="Reset" /></td>
<td class="center"><input type="submit" name="Submit" value="Submit" /></td>	
</tr>
</table>
<input type="hidden" name="movieName" value="${movie}"/>
</form>
</body>
</html>
