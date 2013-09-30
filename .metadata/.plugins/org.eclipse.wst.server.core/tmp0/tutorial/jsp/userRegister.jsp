 
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
<head>
<script type='text/javascript'
	src='<c:url value="/resources/js/hotel.js"/>'></script>
<title>Insert title here</title>
</head>
<body>

<form:form method="post" action="/validate" modelAttribute="userRegister">  
 <p><strong>Please Enter Your User Name: </strong>
    <input type="text" name="userName" size="25">
    <p><p><strong>Please Enter Your Password: </strong>
    <input type="password" size="15" name="password">
    <p><p>
    <input type="submit" value="Submit">
      <input type="reset" value="Reset" onClick="resetForm()">
    </p>
  
    </form:form>
</body>
</html>