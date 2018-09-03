package com.capgemini.day3.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day3.Employee;

class EmployeeTest {

Employee employee;
	
	@BeforeEach
	void setUp() {
		employee = new Employee(1234, "John Doe");
	}
	
	@Test
	void testSalaryCalculation() {
		assertEquals(18600,employee.salaryCalculation(10000,5000));
		//fail("Not yet implemented");
	}
	
	@AfterEach
	void tearDown() {
		employee = null;
	}
	

		
		
		
	}


