package com.junit.demo;


public class Calculator {
		
	public double sum(double a, double b) {
		  return a + b;
	}
		  
	public double substract(double a, double b) throws CantSubstractException {
		  if (a<b) {
			  throw new CantSubstractException();
		  }
		  return a-b; 
	}
	
	public double multiply(double a, double b) {
		  return a * b;
	}
		  
	public double divide(double a, double b) { 
		  if(b == 0) {
		   throw new ArithmeticException();
		  }
		  return a / b;
	} 
	
	/*public double factorial(int a) {
		int aux = 1;
		if (a == 0) return 1;
		else if (a < 0) throw new NumNegatiu();
		else {
			for (int j = 1; j <= 1; j++) aux *= j;
		}
		return aux;
	}*/
}
