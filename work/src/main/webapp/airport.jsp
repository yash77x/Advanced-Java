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
				<li class="nav-item"><a class="nav-link active" href="#">Airport</a>
				</li>
			</ul>
		</div>
	</nav>

	<div class="container">
		<h1>Enter Airport Details</h1>
		<br>
		<form action="player" method="post">

			<div class="row">
				<div class="col-md-6 mb-4">
					<div class="form-outline">
						<input class="form-control" type="text" placeholder="Airport Name"
							name="name" id="name" required>
					</div>
				</div>
				<div class="col-md-6 mb-4">
					<div class="form-outline">
						<input class="form-control" type="text" placeholder="Type"
							name="type" id="type" required>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-md-6 mb-4">
					<div class="form-outline">
						<input class="form-control" type="text" placeholder="Country"
							name="country" id="country" required>
					</div>
				</div>
				<div class="col-md-6 mb-4">
					<div class="form-outline">
						<input class="form-control" type="text" placeholder="City"
							name="city" id="city" required>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-md-6 mb-4">
					<div class="form-outline">
						<input class="form-control" type="text" placeholder="Capacity"
							name="capacity" id="capacity" required>
					</div>
				</div>
				<div class="col-md-6 mb-4">
					<div class="form-outline">
						<input class="form-control" type="text" placeholder="Airport Width"
							name="width" id="width" required>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-md-6 mb-4">
					<div class="form-outline">
						<input class="form-control" type="text" placeholder="Total Terminal"
							name="terminal" id="terminal" required>
					</div>
				</div>
				<div class="col-md-6 mb-4">
					<div class="form-outline">
						<input class="form-control" type="text" placeholder="Runways"
							name="runway" id="runway" required>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-md-6 mb-4">
					<div class="form-outline">
						<input class="form-control" type="text"
							placeholder="Operational" name="operational" id="operational"
							required>
					</div>
				</div>
				<div class="col-md-6 mb-4">
					<div class="form-outline">
						<input class="form-control" type="text" placeholder="Inaugrated by"
							name="inaug" id="inaug" required>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-md-6 mb-4">
					<div class="form-outline">
				&ensp;	<label> Open Date</label>
						<input class="form-control" type="date" placeholder="DOB"
							name="date" id="date" required>
					</div>
				</div>
				
			</div>

<br>
			<input type="submit" class="btn btn-primary" value="send"> 
			<input type="reset" class="btn btn-success" value="reset">

		</form>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>