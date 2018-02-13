package com.psl.demo.testing;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.psl.demo.Calculator;

public class TestCalculator {

	static Calculator cal=null;
	
	@BeforeClass
	public static void setUp() {
		// TODO Auto-generated method stub

		cal=new Calculator();
	}
	
	@Test
	public void testAdd() {
		// TODO Auto-generated method stub
      
		int actual=cal.add(10,10);
		
		Assert.assertEquals(20, actual);
		  
	}
	
	@Test
	public void testDivide() {
		// TODO Auto-generated method stub
		int actual=cal.divide(10,10);
		
		Assert.assertEquals(1, actual);
		  
	}
	@AfterClass
	public static void tearDown() {
		// TODO Auto-generated method stub

	}
	

}
