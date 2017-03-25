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

<title>New Moviegoer</title>
</head>
<body>

<form:form modelAttribute="moviegoer" action="saveMoviegoer" method="post">
    <table>
        <tr>
            <td>Name:</td>
            <td><form:input path="mname"/></td>
        </tr>
        
        <tr>
            <td>Street:</td>
            <td><form:input path="street"/></td>
        </tr>
        
        <tr>
            <td>City:</td>
            <td><form:input path="city"/></td>
        </tr>
        
        <tr>
            <td>Zip:</td>
            <td><form:input path="zip"/></td>
        </tr>
        
        <tr>
    		<td>Phone:</td>
    		<td><form:input path="phone"/></td>
		</tr>
		
		<tr>
    		<td>E-mail address:</td>
    		<td><form:input path="email"/></td>
		</tr>
		
		<tr>
    		<td>Password:</td>
    		<td><form:input path="password"/></td>
		</tr>
        
        <tr>
            <td>
                <input type="submit" value="Save Changes"/>
            </td>
            <td>
                <input type="reset" value="Reset"/>
            </td>
        </tr>
    </table>
</form:form>

<c:choose>
<c:when test="${error == 'username is exited'}">
    <p>username is exited</p>
  </c:when>
 <c:when test="${error == 'successful'}">
<script language="javascript"> 
window.location.href="MovieLogin"
</script>
  </c:when>
</c:choose>



</body>
</html>