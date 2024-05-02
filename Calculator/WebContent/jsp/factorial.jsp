<!DOCTYPE html>
<html>
<head>
    <title>Factorial Calculator</title>
</head>
<body>
    <h2>Factorial Calculator</h2>
    <form action="factorial" method="POST">
        Enter a number:
        <input type="number" name="number" required>
        <input type="submit" value="Calculate">
    </form>
     <h2>Factorial of ${number} is: ${factorial}</h2>
</body>
</html>