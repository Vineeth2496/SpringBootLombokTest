package com.SpringBootLombok.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Employee {
	private Integer empId;
	private String empName;
	private Double empSal;
	
}
