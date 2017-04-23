package de.uos.rt.exercise._2._1;

/**
 * 
 * @author Rene Sommerfeld
 * @author Tim Adam
 * 
 * 
 *
 */
public class CompanyTest {

	public static void main(String[] args) {
		
		Company c = new Company("Weyhland Yutani");
		Company d = new Company("Umbrella");
		Company e = new Company("Dharma");
				
		c.changeStockPrice(528);
		d.changeStockPrice(491);
		e.changeStockPrice(28);
		
		e = null;
		System.gc(); //Garbage Collector hat e aufgeraeumt	
		
	}
	
}
