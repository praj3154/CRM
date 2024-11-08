package com.springboot.CRM.repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.springboot.CRM.entity.Customer;

public class Customersrepo{

	SessionFactory sf;
	
	
	

	public Customersrepo(SessionFactory factory) {
		super();
		this.sf = factory;
	}
	
@SuppressWarnings("deprecation")
public  String  insert (Customer customer) {
	
	   Session session =  sf.openSession();
	Transaction transaction  = session.beginTransaction();
	session.save(customer);
	transaction.commit();
	session.close();
		return "Customer inserted ";
	}
	
	
}
