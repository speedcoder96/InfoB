package de.uos.rt.exercise._1._2;

/**
 * 
 * @author Rene Sommerfeld
 * @author Tim Adam
 *
 */
public class FibonacciPrint {
	
	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci();
		if(args.length != 0) {
			int n = Integer.parseInt(args[0]);
			if(n >= 0) {
				System.out.println(String.format("|%3s|%8s|", " n ", "  f(n)  "));
				System.out.println("+---+--------+");
				System.out.println(String.format("|%3d|%8d|", 0, 0));
				if(n >= 1) {
					System.out.println(String.format("|%3d|%8d|", 1, 1));
				}
				for(int i = 2; i <= n; i++) {
					int next = fib.next();
					System.out.println(String.format("|%3d|%8d|", i, next));
				}
			} else {
				System.out.println("Eingabe darf nicht negativ sein");
			}
		} else {
			System.out.println("Keine Zahl eingegeben");
		}
		
	}
	
	
	
}
