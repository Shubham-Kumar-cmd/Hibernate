package com.hibernate.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.caching.model.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
        Session session1=factory.openSession();
        //First time cache
        Student std1 = session1.get(Student.class, 18);
        System.out.println(std1);
        System.out.println(std1.getId()+" : "+std1.getName()+" : "+std1.getPlace()+" : "+std1.getCerti().getCourse()+" : "+std1.getCerti().getDuration());
        session1.close();
        
        Session session2=factory.openSession();
        //Second time cache
        Student std2 = session2.get(Student.class, 18);
        System.out.println(std2);
        System.out.println(std2.getId()+" : "+std2.getName()+" : "+std2.getPlace()+" : "+std2.getCerti().getCourse()+" : "+std2.getCerti().getDuration());
        session2.close();
    }
}
