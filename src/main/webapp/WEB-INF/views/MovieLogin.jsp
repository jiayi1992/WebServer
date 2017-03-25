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

<title>User Login</title>
<style>
	p{color:#006600;font-size:20px;font-family:Arial;}
	td{color:#006600;font-size:20px;font-family:Arial;}
	.center{text-align:center;}
	.centert{margin:auto;}
	div{margin:20%;}
	{border:1px solid black;}
	.back{background-color:#f2f2f2;}
	
</style>
</head>
<body class="back">
<p class="center">Welcome to the Online Movie Review Database System. Please login.</p>


    <form method="POST" action="MovieLogin" >
    <div class="centert">
    <table style="margin:auto">    
    	<tr>
    		<td class="center"><p>User Name:</p><input type="text" id="username" name="username" /></td>
    	</tr>    
  		<tr>
    		<td class="center"><p>Password:</p><input id="password" type="text" name="password" required/></td>
    	</tr>
    	
    	    	
    	<tr>
    		<td style="padding:20px"><input type="submit" name="Submit" value="Submit"/><input type="reset" name="Reset" value="Reset"/><input type="button" name="Register" value="Register" onclick="window.location.href='newMoviegoer'"/></td>    
    	</tr>    	    	
    </table>
    </div>  
    </form>
    
<c:choose>
<c:when test="${message == 'successful'}">
<script language="javascript"> 
window.location.href="menu"
</script>
</c:when>
<c:otherwise>
    <p class="center"><c:out value="${message}"/></p>
 </c:otherwise>
</c:choose>


</body>
</html>