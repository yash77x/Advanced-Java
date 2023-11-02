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
				<li class="nav-item"><a class="nav-link active" href="total">New</a></li>
			</ul>
		</div>
	</nav>

	<div class="container">
		<h1>Temple Details Submitted Successfully</h1>
		<br>
		<h3>Temple Name: ${templeName}</h3>
		<h3>Place: ${place}</h3>
		<h3>Main God: ${god}</h3>
		<h3>Const Year: ${year}</h3>
		<h3>Const by: ${const_by}</h3>

	</div>

</body>
</html>