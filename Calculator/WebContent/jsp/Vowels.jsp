<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vowels</title>
</head>
<body>
<form action="Vowels" method="POST">
        Enter A Text:
        <input type="text" name="name" required>
        <input type="submit">
    </form>
    <h2>The no of count of vowels in the '${name}' name is ${vowels}</h2>
</body>
</html>