<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action = "CreateService" method = "post">
		Enter Service Type: <input type="text" name = "servicetype"><br>
		Enter Address: <input type="text" name = "address"><br>
		Enter Service Description: <input type="text" name = "servicedescription"><br>
		Enter Booking Date: <input type="text" name = "bookingdate"><br>
		Enter Booking Time: <input type="text" name = "bookingtime"><br>
		<input type="submit" value="CreateService">
	</form>

</body>
</html>