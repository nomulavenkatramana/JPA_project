package com.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entities.Customer;
import com.entities.Employee;
import com.test1.CRUDEmp;

public class JPAClient {

	public static void main(String[] args) {
		CRUDEmp crude=new CRUDEmp();
		CRUDServices crud=new CRUDServices();
		
		
//		System.out.println(crud.getCustomerByName("jagan"));
		
		Customer cust=new Customer();
//		cust.setAddress("karchi");
//		cust.setName("Varun");
//		cust.setMobile(7598461235l);
		
//		crud.insertCustomer(cust);
		
//		crud.updateCustomerById(4,759846123);
		
//		crud.deleteCustomer(5);
		
//		System.out.println(crud.getCustomer(4));
		
//		System.out.println(crud.getCustomer());
//		System.out.println(crud.getCustomerByLetter());
		System.out.println(crud.getCustomerContainsLetters());
		
//		Employee e=new Employee();
//		e.setAddress("Uppal");
//		e.setDepId(2);
//		e.setId(10);
//		e.setName("Shyam");
//		e.setSalary(300000);
//		
//		crude.insertEmployee(e);
		
//		crude.updateEmployeeById(10,"BodUppal");
		
//		System.out.println(crude.getEmployeeById(10));
		
//		System.out.println(crude.getEmployee());
		
//		crude.deleteEmployee(10);
	}

}
