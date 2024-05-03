<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Validate</title>
</head>
<body>
 	<h2>Enter Mobile Number</h2>
    <form action="Mobile" method="POST">
        <label for="mobileNumber">Mobile Number:</label>
        <input type="text" id="mobileNumber" name="mobileNumber" required pattern="\d{10}">
        <button type="submit">Validate</button>
    </form>
    <h2>Number is valid ${isValid}</h2>
</body>
</html>