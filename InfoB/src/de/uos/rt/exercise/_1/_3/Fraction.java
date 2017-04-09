package de.uos.rt.exercise._1._3;

/**
 * 
 * @author Rene Sommerfeld
 * @author Tim Adam
 * 
 * Diese Klasse stellt einen mathematischen Bruch dar.
 */
public class Fraction {
	
	private int numerator;
	private int denominator;
	
	/**
	 * Konstruiert einen Bruch mit Zaehler
	 * <tt>numerator</tt> und dem Nenner <tt>denominator</tt>
	 * @param numerator der Zaehler des Bruches
	 * @param denominator der Nenner des Bruches
	 */
	public Fraction(int numerator, int denominator) {
		initialize(numerator, denominator);
	}
	
	/**
	 * Konstruiert einen Bruch mit dem Zaehler
	 * <tt>numerator</tt> und dem Nenner 1
	 * @param numerator der Zaehler des Bruches
	 */
	public Fraction(int numerator) {
		this(numerator, 1);
	}
	
	/**
	 * Initialisiert den Bruch mit dem Zaehler <tt>numerator</tt>
	 * und dem Nenner <tt> denominator</tt>. 
	 * @param numerator der Zaehler
	 * @param denominator der Nenner
	 */
	private void initialize(int numerator, int denominator) {
		if(denominator == 0) {
			throw new RuntimeException("Der Nenner darf nicht null sein");
		}
		int ggt = ggt(numerator, denominator);
		this.numerator = numerator / ggt;
		this.denominator = denominator / ggt;
	}

	/**
	 * Berechnet den groessten gemeinsamen Teiler 
	 * von zwei Zahlen <tt>a</tt> und <tt>b</tt>
	 * @param a - die erste Zahl
	 * @param b - die zweite Zahl
	 * @return der groesste gemeinsamte Teiler der beiden Zahlen
	 */
	private int ggt(int a, int b) {
		if(b == 0) {
			return a;
		}
		return ggt(b, a % b);
	}	
	
	/**
	 * Gibt den Zaehler des Bruches zurueck
	 * @return den Zaehler
	 */
	public int getNumerator() {
		return numerator;
	}
	
	/**
	 * Gibt den Nenner des Bruches zurueck
	 * @return den Nenner
	 */
	public int getDenominator() {
		return denominator;
	}
	
	/**
	 * Multipliziert den Bruch mit einer ganzen Zahl und gibt den
	 * resultierenden Bruch zurueck
	 * @param factor ein Ganzzahlfaktor
	 * @return der skalierte, mit <tt> factor</tt> multiplizierte Bruch
	 */
	public Fraction multiply(int factor) {
		return new Fraction(numerator * factor, denominator);
	}
	
	/**
	 * Multipliziert diesen Bruch mit einem anderen Bruch
	 * <tt>factor</tt> und liefert den resultierenden Bruch
	 * zurueck.
	 * @param factor der andere Bruch
	 * @return den resultierenden Bruch aus der Multiplikation
	 */
	public Fraction multiply(Fraction factor) {
		return new Fraction(numerator * factor.getNumerator(), 
				denominator * factor.getDenominator());
	}
	
	/**
	 * Multipliziert diesen Bruch mit einer Liste von mehreren
	 * Bruechen und liefert den resultierenden Bruch zurueck.
	 * @param factors die Liste der Faktoren
	 * @return den resultierenden Bruch aus der Multiplikation
	 */
	public Fraction multiply(Fraction... factors) {
		Fraction result = this;
		for(Fraction factor : factors) {
			result = result.multiply(factor);
		}
		return result;
	}
	
	/**
	 * Teilt diesen Bruch durch den uebergebenen Bruch
	 * <tt>divisor</tt> und liefert den resultierenden 
	 * Bruch aus der Division zurueck.
	 * @param divisor der Bruch durch den geteilt wird
	 * @return den resultierenden Bruch aus der Division
	 */
	public Fraction divide(Fraction divisor) {
		return new Fraction(numerator * divisor.getDenominator(), 
				denominator * divisor.getNumerator());
	}
	
	/**
	 * Gibt eine Stringrepresentation des Bruches zurueck
	 * @return die Stringrepresentation 
	 */
	public String toString() {
		return numerator + "/" + denominator;
	}
	

}
