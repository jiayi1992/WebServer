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
<style>
ul {
	margin-top:5px;
	margin-bottom:5px;
	list-style:none;
	text-align:center;
}
.table_width{width:40%;}
.font_color{color:#009900;}
.background_color{color:#009900;border:1px solid #009900;border-radius:5px;}
form{
	text-align:center;
}
li{
	display:inline;
	font-size:20px;
	font-family:Arial;
	border:0px solid black;
	background-color:#e6e6e6;
	padding-left:10px;
	padding-right:10px;
}
a{
	padding:4px;
}
li>a:hover{
	color:white;
	background-color:#009900;
	border-radius:5px;
}
li>a:visited{
	color:006600;
}
a{
	text-decoration:none;
	color:#009900;
}
div>p{
	text-align:center;
	font-size:20px;
	font-family:courier;
	color:#009900;
}
p{
	margin:10px;
}
div div{
	border: 1px solid #009900;
	border-radius:5px;
	background-color:#e6e6e6;
}
html{
	background-color:#f2f2f2;
}
table{
	font-family:Arial;
	font-size:15px;
	color:#009900;
}
input:nth-child(1){
	border:1px solid #009900;
	margin-right:10px;
	}
input:nth-child(1):hover{
	background-color:#e6e6e6;
	color:#009900;
	}
input:nth-child(6):hover{
	background-color:#009900;
	color:white;
	}
*{border:0px dotted black}
</style>
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous"> -->

</head>
<body>



<div>
	<p><strong>Welcome To Brain's Movie Review System</strong></p>
	<div>
		<table>
			<tr>
				<td class="table_width">
					<ul class="pc-nav"> 
						<li><a href="menu">Home</a></li> 
						<li><a href="MovieList">List All Movies</a></li> 
						<li><a href="ActorList">List All Actors</a></li> 
						<li><a href="MovieListReview">Reviews</a></li> 
						<li><a href="http://www.google.com">Comments</a></li> 
						<li><a href="MovieLogin">Logout</a></li> 
					</ul>
				</td>
				<td class="table_width">	
					<form method="POST" action="searchResult">
						<input type="text" name="keyword"/>
						<strong>Movie</strong>
						<input type="radio" name="search" value="movie" checked/>
						<strong>Actor</strong>
						<input type="radio" name="search" value="actor"/>
						<input type="submit" name="Submit" value="Search" class="font_color background_color"/>
					</form>
				</td>
			</tr>
		</table>
	</div>
	<p>Welcome to Brain's movie review system. Please select an option or perform a search from them menu above. </p>
</div>


</body>
</html>