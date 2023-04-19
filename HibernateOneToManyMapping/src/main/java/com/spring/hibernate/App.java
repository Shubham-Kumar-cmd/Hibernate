package com.spring.hibernate;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.spring.hibernate.model.Question;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
        //Sending data to the database
        
        //creating Question object
        /*Question question=new Question();
        question.setQuestionId(20);
        question.setQuestion("What is abc?");
        
        //creating Answer object
        Answer a1=new Answer();
        a1.setAnswerId(43);
        a1.setAnswer("abc is character of alphabet");
        a1.setQuestion(question);
        
        Answer a2=new Answer();
        a2.setAnswerId(44);
        a2.setAnswer("abc is a word");
        a2.setQuestion(question);
        
        Answer a3=new Answer();
        a3.setAnswerId(45);
        a3.setAnswer("abc can be arranges itself");
        a3.setQuestion(question);


        List<Answer> list=new ArrayList<Answer>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        question.setAnswer(list);
        
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(question);
        
        session.save(a1);//we can use @OneToMany(cascade = CascadeType.ALL) to avoid to save operation to the corresponding Question
        session.save(a2);
        session.save(a3);*/
        
        //fetching data from database
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        
        Question q= session.get(Question.class,15);
        System.out.println("Question : "+q.getQuestion());
        
        System.out.println("First Level Caching happening here");
        
        //First Level Caching happening here
        Question q1= session.get(Question.class,15);
        System.out.println("Question : "+q1.getQuestion());
        
        System.out.println("First Level Caching happening or not"+session.contains(q1));//it will return true if the data is by default stored in Cache
        
        //EAGER and LAZY loading
        /*System.out.println("Answer is");
        for(Answer a:q.getAnswer()) {
        	System.out.println(a.getAnswer());
        }
        System.out.println(q.getAnswer().size());*/
        
        
        // HQL query
        // join query(i.e, join the 2 table and extracting data from that table)
        String query="select q.question,q.questionId,a.answer from Question as q INNER JOIN q.answer as a";
        Query joinQuery=session.createQuery(query);
        
        List<Object []>listJoinQuery= joinQuery.getResultList();
        for (Object[] objects : listJoinQuery) {
			System.out.println(Arrays.toString(objects));
		}
        
        tx.commit();
        session.close();
        factory.close();
        System.out.println("main method over");
    }
}
