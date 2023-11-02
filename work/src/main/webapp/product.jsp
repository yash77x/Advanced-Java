<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Workz</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Workz</a>
			<ul class=" navbar-nav nav justify-content-end">
				<li class="nav-item">
					<a class="nav-link" href="index.jsp">Home</a>
				</li>
				<li class="nav-item">
					<a class="nav-link active" href="#">Product</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="vendor.jsp">Vendor</a>
				</li>
			</ul>
		</div>
	</nav>
	
		<div class="container">
		<h1>Enter Product Details</h1>
		<br>
		<form action="product" method="post">
			<div class="form-group col-md-6 mb-4">
				<input class="form-control" type="text" name="name" placeholder="Product Name" id="name" required>
			</div>
			
			<div class="form-group col-md-6 mb-4">
				<input class="form-control" type="text" name="price" placeholder="Price" id="price" required>
			</div>
			
			<div class="form-group col-md-6 mb-4">
				<input class="form-control" type="text" name="type" placeholder="Product Type" id="type" required>
			</div>
			
			<div class="form-group col-md-6 mb-4">
				<input class="form-control" type="text" name="quantity" placeholder="Quantity" id="quantity" required>
			</div>
			
			<input type="submit" class="btn btn-primary" value="send">
			<input type="reset" class="btn btn-primary" value="reset">
			
		</form>
	</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>