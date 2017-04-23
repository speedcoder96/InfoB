package de.uos.rt.exercise._1._3;

/**
 * 
 * @author Rene Sommerfeld
 * @author Tim Adam
 * 
 * Testklasse fuer die Fraction Klasse.
 */
public class FractionTest {


	public static void main(String[] args) {
		
		
		//Bruch 2 / 4 
		System.out.println("Erzeuge Bruch");
		Fraction f = new Fraction(2, 4);
		System.out.println("Soll : 1/2");
		System.out.println("Ist : " + f);
				
		//Bruch 1 / 2 multipliziert mit 6 -> 6 / 2 -> 3 / 1
		System.out.println("Multipliziere Bruch mit Skalar");
		System.out.println("Soll : 3/1");
		System.out.println("Ist : " + f.multiply(6));
		
		//Bruch 5/7 * 1/2 = 5/14
		System.out.println("Multipliziere Bruch mit anderen Bruch");
		Fraction g = new Fraction(5, 7);
		System.out.println("Soll : 5/14");
		System.out.println("Ist : " + g.multiply(f));
		
		System.out.println("Multipliziere Bruch mit meheren Bruechen");
		Fraction h = new Fraction(4, 5);
		System.out.println("Soll : 4/5 * 3/2 --> 12/10 --> 6 / 5 * 6 / 9 --> 36/45 ---> 4 / 5");
		System.out.println("Ist : " + h.multiply(new Fraction(3, 2), new Fraction(6, 9)));
		
		
		System.out.println("Teile Bruch durch einen anderen Bruch");
		Fraction i = new Fraction(8, 7);
		System.out.println("Soll: 4/5 / 8/7 = 4/5 * 7/8 = 28/40 --> 7/10");
		System.out.println("Ist : " + h.divide(i));
		
		
		
		
	}
	

	
	
	
}
