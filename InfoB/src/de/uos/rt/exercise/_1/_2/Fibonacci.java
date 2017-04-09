package de.uos.rt.exercise._1._2;

/**
 * 
 * @author Rene Sommerfeld
 * @author Tim Adam
 */
public class Fibonacci {

	private int previousNumber;
	private int prePreviousNumber;

	/**
	 * Konstruiert den Anfang der Fibonacci Folge.
	 * Zahl 0: 0 und Zahl 1: 1
	 */
	public Fibonacci() {
		prePreviousNumber = 0;
		previousNumber = 1;
	}
	
	/**
	 * Gibt die naechste Fibonacci Zahl der Folge zurueck.
	 * @return die naechste Fibonacci Zahl
	 */
	public int next() {
		int next = prePreviousNumber + previousNumber;
		prePreviousNumber = previousNumber;
		previousNumber = next;
		return next;
	}
	
}
