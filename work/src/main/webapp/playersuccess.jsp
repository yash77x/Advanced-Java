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
				<li class="nav-item"><a class="nav-link" href="index.html">Home</a>
				</li>
				<li class="nav-item"><a class="nav-link active" href="#">Player
						Success</a></li>
				<li class="nav-item"><a class="nav-link" href="player.html">Player</a>
				</li>
			</ul>
		</div>
	</nav>

	<div class="container">
		<h1>Player Details Submitted Successfully</h1>
		<br>
		<h3>Player Name: ${playername}</h3>
		<h3>Sport Name: ${sport}</h3>
		<h3>Country: ${country}</h3>
		<h3>Jersey No.: ${jersey}</h3>
		<h3>Mother Name: ${mother}</h3>
		<h3>Father Name: ${father}</h3>
		<h3>Captain Name: ${captain}</h3>
		<h3>Coach Name: ${coach}</h3>
		<h3>Maritial Status: ${maritial}</h3>
		<h3>Wife Name: ${wife}</h3>
		<h3>Date of Birth: ${dob}</h3>
		<h3>Age: ${age}</h3>
		<h3>Gender: ${gender}</h3>
		<h3>Alive: ${alive}</h3>

	</div>

</body>
</html>