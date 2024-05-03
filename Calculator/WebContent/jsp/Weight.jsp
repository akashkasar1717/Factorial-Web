<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Convert Weight</title>
</head>
<body>
<h2>Convert KG to Gram</h2>
    <form action="Weight" method="POST">
        Enter a number:
        <input type="number" name="weightKg" required>
        <input type="submit" value="Calculate">
    </form>
     <h2>The Weight is : ${weightGrams}</h2>
</body>
</html>