package com.spring.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.spring.hibernate.model.Certificate;
import com.spring.hibernate.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
        Student student =new Student();
        student.setName("Shubham Kumar");
        student.setPlace("Hyderabad");
        
        Certificate certificate=new Certificate("Java Expert","9 months");
        student.setCerti(certificate);
        
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.saveOrUpdate(student);
        
        tx.commit();
        session.close();
        factory.close();
        
    }
}
