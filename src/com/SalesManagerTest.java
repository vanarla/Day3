package com.capgemini.day3.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day3.SalesManager;

class SalesManagerTest {

	@Test
	void testCalSalesManager() {
		assertEquals(4100.0,SalesManager.calSalary(2500),1);
	}

}
