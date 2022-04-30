package com.test1;
import com.entities.Employee;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CRUDEmp {
public static EntityManager getEntityManager() {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("FirstJPA");
	EntityManager manager=factory.createEntityManager();
	return manager;
}
public void deleteEmployee(int id) {
	EntityManager manager=CRUDEmp.getEntityManager();
	manager.getTransaction().begin();
	Employee e=manager.find(Employee.class, id);
	manager.remove(e);
	manager.getTransaction().commit();
}
public void insertEmployee(Employee e) {
	EntityManager manager=CRUDEmp.getEntityManager();
	manager.getTransaction().begin();
	manager.persist(e);
	manager.getTransaction().commit();
}
public List<Employee> getEmployee(){
	EntityManager manager=CRUDEmp.getEntityManager();
	Query query=manager.createQuery("select e from Employee e");
	List<Employee> list=query.getResultList();
	return list;		
}

public Employee getEmployeeById(int id) {
	EntityManager manager=CRUDEmp.getEntityManager();
	return manager.find(Employee.class, id);
}

public void updateEmployeeById(int id,String address) {
	EntityManager manager=CRUDEmp.getEntityManager();
	manager.getTransaction().begin();
	Employee e=manager.find(Employee.class, id);
	e.setAddress(address);
	manager.getTransaction().commit();
}

}
