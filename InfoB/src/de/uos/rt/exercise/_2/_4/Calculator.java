package de.uos.rt.exercise._2._4;

public class Calculator {
	
	private static final int NUM_ARGUMENTS = 3;
	private static final String REGEX_OPERATOR_PATTERN = "'\\*'|/|\\+|-";
	private static final String MULTIPLICATION_SIGN = "'*'";
	private static final String ADDITION_SIGN = "+";
	private static final String SUBTRACTION_SIGN = "-";
	private static final String DIVISION_SIGN = "/";
	
	public static void main(String[] args) {
		if(args.length == NUM_ARGUMENTS) {
			String operator = args[1];
			if(operator.matches(REGEX_OPERATOR_PATTERN)) {
				Fraction first = Fraction.parseFraction(args[0]);
				Fraction second = Fraction.parseFraction(args[2]);
				if(first != null && second != null) {
					switch(operator) {
					case MULTIPLICATION_SIGN:
						System.out.println(first + " * " + second + " = " +  
								first.multiply(second));
						break;
					case DIVISION_SIGN:
						System.out.println(first + " / " + second + " = " + 
								first.divide(second));
						break;
					case SUBTRACTION_SIGN:
						System.out.println(first + " - " + second + " = " + 
								first.substract(second));
						break;
					case ADDITION_SIGN:
						System.out.println(first + " + " + second + " = " + 
								first.add(second));
						break;
					}
				} else {
					System.err.println("Eingabe der Brueche fehlerhaft!\n");	
					printOptions();
				}
			} else {
				System.err.println("Falscher Operator!\n");
				printOptions();
			}
		} else {
			System.err.println("Zu wenig/zu viel Argumente!\n");
			printOptions();
		}
	}
	
	private static void printOptions() {
		System.out.println("Geben Sie einen Bruch gefolgt von einen der\n"
				+ "gueltigen Operatoren '+ '*' - /' gefolgt von einem zweiten\n"
				+ "Bruch hintereinander ein! (Zwischen Bruch und Operator\n"
				+ "und dem anderen Bruch sind Leerzeichen zu setzen!)");
	}
}
