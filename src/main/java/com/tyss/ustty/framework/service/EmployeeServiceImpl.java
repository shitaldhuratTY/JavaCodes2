package com.tyss.ustty.framework.service;

import java.util.List;

import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.tyss.ustty.framework.dto.Employee;
import com.tyss.ustty.framework.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository repository;

	//  Employee e=new Employee(18, "Sarikha", "12-02-1996", "sarika@gmail.com", "abcd", "BE");
	Employee e=Employee.builder().id(1).name("abc").email("abc.gmail.com").password("abc").build();		// return type of id, name is EmployeeBuilder
																										// Builder design pattern

	@Override
	public boolean addEmployee(Employee employee) {
		employee.getQualification().setEmployee(employee);
		repository.save(employee);
		return true;
	}

	@Override
	public boolean removeEmployee(int id) {
		repository.deleteById(id);
		return true;
	}

	@Override
	public boolean modifyEmployee(Employee employee) {
		repository.update(employee.getName(),employee.getPassword(),employee.getId());
		return true;
	}

	@Override
	public Employee getEmployee(int id) {

		//return repository.getOne(id);
		return repository.findById(id).get();
	}

	@Override
	public List<Employee> getAllEmployee() {

		return repository.findAll();
	}

	@Override
	public List<Employee> getEmployeeByName(String name) {

		return repository.findByName(name);
	}

}
