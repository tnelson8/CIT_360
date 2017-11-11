package com.jwt.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SimpleTest {

	public static void main(String[] args) {


		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();


		Student student1 = new Student();

		//First Record
		student1.setName("Anneke");
		student1.setRoll("90");
		student1.setPhone("2805553366");
		student1.setDegree("Communications");
		
		Student student2 = new Student();		
		//First Record
		student2.setName("Tyler");
		student2.setRoll("95");
		student2.setPhone("4805557736");
		student2.setDegree("CIT");
		Transaction tx = session.beginTransaction();
		session.save(student1);
		session.save(student2);
		System.out.println("Object saved successfully.....!!");
		tx.commit();
		session.close();
		factory.close();
		
	    Session session1 = factory.openSession();
	    Transaction tx1 = null;
	      
	      try {
	         tx1 = session1.beginTransaction();
	         List students = session1.createQuery("FROM Student").list(); 
	         for (Iterator iterator = students.iterator(); iterator.hasNext();){
	            Student student = (Student) iterator.next(); 
	            System.out.print("First Name: " + student.getName()); 
	            System.out.println("   Phone: " + student.getPhone()); 
	         }
	         tx1.commit();
	      } catch (HibernateException e) {
	         if (tx1!=null) tx1.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session1.close(); 
	      }
		
	}
}