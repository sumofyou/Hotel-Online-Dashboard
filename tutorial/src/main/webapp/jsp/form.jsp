<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Sample App Sign-up Page</title>
</head>
<body>
 
<h1>Sign Up Here!</h1>
 
<form:form method="post" modelAttribute="signupForm" action="create" id="signupForm" cssClass="form-horizontal"
           autocomplete="off">
    <fieldset>
        <legend>Enter Your Information</legend>
 
        Name<br>
        <input type="text" name="firstName"/>
        <input type="submit" name="submit"/>
    </fieldset>
</form:form>
 
 
</body>
</html>