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
					<a class="nav-link " href="product.jsp">Product</a>
				</li>
				<li class="nav-item">
					<a class="nav-link active" href="#">Vendor</a>
				</li>
			</ul>
		</div>
	</nav>
	
		<div class="container">
		<h1>Enter Vendor Details</h1>
		<br>
		<form action="vendor" method="post">
			<div class="form-group col-md-6 mb-4">
				<input class="form-control" type="text" name="name" placeholder="Vendor Name" id="name" required>
			</div>
			
			<div class="form-group col-md-6 mb-4">
				<input class="form-control" type="text" name="gst" placeholder="GST No." id="gst" required>
			</div>
			
			<div class="form-group col-md-6 mb-4">
				<input class="form-control" type="text" name="owner" placeholder="Owner Name" id="owner" required>
			</div>
			
			<div class="form-group col-md-6 mb-4">
				<input class="form-control" type="text" name="location" placeholder="Location" id="location" required>
			</div>
			
			<input type="submit" class="btn btn-primary" value="send">
			<input type="reset" class="btn btn-primary" value="reset">
			
		</form>
	</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>