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
			<a class="navbar-brand" href="#">Grocery</a>
			<ul class=" navbar-nav nav justify-content-end">
				<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a>
				</li>
				<li class="nav-item"><a class="nav-link active" href="#">Grocery
						Success</a></li>
				<li class="nav-item"><a class="nav-link" href="grocery.jsp">Grocery</a>
				</li>
			</ul>
		</div>
	</nav>

	<div class="container">
		<h1>Grocery Details Submitted Successfully</h1>
		<br>
		<h3>Grocery Name: ${groceryName}</h3>
		<h3>Grocery Type: ${groceryType}</h3>
		<h3>Price: ${price}</h3>
		<h3>Quantity: ${quantity}</h3>
		<h3>Total: ${total}</h3>

	</div>

</body>
</html>