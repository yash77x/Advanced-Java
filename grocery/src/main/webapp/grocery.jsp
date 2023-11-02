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
				<li class="nav-item"><a class="nav-link " href="#">Home</a>
				</li>
				<li class="nav-item"><a class="nav-link active" href="#">Grocery</a>
				</li>

			</ul>
		</div>
	</nav>
	
	<div class="container">
		<h1>Enter Grocery Details</h1>
		<br>
		<h1>Total items saved: ${total} </h1> 
		<a href="view">View</a>
		<form action="grocery" method="post">
			<div class="form-group col-md-6 mb-4">
				<input class="form-control" type="text" name="name" placeholder="Grocery Name" id="name" required>
			</div>
			
						<div class="col-md-6 mb-4">
				<label for="">Grocery type</label>
				<select class="form-select" name="type" id="type" required>
					<option value=""></option>
					<option value="Vegetable">Vegetable</option>
					<option value="Fruits">Fruits</option>
				</select>
			</div>
			
			
			<div class="form-group col-md-6 mb-4">
				<input class="form-control" type="text" name="price" placeholder="Price" id="price" required>
			</div>
			
						<div class="col-md-6 mb-4">
				<label for="">Quantity</label>
				<select class="form-select" name="quantity" id="quantity" required>
					<option value=""></option>
					<option value="2">2</option>
					<option value="4">4</option>
					<option value="6">6</option>
					<option value="8">8</option>
					<option value="10">10</option>
				</select>
			</div>
			
			<input type="submit" class="btn btn-primary" value="send">
			<input type="reset" class="btn btn-primary" value="reset">
			
		</form>
	</div>
	
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>