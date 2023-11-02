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
				<li class="nav-item"><a class="nav-link active" href="#">Player</a>
				</li>
			</ul>
		</div>
	</nav>

	<div class="container">
		<h1>Enter Player Details</h1>
		<br>
		<form action="player" method="post">

			<div class="row">
				<div class="col-md-6 mb-4">
					<div class="form-outline">
						<input class="form-control" type="text" placeholder="Name"
							name="name" id="name" required>
					</div>
				</div>
				<div class="col-md-6 mb-4">
					<div class="form-outline">
						<input class="form-control" type="text" placeholder="Sport Name"
							name="sport" id="sport" required>
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
						<input class="form-control" type="text" placeholder="Jersey No."
							name="jersey" id="jersey" required>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-md-6 mb-4">
					<div class="form-outline">
						<input class="form-control" type="text" placeholder="Mother Name"
							name="mother" id="mother" required>
					</div>
				</div>
				<div class="col-md-6 mb-4">
					<div class="form-outline">
						<input class="form-control" type="text" placeholder="father Name"
							name="father" id="father" required>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-md-6 mb-4">
					<div class="form-outline">
						<input class="form-control" type="text" placeholder="Captain Name"
							name="captain" id="captain" required>
					</div>
				</div>
				<div class="col-md-6 mb-4">
					<div class="form-outline">
						<input class="form-control" type="text" placeholder="Coach Name"
							name="coach" id="coach" required>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-md-6 mb-4">
					<div class="form-outline">
						<input class="form-control" type="text"
							placeholder="Maritial Status" name="maritial" id="maritial"
							required>
					</div>
				</div>
				<div class="col-md-6 mb-4">
					<div class="form-outline">
						<input class="form-control" type="text" placeholder="Wife Name"
							name="wife" id="wife" required>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-md-6 mb-4">
					<div class="form-outline">
						<input class="form-control" type="date" placeholder="DOB"
							name="dob" id="dob" required>
					</div>
				</div>
				<div class="col-md-6 mb-4">
					<div class="form-outline">
						<input class="form-control" type="text" placeholder="Age"
							name="age" id="age" required>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-md-6 mb-4">
                    <label>Gender</label>
					<select class="form-select" name="gender" id="gender">
						<option selected></option>
						<option value="1">Male</option>
						<option value="2">Female</option>
						<option value="3">Others</option>
					</select>
				</div>
				<div class="col-md-6 mb-4">
				    <label>Alive?</label>
					<select class="form-select" name="alive" id="alive">
						<option selected></option>
						<option value="1">Yes</option>
						<option value="2">No</option>
					</select>
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