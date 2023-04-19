package com.hibernate.nativesql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate.nativesql.model.Student;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
        // Refer the hibernate.cfg.xml
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
 
        // SessionFactory will contain all the database property
        // details which are pulled from above hibernate.cfg.xml file
        // As application refers the database, it is required.
        // It is a threadsafe object
        SessionFactory factory = configuration.buildSessionFactory(builder.build());
        
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        
        // SQL query
        String query="select * from Student";
              
        Query nativeQuery =session.createNativeQuery(query);
        List<Object[]> list=nativeQuery.list();
        for (Object[] student : list) {
			System.out.println(Arrays.toString(student));
			System.out.println(student[4]+" : "+student[3]);
		}
        
       
        tx.commit();
        session.close();
        factory.close();
    }
}
