package com.jnit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.xml")
				.addAnnotatedClass(Employee1.class)
				.addAnnotatedClass(AccountNumber.class)
				.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		AccountNumber acc = new AccountNumber();
		acc.setId(12);
		acc.setAcc_num(2022);
		
		Employee1 e = new Employee1();
		e.setEid(102);
		e.setfName("Rahul");
		e.setLname("Kumar");
		e.setAcc(acc);
      
        session.save(e);
        session.save(acc);
        
        transaction.commit();
        
        session.close();
	}

}
