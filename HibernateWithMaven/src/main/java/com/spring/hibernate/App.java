package com.spring.hibernate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.spring.hibernate.model.Address;
import com.spring.hibernate.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException,IOException
    {
        System.out.println( "Hello World!" );
        //Configuration cfg=new Configuration();
        //cfg.configure("hibernate.cfg.xml").buildSessionFactory();
        
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        System.out.println(factory);
        System.out.println(factory.getCache());
        System.out.println(factory.isOpen());
        
        //creating Student object
        Student student=new Student();
        student.setName("Himanshu Kumar");
        student.setCity("Gaya");
        System.out.println(student);
                
        
        //creating Address object
        Address address=new Address();
        //address.setAddressId(105);
        address.setStreet("Kavadiguda");
        address.setCity("Hyderabad");
        address.setOpen(true);
        address.setX(123.56774773727);
        address.setAddedDate(new Date());
        
        //Reading image
        FileInputStream fis=new FileInputStream("src/main/java/cast-iron-grill-peacock-500x500.jpg");
        byte [] data=new byte[fis.available()];
        fis.read(data);
        //address.setImage(data);
        
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.saveOrUpdate(student);
        session.saveOrUpdate(address);
        
        //get(),load()
        System.out.println("====================================================================");
        Student std=(Student)session.get(Student.class,1);
        System.out.println(std);
        System.out.println("====================================================================");
        
        Address ads=(Address)session.load(Address.class, 1);
        //System.out.println(ads);//if we don't call its method then the load method won't call the select query from database
        System.out.println("====================================================================");
        
        tx.commit();
        session.close();
        factory.close();
    }
}
