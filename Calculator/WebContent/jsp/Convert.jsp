<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Currency Converter</title>
</head>
<body>
    <form action="Currency" method="POST">
        Enter a number:
        <input type="number" name="number" required>
        <select name="myvalue">
        <option value="doller">Dollar</option>
        <option value="pound">Pound</option>
        <option value="euro">Euro</option>
        </select>
        <input type="submit" value="Calculate">
    </form>
    <h2>converting ${selected} from rs val is: ${curr}</h2>
</body>
</html>