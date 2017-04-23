package de.uos.rt.exercise._2._1;

/**
 * 
 * @author Rene Sommerfeld
 * @author Tim Adam
 */
public class Ticker {
	
	private static Ticker instance;
	
	private Ticker() {
		
	}
	
	public static Ticker getInstance() {
		if(instance == null) {
			instance = new Ticker();
		}
		return instance;
	}
	
	public void print(String text) {
		System.out.print("+++" + text.replace("\n", ""));
	}

}
