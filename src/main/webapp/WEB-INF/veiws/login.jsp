<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html>

<head>



<meta charset="UTF-8">

<title>Insert title here</title>

</head>

<body>
	
	<form:form  method="POST" action="/user/login">
	
	username <input  type="text"  name="uname">
	</br>

	passwoed <input  type="password"  name="passw">
	</br>
		<input type ="submit" value ="login">
		
		</form:form>
		<form:form  method="POST" action="/user/register">
		
				<input type ="submit" value="register">
				
				</form:form>
	
</body>
</html>