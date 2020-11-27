package com.junit.demo;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
 
public class CalculatorTest {
 
 private Calculator calc;
  
 @Before
 public void setUp() throws Exception {
  calc = new Calculator();
 }
 
 @After
 public void tearDown() throws Exception {
  calc = null;
 }
 
 @Test
 public void testSum() {
  double result = calc.sum(25, 100);
  assertEquals(125, result, 0);
 }
 
 @Test
 public void testSubstract() throws CantSubstractException {
  double result = calc.substract(10, 4);
  assertEquals(6, result, 0);
 }
 
 @Test(expected = CantSubstractException.class)
 public void testSubsException() throws CantSubstractException {
  calc.substract(15, 20);
 }
 
 @Test
 public void testMultiply() {
  double result = calc.multiply(2.5, 100);
  assertEquals(250, result, 0);
 }
 
 @Test
 public void testDivide() {
  double result = calc.divide(100, 10);
  assertEquals(10, result, 0);
   
 }
 
 @Test
 public void testDivideWithTolerance() {
  double result = calc.divide(345, 100);
  assertEquals(3.4, result, 0.1);
   
 }
  
 @Test(expected = ArithmeticException.class)
 public void testDivideByZero() {
  calc.divide(100.5, 0);
 }
 
 @Test
 public void testFactorialZero() throws NumNegatiu {
	 double resultat = calc.factorial(0);
	 assertEquals(1, resultat, 0);
 }
 
 @Test (expected = NumNegatiu.class) 
 public void testFactorialNegatiu() throws NumNegatiu {
	 calc.factorial(-1); 
 }
 
 @Test
 public void testFactorialNomral() throws NumNegatiu {
	 double resultat = calc.factorial(3);
	 assertEquals(6, resultat, 0);
 }
}

