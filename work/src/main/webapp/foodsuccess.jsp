<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Workz</a>
			<ul class=" navbar-nav nav justify-content-end">
				<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a>
				</li>
				<li class="nav-item"><a class="nav-link active" href="#">Foodsuccess</a>
				</li>
				<li class="nav-item"><a class="nav-link active" href="food.jsp">Food</a>
				</li>
			</ul>
		</div>
	</nav>

	<div class="container">
		<h1>Enter Food Details</h1>
		<br>
		<h3>Food Name: ${foodName}</h3>
		<h3>Food Type: ${type}</h3>
		<h3>Hotel Name: ${hotel}</h3>
		<h3>Price: ${price}</h3>
		<h3>Quantity: ${quantity}</h3>
		<h3>Total: ${total}</h3>
	</div>

</body>
</html>