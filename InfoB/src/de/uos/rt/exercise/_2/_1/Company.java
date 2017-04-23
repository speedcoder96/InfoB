package de.uos.rt.exercise._2._1;

/**
 * 
 * @author Rene Sommerfeld
 * @author Tim Adam
 */
public class Company {

	private String name;
	private double stockPrice;
	
	public Company(String name) {
		this.name = name;
	}
	
	/**
	 * Aendert den Aktienpreis und gibt diesen ueber den Ticker aus
	 * @param stockPrice der neue Aktienpreis
	 */
	public void changeStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
		Ticker ticker = Ticker.getInstance();
		ticker.print(name + " " + stockPrice);
	}
	
	public double getStockPrice() {
		return stockPrice;
	}
	
	/**
	 * Dekonstruktor
	 */
	protected void finalize() {
		Ticker ticker = Ticker.getInstance();
		ticker.print(name + " is insolvent");
	}
	

	
}
