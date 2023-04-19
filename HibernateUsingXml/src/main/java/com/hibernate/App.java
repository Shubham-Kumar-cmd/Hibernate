package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.Person;

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
        
        Person person =new Person(12,"Shubham kumar","Hyderabad",123456);
        
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(person);
        
        tx.commit();
        session.close();
        factory.close();
    }
}
