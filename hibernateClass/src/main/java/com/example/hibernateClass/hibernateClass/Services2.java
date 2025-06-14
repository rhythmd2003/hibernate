/*
 * package com.example.hibernateClass.hibernateClass;
 * 
 * import java.util.List;
 * 
 * import org.hibernate.Session; import org.hibernate.SessionFactory; import
 * org.hibernate.Transaction; import org.hibernate.query.Query;
 * 
 * import com.example.hibernateClass.hibernateClass.Entities.Employee; import
 * com.example.hibernateClass.hibernateClass.utils.hibernateUtlis;
 * 
 * 
 * public class Services2 { SessionFactory
 * sessionFactory=hibernateUtlis.getSessionFactory();
 * 
 * public void saveData(Employee emp) { try(Session
 * session=sessionFactory.openSession()){ Transaction
 * tr=session.beginTransaction(); session.persist(emp); tr.commit(); } } public
 * Employee updateData(int id, Employee emp) { try(Session
 * session=sessionFactory.openSession()){ Transaction
 * tr=session.beginTransaction(); Employee
 * oldEmployee=session.get(Employee.class,id); if(oldEmployee!=null) {
 * oldEmployee.setName(emp.getName()); oldEmployee.setAge(emp.getAge());
 * oldEmployee=session.merge(oldEmployee); } tr.commit(); return oldEmployee;
 * 
 * }
 * 
 * } public List<Employee> getAllEmployees(){ try(Session
 * session=sessionFactory.openSession()){ Query<Employee> query
 * =session.createQuery("FROM Employee",Employee.class); return query.list(); }
 * } public Employee getEmpByName(String name) { try(Session
 * session=sessionFactory.openSession()){ } return null;
 * 
 * } }
 */