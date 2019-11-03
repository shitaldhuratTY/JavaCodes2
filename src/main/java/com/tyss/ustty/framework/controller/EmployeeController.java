package com.tyss.ustty.framework.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.ustty.framework.dto.Employee;
import com.tyss.ustty.framework.dto.EmployeeResponce;
import com.tyss.ustty.framework.service.EmployeeService;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;

	@GetMapping(path = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponce getEmployee(@RequestParam("id") int id) {
		Employee employee = service.getEmployee(id);	
		EmployeeResponce response = new EmployeeResponce();
		if (employee == null) {
			response.setStatusCode(401);
			response.setMessage("Falure");
			response.setDescription("No data found");
			
			
		} else {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data found");
			response.setEmployees(Arrays.asList(employee));

		}
		return response;
	}
	
	@GetMapping(path = "/get-all", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployee(){
		return service.getAllEmployee();
		
	}
	
	@PostMapping(path = "/add", produces = MediaType.APPLICATION_JSON_VALUE,
							   consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponce addEmployee(@RequestBody Employee employee) {
		//Employee employee = service.addEmployee(employee);	
		EmployeeResponce response = new EmployeeResponce();
		if (service.addEmployee(employee)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data added into the db");
			response.setEmployees(Arrays.asList(employee));
			
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not added into the db");
			

		}
		return response;

	}
	@PutMapping(path = "/modify", produces = MediaType.APPLICATION_JSON_VALUE,
			 					  consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponce modifyEmployee(@RequestBody Employee employee) {
	//	Employee employee = service.modifyEmployee(employee);	
		EmployeeResponce response = new EmployeeResponce();
		if (service.modifyEmployee(employee)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data modified");
			response.setEmployees(Arrays.asList(employee));
			return response;
			
			
		} else {
			
			response.setStatusCode(401);
			response.setMessage("Falure");
			response.setDescription("No data found");
			return response;
		}
	}
	
	@DeleteMapping(path = "/remove/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponce removeEmployee(@PathVariable("id") int id) {
	
		EmployeeResponce response = new EmployeeResponce();
		if (service.removeEmployee(id)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data found");
			
			
		} else {
			response.setStatusCode(401);
			response.setMessage("Falure");
			response.setDescription("No data found");
			//response.setEmployees(Arrays.asList(employee));

		}
		return response;
		
	}
	
	@GetMapping(path = "/get-name", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getEmployeeByName(@RequestParam("name")String name){
		return service.getEmployeeByName(name);
	}
	
	@GetMapping(path="/error")
	public EmployeeResponce error() throws Exception{
		throw new Exception();
	}
}
