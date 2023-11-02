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
					<a class="nav-link active" href="#">Food</a>
				</li>
			</ul>
		</div>
	</nav>
	
		<div class="container">
		<h1>Enter Food Details</h1>
		<br>
		<form action="food" method="post" class="was-validated">
			<div class="form-group col-md-6 mb-4">
				<label for="">Food Name</label>
				<input class="form-control" type="text" name="name" id="name" required>
			</div>
			
			<div class="col-md-6 mb-4">
				<label for="">Food Type</label>
				<select class="form-select" name="type" id="type" required>
					<option value=""></option>
					<option value="Veg">Veg</option>
					<option value="Non-Veg">Non-Veg</option>
				</select>
			</div>
			
			<div class="col-md-6 mb-4">
				<label for="">Hotel Name</label>
				<select class="form-select" name="hotel" id="hotel" required>
					<option value=""></option>
					<option value="Hotel Mandya">Hotel Mandya</option>
					<option value="Hotel Bawarchi">Hotel Bawarchi</option>
					<option value="Hotel Leelavathi palace">Hotel Leelavathi palace</option>
					<option value="Udupi Garden">Udupi Garden</option>
				</select>
			</div>
			
			<div class="form-group col-md-6 mb-4">
				<label for="">Price</label>
				<input class="form-control" type="text" name="price" id="price" required>
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

			<div class="col-md-6 mb-4">
			<input class="form-check-input" type="checkbox" id="myCheck" name="remember" required>
			<label class="form-check-label" for="myCheck">I agree to terms and conditions</label>
			<div class="invalid-feedback">Check this checkbox to continue.</div>
			<br>
			<input type="submit" class="btn btn-primary" value="send">
			<input type="reset" class="btn btn-success" value="reset">
		</div>
		</form>
	</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>