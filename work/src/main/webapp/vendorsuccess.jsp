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
				<li class="nav-item"><a class="nav-link active" href="#">Vendor
						Success</a></li>
				<li class="nav-item"><a class="nav-link" href="vendor.html">Vendor</a>
				</li>
			</ul>
		</div>
	</nav>

	<div class="container">
		<h1>Vendor Details Submitted Successfully</h1>
		<br>
		<h3>Vendor Name: ${vendorName}</h3>
		<h3>GST No.: ${gst}</h3>
		<h3>Owner: ${owner}</h3>
		<h3>Location: ${loc}</h3>>
	</div>

</body>
</html>