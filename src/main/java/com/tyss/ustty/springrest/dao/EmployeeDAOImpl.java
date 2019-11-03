package com.tyss.ustty.springrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.tyss.ustty.springrest.dto.Employee;

import net.bytebuddy.asm.Advice.ArgumentHandler.Factory;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
	
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addEmployee(Employee employee) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
		manager.persist(employee);
		transaction.commit();
		return true;
		}catch(Exception e) {
		return false;
		}
	}


	@Override
	public boolean removeEmployee(int id) {
		EntityManager manager= factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Employee employee = manager.find(Employee.class, id);
		if (employee == null) {
			return false;
		}
		manager.remove(employee);
		transaction.commit();
		return true;
	}

	@Override
	public boolean modifyEmployee(Employee employee) {
		EntityManager manager= factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Employee emp = manager.find(Employee.class, employee.getId());
		emp.setName(employee.getName());
		emp.setPassword(employee.getPassword());
		emp.setDob(employee.getDob());
		transaction.commit();
		return true;
	}

	@Override
	public Employee getEmployee(int id) {
		EntityManager manager= factory.createEntityManager();
		return manager.find(Employee.class, id);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployee() {
		String jpql = "From Employee";
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery(jpql);
		return (List<Employee>)query.getResultList();
	}


	
	

}
