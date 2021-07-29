package com.lti.demo;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd1() {
		int res = new Calculator().add(10, 20);
		assertEquals(30, res);
	
	}
	
	
	@Test
	public void testAdd2() {
		int res = new Calculator().add(-10, 20);
		assertEquals(10, res);
	
	}
	
	@Test
	public void testProd1() {
		int res = new Calculator().prod(1, 20);
		assertEquals(20, res);
	
	}
	
	@Test
	public void testProd2() {
		int res = new Calculator().prod(3, 20);
		assertEquals(60, res);
	
	}
	
	

}
