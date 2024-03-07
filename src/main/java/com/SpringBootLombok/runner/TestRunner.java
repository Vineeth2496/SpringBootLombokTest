package com.SpringBootLombok.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.SpringBootLombok.model.Employee;

@Component
public class TestRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		Employee e1=new Employee();
		e1.setEmpId(10);
		e1.setEmpName("Katherine");
		e1.setEmpSal(45.05);
		
		Employee e2=new Employee();
		e2.setEmpId(10);
		e2.setEmpName("Katherine");
		e2.setEmpSal(45.05);
		
		System.out.println(e1.equals(e2));	//	Compare data
		System.out.println(e1==e2);			//	Compare references
		//System.out.println(e1.hashCode());
		//System.out.println(e2.hashCode());
		
		System.out.println(e1.getEmpId());
		System.out.println(e1.getEmpName());
		System.out.println(e1.getEmpSal());

	}

}
