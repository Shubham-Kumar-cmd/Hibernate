package com.spring.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.spring.hibernate.model.Answer;
import com.spring.hibernate.model.Question;


public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
        //creating Question object
        Question question=new Question();
        //creating Answer object
        Answer answer=new Answer();
        question.setQuestionId(14);
        question.setQuestion("What is Java?");
        
        answer.setAnswerId(137);
        answer.setAnswer("Java is a programming language.");
        question.setAnswer(answer);
        System.out.println(question);
        
        //creating Question object
        Question q2=new Question();
        //creating Answer object
        Answer a2=new Answer();
        q2.setQuestionId(17);
        q2.setQuestion("What is Collection framework?");
        
        a2.setAnswerId(81);
        a2.setAnswer("API to work with objects in java");
        q2.setAnswer(a2);
        System.out.println(q2);
        
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(question);
        session.save(answer);
        session.save(q2);
        session.save(a2);
        
        tx.commit();
        session.close();
        factory.close();
    }
}
