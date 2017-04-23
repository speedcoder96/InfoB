package de.uos.rt.exercise._2._2;

/**
 * 
 * @author Rene Sommerfeld
 * @author Tim Adam
 */
public class StringStackTest {

	 public static void main(String[] args) {
	      StringStack original = new StringStack();
	      original.push("42");
	      original.push("43");
	      original.push("44");
	      original.push("45");
	      System.out.print("Original StringStack: ");
	      printStringStack(original);
	      StringStack copy = new StringStack(original);
	      System.out.print("Kopie StringStack: ");
	      printStringStack(copy);
	      System.out.println("Kopie 3x pop 2x push (42,42)");
	      copy.pop();
	      copy.pop();
	      copy.pop();
	      copy.push("42");
	      copy.push("42");
	      System.out.print("Original StringStack: ");
	      printStringStack(original);
	      System.out.print("Kopie StringStack: ");
	      printStringStack(copy);
	      System.out.println("Deep-Copy: Original sollte sein: 42,43,44,45 und Kopie: 42,42,42");
	   }

	   public static void printStringStack(StringStack stack) {
	      StringStack temp = new StringStack();
	      while(!stack.empty()){
	         temp.push(stack.peek());
	         System.out.print(stack.peek() + " ");
	         stack.pop();
	      }
	      while(!temp.empty()){
	         stack.push(temp.peek());
	         temp.pop();
	      }
	      System.out.println();
	   }
	
}
