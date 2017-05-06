package de.uos.rt.exercise._3._1;

import de.uos.rt.exercise.test.Assertion;

/**
 * 
 * @author Rene Sommerfeld
 * @author Tim Adam
 */
public class PersonStudentTest {

	public static void main(String[] args) {
		//equals tests of Person
		testEqualsReflexivityPerson();
		testEqualsSymmetryPerson();
		testEqualsTransitivityPerson();
		testEqualsConsistencyPerson();
		testEqualsNullPerson();
		
		//hashCode tests of Person
		testHashcodeConsistencyPerson();
		testHashcodeOnEqualsTrue();
		
		//equals tests of Student
		testEqualsReflixivityStudent();
		testEqualsSymmetryStudent();
		testEqualsTransitivityStudent();
		testEqualsConsistencyStudent();
		testEqualsNullStudent();
		
		//special tests
		testEquals();
		
		
		Assertion.getInstance().printSummary();
	}


	private static void testEqualsReflexivityPerson() {
		Person p = new Person("Tim");
		Assertion.getInstance().eval("Person Reflexivity Test p.equals(p)", true, p.equals(p));
	}
	
	private static void testEqualsSymmetryPerson() {
		Person p = new Person("Tim");
		Person q = new Person("Tim");
		Assertion.getInstance().eval("Person Symmetry Test p.equals(q) <-> q.equals(p)",
				true, p.equals(q) && q.equals(p));
	}
	
	private static void testEqualsConsistencyPerson() {
		Person p = new Person("Tim");
		Person q = new Person("Tim");
		Assertion.getInstance().eval("Person Consistency Test 1 p.equals(q)", true, p.equals(q));
		Assertion.getInstance().eval("Person Consistency Test 2 p.equals(q)", true, p.equals(q));
		Assertion.getInstance().eval("Person Consistency Test 3 p.equals(q)", true, p.equals(q));
	}
	
	private static void testEqualsTransitivityPerson() {
		Person p = new Person("Tim");
		Person q = new Person("Tim");
		Person r = new Person("Tim");
		
		Assertion.getInstance().eval("Person Transitivity Test "
				+ "p.equals(q) && q.equals(r) <-> p.equals(r)", true, 
				(p.equals(q) && q.equals(r)) && p.equals(r));
	}
	
	private static void testEqualsNullPerson() {
		Person p = new Person("Tim");
		Assertion.getInstance().eval("Person Null Test p.equals(null)", false, p.equals(null));
	}
	
	private static void testHashcodeConsistencyPerson() {
		Person p = new Person("Tim");
		int firstHash = p.hashCode();
		int secondHash = p.hashCode();
		Assertion.getInstance().eval("Person Hashcode Consistency Test", firstHash, secondHash);
	}
	
	private static void testHashcodeOnEqualsTrue() {
		Person p = new Person("Tim");
		Person q = new Person("Tim");
		int hashP = p.hashCode();
		int hashQ = q.hashCode();
		Assertion.getInstance().eval("Hashcode on Equals p.equals(q)", true, p.equals(q));
		Assertion.getInstance().eval("Hashcode on Equals p.equals(q) -> hash(p) = hash(q)", hashP, hashQ);
	}
	
	private static void testEqualsReflixivityStudent() {
		Student s = new Student("Tim", 1);
		Assertion.getInstance().eval("Student Reflexivity Test s.equals(s)", true, s.equals(s));
	}
	
	private static void testEqualsSymmetryStudent() {
		Student s = new Student("Tim", 1);
		Student t = new Student("Tim", 1);
		Assertion.getInstance().eval("Student Symmetry Test s.equals(t) <-> t.equals(s)", true, 
				s.equals(t) && t.equals(s));
	}
	
	private static void testEqualsConsistencyStudent() {
		Student s = new Student("Tim", 1);
		Student t = new Student("Tim", 1);
		Assertion.getInstance().eval("Student Consistency Test 1 s.equals(t)", true, s.equals(t));
		Assertion.getInstance().eval("Student Consistency Test 2 s.equals(t)", true, s.equals(t));
		Assertion.getInstance().eval("Student Consistency Test 3 s.equals(t)", true, s.equals(t));
	}
	
	private static void testEqualsNullStudent() {
		Student s = new Student("Tim", 1);
		Assertion.getInstance().eval("Student Null Test s.equals(null)", false, s.equals(null));
	}
	
	private static void testEqualsTransitivityStudent() {
		Student p = new Student("Tim", 1);
		Student q = new Student("Tim", 1);
		Student r = new Student("Tim", 1);
		
		Assertion.getInstance().eval("Student Transitivity Test "
				+ "p.equals(q) && q.equals(r) <-> p.equals(r)", true, 
				(p.equals(q) && q.equals(r)) && p.equals(r));
	}
	
	private static void testEquals() {
		Person p = new Person("Tim");
		Student s = new Student("Tim", 5);
		Assertion.getInstance().eval("Person Tim equals Student Tim", true, p.equals(s));
	}
	
}
