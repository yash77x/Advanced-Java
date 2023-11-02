<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
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
				<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="total">New</a></li>
			</ul>
		</div>
	</nav>

	<div class="container">
		<h1>Temple Details Submitted Successfully</h1>
		<br>
		<table class="table table-bordered">
			<tr>
				<th>Temple Name</th>
				<th>Place</th>
				<th>Main God</th>
				<th>Const_Year</th>
				<th>Const_by</th>
			</tr>
			<jstl:forEach items = "${group}" var='dto'>
			<tr>
				<td>${dto.name}</td>
				<td>${dto.place}</td>
				<td>${dto.god}</td>
				<td>${dto.year }</td>
				<td>${dto.const_by}</td>
			</tr>
			</jstl:forEach>
		</table>
	</div>

</body>
</html>