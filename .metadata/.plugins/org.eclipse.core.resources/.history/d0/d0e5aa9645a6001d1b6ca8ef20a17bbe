package com.hibernate.pagination;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class App 
{
    @SuppressWarnings({ "deprecation", "unchecked" })
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        // Refer the hibernate.cfg.xml
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");                                          
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                                                     
        // SessionFactory will contain all the database property
        // details which are pulled from above hibernate.cfg.xml file
        // As application refers the database, it is required.
        // It is a threadsafe object
        SessionFactory factory = configuration.buildSessionFactory(builder.build());
        
        Session session=factory.openSession();
        Query query = session.createNativeQuery("select * from Student");
        
        //Implementing pagination using Hibernate
        List<Object[]> list = query
        		.setFirstResult(0)
        		.setMaxResults(3)
        		.getResultList();
        
        /*for (Object[] student : list) {
			System.out.println(Arrays.toString(student));
		}*/
        list.forEach(s -> System.out.println(Arrays.toString(s)));  
         
        session.close();
        factory.close();
        
    }
}
