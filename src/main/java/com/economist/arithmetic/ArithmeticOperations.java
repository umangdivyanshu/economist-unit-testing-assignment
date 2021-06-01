package com.economist.arithmetic;

public class ArithmeticOperations {
	
	//takes two double values as parameters and return the result after performing addition
	public static double add(double num1, double num2) {
		double result = num1+num2;
		return result;
	}
	
	//takes two double values as parameters and return the result after performing subtraction
	public static double sub(double num1, double num2) {
		double result = num1-num2;
		return result;
	}
	
	//takes two double values as parameters and return the result after performing multiplication
	public static double mul(double num1, double num2) {
		double result = num1*num2;
		return result;
	}
	
	//takes two double values as parameters and return the result after performing division
	public static double div(double num1, double num2) {
		Double d1 = num1;
		Double d2 = num2;
		
		//checking if numbers are finite or not, if its infinite then an exception will be thrown
		if(d1.isInfinite() || d2.isInfinite()) {
			
			throw new IllegalArgumentException("Cannot accept infinity as argument");
			
		}else if(d1 == 0 || d2 == 0) {			
			//checking if any number is zero, if yes then an exception will be thrown
			throw new IllegalArgumentException("Cannot accept zero as argument");
			
		}else {
			
			double result = d1/d2;
			return result;
			
		}
	}

}
