package com.junit.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntervalTest {

	@Test
	public void testConstructora() throws intervalIncorrecteException {
		Interval i = new Interval(3,8);
		assertTrue(i.getIni() == 3 && i.getFin() == 8);
	}
	
	@Test (expected=intervalIncorrecteException.class)
	public void testIniciGran() throws intervalIncorrecteException {
		Interval i = new Interval(23,2);
			
	}
	
	
	/**
	 * 1. testIniciPosterior(20,5) activa excepció 
	 * 2. testIniciNegatiu(-2,12) activa excepció 
	 * 3. testIniciSuperior(
	 * 
	 */
}