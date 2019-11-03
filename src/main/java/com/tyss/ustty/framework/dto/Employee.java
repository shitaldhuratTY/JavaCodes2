package com.tyss.ustty.framework.dto;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "employee_info")
public class Employee {
	
	@Id
	@Column
	@GeneratedValue
	private int id;

	@Column(nullable = false)
	@Exclude
	private String name;
	@Column
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date dob;
	@Column(unique = true, nullable = false)
	private String email;
	@Column
	private String password;
	
	@OneToOne(mappedBy="employee",cascade=CascadeType.ALL)      //one to one mapping
	private EmployeeQualification qualification;
	
	
	
	
	

}
