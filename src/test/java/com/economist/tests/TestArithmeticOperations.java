package com.economist.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.economist.arithmetic.ArithmeticOperations;

public class TestArithmeticOperations {
	
	@Test(enabled=true)		//to disable the test, change the value to false i.e. enabled=false
	public void testAddition() {
		//calling methods to get the result as actual value and then performing assertion
		
		Assert.assertEquals(ArithmeticOperations.add(16,8), 24);
		Assert.assertEquals(ArithmeticOperations.add(2.41,8.82), 11.23);
		Assert.assertEquals(ArithmeticOperations.add(-3,-4), -7);
		Assert.assertEquals(ArithmeticOperations.add(-20.12,3.1), -17.02);
		Assert.assertEquals(ArithmeticOperations.add(0,87), 87);
	}
	
	@Test(enabled=true)
	public void testSubtraction() {
		Assert.assertEquals(ArithmeticOperations.sub(24,8), 16);
		Assert.assertEquals(ArithmeticOperations.sub(11.23,8.82), 2.41);
		Assert.assertEquals(ArithmeticOperations.sub(-3,-4), 1);
		Assert.assertEquals(ArithmeticOperations.sub(-20.12,3.18), -23.3);
		Assert.assertEquals(ArithmeticOperations.sub(0,87), -87);
	}
	
	@Test(enabled=true)
	public void testMultiplication() {
		Assert.assertEquals(ArithmeticOperations.mul(9,8), 72);
		Assert.assertEquals(ArithmeticOperations.mul(2.4,8.8), 21.12);
		Assert.assertEquals(ArithmeticOperations.mul(-6,-2), 12);
		Assert.assertEquals(ArithmeticOperations.mul(-2,32.6), -65.2);
		Assert.assertEquals(ArithmeticOperations.mul(0,78), 0);
	}
	
	@Test(enabled=true)
	public void testDivision() {
		Assert.assertEquals(ArithmeticOperations.div(18,6), 3);
		Assert.assertEquals(ArithmeticOperations.div(-3,-4), 0.75);
		Assert.assertEquals(ArithmeticOperations.div(5,-10), -0.5);
		Assert.assertEquals(ArithmeticOperations.div(87, Double.POSITIVE_INFINITY), 87);
		Assert.assertEquals(ArithmeticOperations.div(16,0), 24);
	}

}
