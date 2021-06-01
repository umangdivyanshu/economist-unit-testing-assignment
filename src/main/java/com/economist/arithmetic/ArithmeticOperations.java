package com.economist.arithmetic;

public class ArithmeticOperations {
	
	public static double add(double num1, double num2) {
		double result = num1+num2;
		return result;
	}
	
	
	public static double sub(double num1, double num2) {
		double result = num1-num2;
		return result;
	}
	
	
	public static double mul(double num1, double num2) {
		double result = num1*num2;
		return result;
	}
	
	
	public static double div(double num1, double num2) {
		Double d1 = num1;
		Double d2 = num2;
		
		if(d1.isInfinite() || d2.isInfinite()) {
			
			throw new IllegalArgumentException("Cannot accept infinity as argument");
			
		}else if(d1 == 0 || d2 == 0) {
			
			throw new IllegalArgumentException("Cannot accept zero as argument");
			
		}else {
			
			double result = d1/d2;
			return result;
			
		}
	}

}
