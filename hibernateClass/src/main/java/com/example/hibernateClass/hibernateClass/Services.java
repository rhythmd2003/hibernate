package com.example.hibernateClass.hibernateClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.example.hibernateClass.hibernateClass.Entities.Employee;
import com.example.hibernateClass.hibernateClass.utils.hibernateUtlis;

public class Services {
	
	SessionFactory sessionFactory=  hibernateUtlis.getSessionFactory();
	
	public void saveData(Employee emp) {
		
		try(Session session=sessionFactory.openSession()){
			Transaction transaction=session.beginTransaction();
			session.persist(emp);
			transaction.commit();
		}
		
	}
	public Employee getById(int id) {
		try(Session session=sessionFactory.openSession()){
			Employee emp=session.get(Employee.class,id);
			return emp;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public Employee updateData(int id,Employee emp) {
		try(Session session=sessionFactory.openSession()) {
			Transaction tr=session.beginTransaction();
			Employee oldEmployee=session.get(Employee.class,id);
			if(oldEmployee!=null) {
				oldEmployee.setName(emp.getName());
				oldEmployee.setAge(emp.getAge());
				oldEmployee=session.merge(oldEmployee);
		}
			tr.commit();
			return oldEmployee;
			
		}		
		
	}
	public void deleteEmp(int id) {
		try(Session session=sessionFactory.openSession()){
			
			Transaction tr=session.beginTransaction();
			Employee emp=session.get(Employee.class,id);
			if(emp!=null) {
				session.remove(emp);
			}
		tr.commit();
		}
	}

}
