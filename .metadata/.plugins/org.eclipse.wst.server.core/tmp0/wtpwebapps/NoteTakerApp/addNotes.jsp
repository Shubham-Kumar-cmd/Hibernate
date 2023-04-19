<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
<title>Add Notes</title>
</head>
<body>

<div class="container mt-5 pb-3">
	<h1 class="title">Add your notes</h1>
	<form action="saveServlet" method="post">
		<div class="mb-3">
			<label for="title" class="form-label">Title</label> 
			<input type="text" 
			class="form-control"
			id="title" 
			name="title"
			aria-describedby="emailHelp"
			placeholder="Enter Title" 
			required>
			
		</div>
		<div class="mb-3">
			<label for="content" class="form-label">Content</label> 
			<textarea class="form-control"
			id="content" 
			name="content"
			rows="8"
			aria-describedby="emailHelp"
			placeholder="Write your content here" 
			required></textarea>
			
		</div>
		<button type="submit" class="btn btn-primary button">Save</button>
	</form>
	</div>
</body>
</html>