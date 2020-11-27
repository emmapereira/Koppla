package com.junit.demo;

public class Interval {
	private int ini;
	private int fin;
	
	public Interval(int ini, int fin) throws intervalIncorrecteException {
		this.ini = ini;
		this.fin = fin;
		
		if (ini > fin) throw new intervalIncorrecteException();
		
	}
	
	public int getIni() {
		return this.ini;
	}

	public int getFin() {
		return this.fin;
	}
}
