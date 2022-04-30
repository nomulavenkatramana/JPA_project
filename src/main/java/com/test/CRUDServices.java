package com.test;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.entities.Customer;
//import com.mysql.cj.Query;
public class CRUDServices{

	public static EntityManager getEntityManager() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("FirstJPA");
		EntityManager manager=factory.createEntityManager();
		return manager;
	}
	public void deleteCustomer(int id) {
	EntityManager manager=CRUDServices.getEntityManager();
	manager.getTransaction().begin();
	Customer c=manager.find(Customer.class, id);
	manager.remove(c);
	manager.getTransaction().commit();
	}
	
	public void insertCustomer(Customer custome) {
		EntityManager manager=CRUDServices.getEntityManager();
		manager.getTransaction().begin();
		manager.persist(custome);
		manager.getTransaction().commit();
	}
	
	public List<Customer> getCustomer(){
		EntityManager manager=CRUDServices.getEntityManager();
		Query query=manager.createNamedQuery("customer.findAll");
		//Query query = manager.createQuery("select c from Customer c");
		List<Customer> list=query.getResultList();
		return list;
	}
	
	public Customer getCustomer(int id) {
		EntityManager manager=CRUDServices.getEntityManager();
		return manager.find(Customer.class, id);
	}
	
	public Customer getCustomerByName(String name) {
		EntityManager manager=CRUDServices.getEntityManager();
		Query query=manager.createNamedQuery("customer.findByName");
		query.setParameter("name", name);
		return (Customer) query.getResultList();
	}
	
	public List<Customer> getCustomerByLetter(){
		EntityManager manager=CRUDServices.getEntityManager();
		Query query=manager.createNamedQuery("customer.nameStartsWithLetter");
		//Query query = manager.createQuery("select c from Customer c");
		
		return query.getResultList();
	}
	
	public List<Customer> getCustomerContainsLetters(){
		EntityManager manager=CRUDServices.getEntityManager();
		Query query=manager.createNamedQuery("customer.nameContainsLetters");
		//Query query = manager.createQuery("select c from Customer c");
		
		return query.getResultList();
	}
	
	public void updateCustomerById(int id,long mobile) {
		EntityManager manager=CRUDServices.getEntityManager();
		manager.getTransaction().begin();
		Customer c=manager.find(Customer.class, id);
		c.setMobile(mobile);
		manager.getTransaction().commit();
	}
}
