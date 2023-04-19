<%@page import="org.hibernate.SessionFactory"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.query.Query"%>
<%@page import="com.hibernate.model.Notes"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.hibernate.helper.FactoryProvider"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%-- <%@page import="org.hibernate.SessionFactory"%>--%>
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
<title>Show All Notes</title>
</head>
<body>
	<div class="container mt-5">
		<h1 class="title">All Notes</h1>
		<div class="cards">

			<%
			//SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			SessionFactory factory = FactoryProvider.getFactory();
			Session s = factory.openSession();
			Query q = s.createQuery("from Notes",Notes.class);
			List<Notes> list = q.list();
			for (Notes notes : list) {
			%>
			<div class="card">
				<img src="img/note.png" class="card-img-top logo rounded mx-auto d-block" alt="">
				<div class="card-body">
					<h5 class="card-title"><%=notes.getTitle()%></h5>
					<p class="card-text"><%=notes.getContent()%></p>
					<h6 style="color:green;">Updated at: <%=notes.getCurrentDate() %> </h6>
					<a href="edit.jsp?note_id=<%=notes.getId() %>" class="btn btn-primary">Edit</a> 
					<a href="deleteServlet?note_id=<%=notes.getId() %>" class="btn btn-danger">Delete</a>
				</div>
			</div>


			<%
			}
			s.close();
			//FactoryProvider.closeFactory();
			%>
		</div>
	</div>
</body>
</html>