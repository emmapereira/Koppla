package junit.interval;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntervalTest {
//< >
/*
	@Test
	public void testConstructora() {
		Interval i = new Interval();

	}
	
	@Test
	public void testIniciPosterior() throws intervalIncorrecteException {
		Interval i = new Interval(20,5);
		boolean res = true;
		if(i.inici > i.final) res = false;
		assertFalse(res);
	}
	
	
	
	@Test
	public void testIniciNegatiu() throws intervalIncorrecteException {
		Interval i = new Interval(-2,12);
		boolean res = true;
		if(i.inici < 0 ) {
			res = false;
		}
		assertFalse(res);
	}
	
	@Test
	public void testIniciSuperior() throws intervalIncorrecteException{
		Interval i = new Interval(25,5);
		boolean res = true;
		if(i.inici > 23) {
			res = false;
		}
		assertFalse(res);
	}
	@Test
	public void testFinalNegatiu() throws intervalIncorrecteException{
		Interval i = new Interval(2,-2);
		boolean res = true;
		if(i.final < 0) {
			res = false;
		}
		assertFalse(res);
	}
*/
	@Test(expected = intervalIncorrecteException.class)
	public void testFinalSuperior() throws intervalIncorrecteException{
		Interval i = new Interval(2,25);
			
	}
	/**
	 * 1. testIniciPosterior(20,5) activa excepció 
	 * 2. 
	 * 
	 * 
	 */
	

}
