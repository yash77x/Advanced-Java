<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>temple</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Temple</a>
			<ul class=" navbar-nav nav justify-content-end">
				<li class="nav-item"><a class="nav-link " href="index.jsp">Home</a>
				</li>
				<li class="nav-item"><a class="nav-link " href="view">View</a>
				</li>

			</ul>
		</div>
	</nav>

	<div class="container">
		<h1>Enter Temple Details &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp; Total: ${total}</h1>
		<br>
		<form action="temple" method="post">
			<div class="form-group col-md-6 mb-4">
				<input class="form-control" type="text" name="name"
					placeholder="Temple Name" id="name" required>
			</div>

			<div class="col-md-6 mb-4">
				<label for="">Place</label> <select class="form-select" name="place"
					id="place" required>
					<option value=""></option>
					<option value="Hubli">Hubli</option>
					<option value="Dharwad">Dharwad</option>
					<option value="Chikkamagaluru">Chikkamagaluru</option>
					<option value="Bangalore">Bangalore</option>

				</select>
			</div>

			<div class="col-md-6 mb-4">
				<label for="">god</label> <select class="form-select" name="god"
					id="god" required>
					<option value=""></option>
					<option value="Hanuman">Hanuman</option>
					<option value="Krishna">Krishna</option>
					<option value="Shiv">Shiv</option>
					<option value="Ganesh">Ganesh</option>
				</select>
			</div>

			<div class="form-group col-md-6 mb-4">
				<input class="form-control" type="text" name="year"
					placeholder="Const Year" id="year" required>
			</div>

			<div class="form-group col-md-6 mb-4">
				<input class="form-control" type="text" name="const_by"
					placeholder="Const By" id="const_by" required>
			</div>

			<input type="submit" class="btn btn-primary" value="send"> <input
				type="reset" class="btn btn-primary" value="reset">

		</form>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>