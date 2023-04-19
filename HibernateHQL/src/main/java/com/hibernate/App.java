package com.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate.model.Certificate;
import com.hibernate.model.Student;

public class App 
{
    @SuppressWarnings({ "deprecation", "rawtypes", "unchecked" })
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
         // save query
         Certificate certi=new Certificate("python","1.75 months");
         Student student =new Student(378,"chirag","mumbai",certi);
        
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(student);
        
        //HQL syntax
        
        // show query
        //String query="from Student";
        //String query="from Student where place='Hyderabad'";
        //String query="from Student where place=:x";
        String query="from Student as s where s.place=:x and s.name=:n";
        Query showQuery=session.createQuery(query);
        
        showQuery.setParameter("x", "patna");
        showQuery.setParameter("n", "shyam");
        
        List<Student> list=showQuery.list();
        for (Student student2 : list) {
			System.out.println(student2.getName()+" : "+student2.getCerti().getCourse());
		}
        
        
       
        // delete query
        Query deleteQuery=session.createQuery("delete from Student as s where s.name=:n and s.place=:p");
        
        deleteQuery.setParameter("n", "john");
        deleteQuery.setParameter("p", "india");
        
        int r=deleteQuery.executeUpdate();
        System.out.println("deleted "+r);
        
        
        // update query
        Query updateQuery=session.createQuery("update Student as s set s.place=:p where s.name=:n and s.id=:i");
        
        updateQuery.setParameter("p","gaya");
        updateQuery.setParameter("n","shyam");
        updateQuery.setParameter("i","1247");
        
        int s=updateQuery.executeUpdate();
        System.out.println("updated "+s);
        
        // join query execute when mapping happens
        
        tx.commit();
        session.close();
        factory.close();
    }
}
