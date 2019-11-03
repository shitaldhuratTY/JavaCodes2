package com.tyss.mywebapp.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.mywebapp.dto.EmployeeInfoBean;
import com.tyss.mywebapp.servlet.DeleteEmployeeServlet;

public class EmployeeDAOJpaImpl implements EmployeeDAO {
	
	//EmployeeDAO dao = new EmployeeDAOJpaImpl();

	@Override
	public EmployeeInfoBean login(int empId, String password) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Employee");
		EntityManager manager = factory.createEntityManager();
		EmployeeInfoBean empBean = null;
		
		
		String jpaQuery = "from EmployeeInfoBean where empId = :id and password = :pwd";
		Query query = manager.createQuery(jpaQuery);
		query.setParameter("id", empId);
		query.setParameter("pwd", password);
		
		try {
			empBean = (EmployeeInfoBean) query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		 return empBean;
	}// End of login()
	
	@Override
	public EmployeeInfoBean searchEmployee(int id) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Employee");
		EntityManager manager = factory.createEntityManager();
		EmployeeInfoBean empBean = null;
		try {
			empBean = manager.find(EmployeeInfoBean.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
return empBean;
}

@Override
public boolean insertEmp(EmployeeInfoBean emp) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("Employee");
	EntityManager manager= factory.createEntityManager();
	EntityTransaction transaction=null;
	try {
	transaction=manager.getTransaction();
	transaction.begin();
	manager.persist(emp);
	transaction.commit();
	}catch (Exception e) {
		manager.close();
	e.printStackTrace();
	}
	return true;

}

	@Override
	public  EmployeeInfoBean deleteEmployee(int id) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Employee");
		EntityManager em= emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
		EmployeeInfoBean employeeInfoBean = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			transaction.begin();
			
			employeeInfoBean = em.find(EmployeeInfoBean.class, id);
			em.remove(employeeInfoBean);
			System.out.println("data deleted");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employeeInfoBean;
	}
	
	@Override
	public  EmployeeInfoBean updateEmployee(int id) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Employee");
		EntityManager em= emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
		EmployeeInfoBean employeeInfoBean = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			transaction.begin();
			
			employeeInfoBean = em.find(EmployeeInfoBean.class, id);
			//em.setName(employeeInfoBean);
			//em.setProperty(propertyName, value);
			System.out.println("data deleted");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employeeInfoBean;
	}
	
	@Override
	public void addEmployee(EmployeeInfoBean bean) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Employee");
		EntityManager em= emf.createEntityManager();
		EntityTransaction transaction=null;
		try {
		transaction=em.getTransaction();
		transaction.begin();
		em.persist(bean);
		transaction.commit();
		}catch (Exception e) {
			em.close();
		e.printStackTrace();
		}
		
		
	}

}
