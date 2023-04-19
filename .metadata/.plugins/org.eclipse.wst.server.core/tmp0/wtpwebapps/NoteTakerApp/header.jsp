<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<title>Header</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-primary bg-primary fixed-top">
		<div class="container-fluid">
			<a class="navbar-brand text-white" href="index.jsp">NoteTaker</a>
			
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active text-white"
						aria-current="page" href="showAllNotes.jsp">Show All Notes</a></li>
					<li class="nav-item"><a class="nav-link text-white" href="addNotes.jsp">Add Notes</a></li>
					
					<li class="nav-item"><a class="nav-link text-white" href="#"
						tabindex="-1" aria-disabled="false">Disabled</a></li>
				</ul>
				<form class="d-flex">
					<input class="form-control me-2" type="search" placeholder="Search"
						aria-label="Search">
					<button class="btn btn-outline-light" type="submit">Search</button>
				</form>
			</div>
		</div>
	</nav>
</body>
</html>