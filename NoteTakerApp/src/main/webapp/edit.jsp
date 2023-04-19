<%@page import="org.hibernate.Transaction"%>
<%@page import="com.hibernate.model.Notes"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.hibernate.helper.FactoryProvider"%>
<%@page import="org.hibernate.SessionFactory"%>
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
<title>Edit page</title>
</head>
<body>

<div class="container mt-5 pb-3">
	<h1 class="title">Add your notes</h1>
	<%
	int noteid=Integer.parseInt(request.getParameter("note_id").trim());
	SessionFactory factory=FactoryProvider.getFactory();
	Session s=factory.openSession();
	Transaction tx=s.beginTransaction();
	
	Notes notes= s.get(Notes.class, noteid);
	%>
	
	
	<form action="updateServlet" method="post">
	<input type="hidden" value="<%=notes.getId() %>" name="note_id" />
		<div class="mb-3">
			<label for="title" class="form-label">Title</label> 
			<input type="text" 
			class="form-control"
			id="title" 
			name="title"
			aria-describedby="emailHelp"
			placeholder="Enter Title" 
			required
			value="<%=notes.getTitle() %>">
			
		</div>
		<div class="mb-3">
			<label for="content" class="form-label">Content</label> 
			<textarea class="form-control"
			id="content" 
			name="content"
			rows="8"
			aria-describedby="emailHelp"
			placeholder="Write your content here" 
			required><%=notes.getContent()%></textarea>
			
		</div>
		<button type="submit" class="btn btn-success button">Update</button>
	</form>
	</div>
	<%
	
	tx.commit();
	s.close();
	%>
</body>
</html>