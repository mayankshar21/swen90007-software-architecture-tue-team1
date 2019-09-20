<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SignUp for MyUSR</title>
</head>
<body>

<h1>MyUSR SignUp Form</h1>
<!-- //TODO: make UI looks better -->
<form action="signup" method= post>

Your Name: <input type="text" name = name><br>
Your EmailAddress(Account): <input type= "email" name=email><br>
Your Password:<input type= "password" name = password><br>

<input type="submit" value = "Submit">
</form>

</body>
</html>