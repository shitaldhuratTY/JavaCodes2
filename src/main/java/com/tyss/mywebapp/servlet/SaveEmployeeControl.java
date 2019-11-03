package com.tyss.mywebapp.servlet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tyss.mywebapp.dto.EmployeeInfoBean;

public class SaveEmployeeControl {
	
	private static SessionFactory sessionFactory;
	
	private Session getSession() {
		Session s = null;
		try {
			sessionFactory = new Configuration().configure("com\\xml\\hibernate.cfg.xml").buildSessionFactory();
			s= sessionFactory.openSession();
		} catch (HibernateException e) {
			
			System.out.println(e.getMessage());
		}
		return s;
	} 
	public  void addNewEmployee(int empId, String empName, int age, double salary, String designation) throws Exception{
		try {
			Session s = getSession();

		
			Transaction tx = (Transaction) s.beginTransaction();
			EmployeeInfoBean emp = new EmployeeInfoBean();
			
			emp.setEmpId(empId);
			emp.setEmpName(empName);
			emp.setAge(age);
			emp.setSalary(salary);
			emp.setDesignation(designation);
			s.save(emp);
			
			tx.commit();
			System.out.println("\n\n Details Added \n");
			
			
		} catch (HibernateException e) {
			System.out.println(e.getMessage());
			System.out.println("error");
		
		}
	}

}
