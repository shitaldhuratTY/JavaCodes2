package com.tyss.ustty.framework.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "employee_qualification")
public class EmployeeQualification {
	
	@Id
	@Column
	@GeneratedValue
	private int id;
	@JsonIgnore
	@OneToOne
	@JoinColumn(name="eid", referencedColumnName="id")
	
	private Employee employee;
	
	@Column
	private String qualification;
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	

}
