package com.example.hibernateClass.hibernateClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.example.hibernateClass.hibernateClass.Entities.Employee;
import com.example.hibernateClass.hibernateClass.Entities.Loan;
import com.example.hibernateClass.hibernateClass.utils.hibernateUtlis;


public class App 
{
    public static void main( String[] args )
    {
		/*
		 * Employee emp=new Employee(); emp.setName("avinash"); emp.setAge(34);
		 * emp.setActive(false); emp.setAbout("dummy teacher");
		 * 
		 * //
		 */      
    	  Employee emp2=new Employee();
          emp2.setName("musl");
          emp2.setAge(14);
          emp2.setActive(true);
          emp2.setAbout("bawla");
          
          Loan loan1=new Loan();
          loan1.setLoan_amount(100000);
          loan1.setEmployee(emp2);
          
          Loan loan2=new Loan();
          loan2.setEmployee(emp2);
          loan2.setLoan_amount(450000);
          
          emp2.getLoan().add(loan1);
          emp2.getLoan().add(loan2);
          
         
//        
         // Session session=new hibernateUtlis().getSessionFactory().openSession();
          SessionFactory sessionFactory = hibernateUtlis.getSessionFactory();
          Services s=new Services();
          
          //s.saveData(emp2);
          Employee em=s.getById(2);
          System.out.println(em.getLoan());
      //    s.saveData(emp);
         // s.updateData(2,("pushpghy",65,false,"advnaced teacher"));
         // s.deleteEmp(1);s.deleteEmp(3);s.deleteEmp(4);s.deleteEmp(5);s.deleteEmp(12);s.deleteEmp(13);s.deleteEmp(2);
         // s.updateData(6, emp2);
          
//          Employee emp3=new Employee();
//           emp3= s.getById(6);
//        
//
//         System.out.println(emp3.getName());
//         System.out.println(emp3.getAge());
//         System.out.println(emp2.getName());

         
          
          
          /*Session session=sessionFactory.openSession();
          Transaction transaction=null;
          
          try {
        	  transaction=session.beginTransaction();
        	  session.persist(emp);
        	  transaction.commit();
        	  System.out.println("data saved succesfully ");
          }
          catch(Exception e) {
        	  if(transaction!=null) {
        		  transaction.rollback();
        	  }
        	  else {
        		  e.printStackTrace();
        	  }
        	  
          }
          finally{
        	  session.close();
        	  }
          
       //  System.out.println(session);*/

      
    }
}
