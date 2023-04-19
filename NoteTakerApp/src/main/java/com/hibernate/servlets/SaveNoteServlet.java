package com.hibernate.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.helper.FactoryProvider;
import com.hibernate.model.Notes;


public class SaveNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			PrintWriter out= response.getWriter();
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			Notes note=new Notes(title,content,new Date());
			System.out.println(note.getId()+" : "+note.getTitle());
			
			// Hibernate save query
			//SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			SessionFactory factory = FactoryProvider.getFactory();
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			
			session.persist(note);
			out.println("<h2 style='text-align:center;'>Note is Added Successfully</h2>");
			out.println("<h2 style='text-align:center;'><a href='showAllNotes.jsp'>View All Notes</a></h2>");
			tx.commit();
			session.close();
			//FactoryProvider.closeFactory();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
