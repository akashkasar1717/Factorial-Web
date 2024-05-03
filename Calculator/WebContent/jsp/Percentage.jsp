<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Calculate Percentage</title>
<style>
body {
	font-family: Arial, sans-serif;
}

.container {
	max-width: 400px;
	margin: 50px auto;
	padding: 20px;
	border: 1px solid #ccc;
	border-radius: 5px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.input-group {
	margin-bottom: 20px;
}

.input-group label {
	display: block;
	margin-bottom: 5px;
}

.input-group input {
	width: 100%;
	padding: 8px;
	box-sizing: border-box;
}

.btn {
	background-color: #4CAF50;
	color: white;
	padding: 10px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

.result {
	font-weight: bold;
	margin-top: 20px;
}
</style>
</head>
<body>
	<div class="container">
		<h2>Calculate Percentage</h2>
		<form action="Percentage" method="POST">
			<div class="input-group">
				<label for="subject1">Subject 1:</label> <input type="number"
					name="subject1" min="0" max="100" required>
			</div>
			<div class="input-group">
				<label for="subject2">Subject 2:</label> <input type="number"
					name="subject2" min="0" max="100" required>
			</div>
			<div class="input-group">
				<label for="subject3">Subject 3:</label> <input type="number"
					name="subject3" min="0" max="100" required>
			</div>
			<div class="input-group">
				<label for="subject4">Subject 4:</label> <input type="number"
					name="subject4" min="0" max="100" required>
			</div>
			<div class="input-group">
				<label for="subject5">Subject 5:</label> <input type="number"
					name="subject5" min="0" max="100" required>
			</div>
			<button class="btn" type="submit">Calculate Percentage</button>
		</form>
		 <h2>The % is ${percentage}</h2>
	</div>
</body>
</html>
