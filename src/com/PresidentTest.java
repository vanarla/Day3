package com.capgemini.day3.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day3.President;

class PresidentTest {

	@Test
	void test() {
		assertEquals(5564.0,President.calSalary(2500 , 8),1);
	}

}
