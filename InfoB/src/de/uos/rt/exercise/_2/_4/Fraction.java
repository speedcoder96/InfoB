package de.uos.rt.exercise._2._4;

/**
 * 
 * @author Rene Sommerfeld
 * @author Tim Adam
 * 
 * Diese Klasse stellt einen mathematischen Bruch dar.
 */

public class Fraction {
	
	private static final String REGEX_FRACTION_PATTERN = "-?(0|[1-9]\\d*/[1-9]\\d*)";
	
	private int numerator;
	private int denominator;
	
	/**
	 * Konstruiert einen Bruch mit Zaehler
	 * <tt>numerator</tt> und dem Nenner <tt>denominator</tt>
	 * @param numerator der Zaehler des Bruches
	 * @param denominator der Nenner des Bruches
	 */
	public Fraction(int numerator, int denominator) {
		if(denominator == 0) {
			throw new RuntimeException("Der Nenner darf nicht null sein");
		}
		int ggt = ggT(numerator, denominator);
		this.numerator = numerator / ggt;
		this.denominator = denominator / ggt;
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
	 * Berechnet den groessten gemeinsamen Teiler 
	 * von zwei Zahlen <tt>a</tt> und <tt>b</tt>
	 * @param a - die erste Zahl
	 * @param b - die zweite Zahl
	 * @return der groesste gemeinsamte Teiler der beiden Zahlen
	 */
	private int ggT(int a, int b) {
		if(b == 0) {
			return a;
		}
		return ggT(b, a % b);
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
	 * Addiert diesen Bruch mit einem anderen Bruch <tt> addend </tt>.
	 * @param addend der aufzuaddierende Bruch
	 * @return das Ergebnis aus der Addition
	 */
	public Fraction add(Fraction addend) {
		return new Fraction(numerator * addend.getDenominator() +
				addend.getNumerator() * denominator, 
				denominator * addend.getDenominator());
	}

	/**
	 * Subtrahiert einen anderen Bruch <tt>subtrahend</tt> von diesem Bruch.
	 * @param subtrahend der abzuziehende Bruch
	 * @return das Ergebnis aus der Subtraktion
	 */
	public Fraction substract(Fraction subtrahend) {
		return new Fraction(numerator * subtrahend.getDenominator() - 
				subtrahend.getNumerator() * denominator, 
				denominator * subtrahend.getDenominator());
	}

	/**
	 * Gibt eine Stringrepresentation des Bruches zurueck
	 * @return die Stringrepresentation 
	 */
	public String toString() {
		boolean sign = (numerator * denominator ) < 0;
		int numerator = (this.numerator < 0) ? 
				this.numerator * -1 : this.numerator;
		int denominator = (this.denominator < 0) ? 
				this.denominator * -1 : this.denominator;
		return ((sign) ? "-" : "") + (numerator + "/" + denominator);
	}
	
	/**
	 * Konstruiert eine Fraction Instanz aus dem uebergebenen String 
	 * <tt>fractionString</tt> und liefert diese zurueck. Bei fehlerhaften
	 * String ist das Ergebnis null.
	 * @param fractionString ein String der einen Bruch repraesentiert
	 * @return eine Fraction Instanz bei erfolgreicher Konstruktion, ansonsten
	 * null
	 */
	public static Fraction parseFraction(String fractionString) {
		if(fractionString.matches(REGEX_FRACTION_PATTERN)) {
			String[] fractionStringParts = fractionString.split("/");
			return new Fraction(Integer.parseInt(fractionStringParts[0]),
					Integer.parseInt(fractionStringParts[1]));
		}
		return null;
	}
	

}
