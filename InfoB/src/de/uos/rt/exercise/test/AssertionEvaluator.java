package de.uos.rt.exercise.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Rene Sommerfeld
 * @author Tim Adam
 * 
 * The TestUnitEvaluator class is a singleton. It has a bunch of 
 * overloaded 'eval' methods that compare an expected value 
 * that should be the result, to an actual value that a 
 * specific method results in. If the two values are equal,
 * a test unit is marked as PASSED, otherwise as FAILED. 
 * If all test units are registered to this class the call of
 * the printSummary method provides the information about whether 
 * or not a test has passed and how many tests have passed.
 */
public class AssertionEvaluator {

	/**
	 * Holds the singleton instance of this class
	 */
	private static AssertionEvaluator instance;
	
	/**
	 * Holds each test that gets registered for evaluation
	 */
	private List<Assertion> tests;
	
	/**
	 * Holds the number of tests that have failed
	 */
	private int failedTestCount;

	private AssertionEvaluator() {
		tests = new ArrayList<Assertion>();
		failedTestCount = 0;
	}
	
	/**
	 * Returns the singleton instance of the Assertion class
	 * @return the singleton instance of this class
	 */
	public static AssertionEvaluator getInstance() {
		if(instance == null) {
			instance = new AssertionEvaluator();
		}
		return instance;
	}
	
	/**
	 * Evaluates a test unit and registers it in the test unit list
	 * by calling evaluate method with the specific parameters types
	 * and a null value for the test unit name
	 * @param expected the expected value of this test
	 * @param actual the actual value that a specific function, method results in
	 */
	public void eval(boolean expected, boolean actual) {
		eval(null, expected, actual);
	}
	
	/**
	 * Evaluates a test unit and registers it in the test unit list.
	 * @param name the name of the test unit
	 * @param expected the expected value of this test
	 * @param actual the actual value that a specific function, method results in
	 */
	public void eval(String name, boolean expected, boolean actual) {
		if(expected == actual) {
			registerTest(name, String.valueOf(expected), String.valueOf(actual), 
					Assertion.STATUS_TEST_PASSED, null);
		} else {
			registerTest(name, String.valueOf(expected), String.valueOf(actual), 
					Assertion.STATUS_TEST_FAILED, Assertion.STATUS_EXTRA_VALUE_MISMATCH);
		}
	}
	
	/**
	 * Evaluates a test unit and registers it in the test unit list
	 * by calling evaluate method with the specific parameters types
	 * and a null value for the test unit name
	 * @param expected the expected value of this test
	 * @param actual the actual value that a specific function, method results in
	 */
	public void eval(char expected, char actual) {
		eval(null, expected, actual);
	}
	
	/**
	 * Evaluates a test unit and registers it in the test unit list.
	 * @param name the name of the test unit
	 * @param expected the expected value of this test
	 * @param actual the actual value that a specific function, method results in
	 */
	public void eval(String name, char expected, char actual) {
		if(expected == actual) {
			registerTest(name, String.valueOf(expected), String.valueOf(actual), 
					Assertion.STATUS_TEST_PASSED, null);
		} else {
			registerTest(name, String.valueOf(expected), String.valueOf(actual), 
					Assertion.STATUS_TEST_FAILED, Assertion.STATUS_EXTRA_VALUE_MISMATCH);
		}
	}
	
	/**
	 * Evaluates a test unit and registers it in the test unit list
	 * by calling evaluate method with the specific parameters types
	 * and a null value for the test unit name
	 * @param expected the expected value of this test
	 * @param actual the actual value that a specific function, method results in
	 */
	public void eval(char[] expected, char[] actual) {
		eval(null, expected, actual);
	}
	
	/**
	 * Evaluates a test unit and registers it in the test unit list.
	 * @param name the name of the test unit
	 * @param expected the expected value of this test
	 * @param actual the actual value that a specific function, method results in
	 */
	public void eval(String name, char[] expected, char[] actual) {
		if(expected != null && actual != null) {
			if(expected.length == actual.length) {
				for(int i = 0; i < expected.length; i++) {
					if(expected[i] != actual[i]) {
						registerTest(name, buildCharArrayString(expected),
								buildCharArrayString(actual), Assertion.STATUS_TEST_FAILED, 
								Assertion.STATUS_EXTRA_VALUE_MISMATCH);
						return;
					}
				}
				registerTest(name, buildCharArrayString(expected),
						buildCharArrayString(actual), Assertion.STATUS_TEST_PASSED, null);
			} else {
				registerTest(name, null, null, Assertion.STATUS_TEST_FAILED, 
						Assertion.STATUS_EXTRA_ARRAY_LENGTH_MISMATCH);
			}
		} else {
			registerTest(name, null, null, Assertion.STATUS_TEST_FAILED,
					Assertion.STATUS_EXTRA_NULL);
		}
	}
	
	/**
	 * Evaluates a test unit and registers it in the test unit list
	 * by calling evaluate method with the specific parameters types
	 * and a null value for the test unit name
	 * @param expected the expected value of this test
	 * @param actual the actual value that a specific function, method results in
	 */
	public void eval(byte expected, byte actual) {
		eval(null, expected, actual);
	}
	
	/**
	 * Evaluates a test unit and registers it in the test unit list.
	 * @param name the name of the test unit
	 * @param expected the expected value of this test
	 * @param actual the actual value that a specific function, method results in
	 */
	public void eval(String name, byte expected, byte actual) {
		if(expected == actual) {
			registerTest(name, String.valueOf(expected), String.valueOf(actual), 
					Assertion.STATUS_TEST_PASSED, null);
		} else {
			registerTest(name, String.valueOf(expected), String.valueOf(actual), 
					Assertion.STATUS_TEST_FAILED, Assertion.STATUS_EXTRA_VALUE_MISMATCH);
		}
	}
	
	/**
	 * Evaluates a test unit and registers it in the test unit list
	 * by calling evaluate method with the specific parameters types
	 * and a null value for the test unit name
	 * @param expected the expected value of this test
	 * @param actual the actual value that a specific function, method results in
	 */
	public void eval(short expected, short actual) {
		eval(null, expected, actual);
	}
	
	/**
	 * Evaluates a test unit and registers it in the test unit list.
	 * @param name the name of the test unit
	 * @param expected the expected value of this test
	 * @param actual the actual value that a specific function, method results in
	 */
	public void eval(String name, short expected, short actual) {
		if(expected == actual) {
			registerTest(name, String.valueOf(expected), String.valueOf(actual), 
					Assertion.STATUS_TEST_PASSED, null);
		} else {
			registerTest(name, String.valueOf(expected), String.valueOf(actual), 
					Assertion.STATUS_TEST_FAILED, Assertion.STATUS_EXTRA_VALUE_MISMATCH);
		}
	}
	
	/**
	 * Evaluates a test unit and registers it in the test unit list
	 * by calling evaluate method with the specific parameters types
	 * and a null value for the test unit name
	 * @param expected the expected value of this test
	 * @param actual the actual value that a specific function, method results in
	 */
	public void eval(int expected, int actual) {
		eval(null, expected, actual);
	}
	
	/**
	 * Evaluates a test unit and registers it in the test unit list.
	 * @param name the name of the test unit
	 * @param expected the expected value of this test
	 * @param actual the actual value that a specific function, method results in
	 */
	public void eval(String name, int expected, int actual) {
		if(expected == actual) {
			registerTest(name, String.valueOf(expected), String.valueOf(actual), 
					Assertion.STATUS_TEST_PASSED, null);
		} else {
			registerTest(name, String.valueOf(expected), String.valueOf(actual), 
					Assertion.STATUS_TEST_FAILED, Assertion.STATUS_EXTRA_VALUE_MISMATCH);
		}
	}
	
	/**
	 * Evaluates a test unit and registers it in the test unit list
	 * by calling evaluate method with the specific parameters types
	 * and a null value for the test unit name
	 * @param expected the expected value of this test
	 * @param actual the actual value that a specific function, method results in
	 */
	public void eval(int[] expected, int[] actual) {
		eval(null, expected, actual);
	}
	
	/**
	 * Evaluates a test unit and registers it in the test unit list.
	 * @param name the name of the test unit
	 * @param expected the expected value of this test
	 * @param actual the actual value that a specific function, method results in
	 */
	public void eval(String name, int[] expected, int[] actual) {
		if(expected != null && actual != null) {
			if(expected.length == actual.length) {
				for(int i = 0; i < expected.length; i++) {
					if(expected[i] != actual[i]) {
						registerTest(name, buildIntArrayString(expected),
								buildIntArrayString(actual), Assertion.STATUS_TEST_FAILED, 
								Assertion.STATUS_EXTRA_VALUE_MISMATCH);
						return;
					}
				}
				registerTest(name, buildIntArrayString(expected),
						buildIntArrayString(actual), Assertion.STATUS_TEST_PASSED, null);
			} else {
				registerTest(name, null, null, Assertion.STATUS_TEST_FAILED, 
						Assertion.STATUS_EXTRA_ARRAY_LENGTH_MISMATCH);
			}
		} else {
			registerTest(name, null, null, Assertion.STATUS_TEST_FAILED,
					Assertion.STATUS_EXTRA_NULL);
		}
	}
	
	/**
	 * Evaluates a test unit and registers it in the test unit list
	 * by calling evaluate method with the specific parameters types
	 * and a null value for the test unit name
	 * @param expected the expected value of this test
	 * @param actual the actual value that a specific function, method results in
	 */
	public void eval(long expected, long actual) {
		eval(null, expected, actual);
	}
	
	/**
	 * Evaluates a test unit and registers it in the test unit list.
	 * @param name the name of the test unit
	 * @param expected the expected value of this test
	 * @param actual the actual value that a specific function, method results in
	 */
	public void eval(String name, long expected, long actual) {
		if(expected == actual) {
			registerTest(name, String.valueOf(expected), String.valueOf(actual), 
					Assertion.STATUS_TEST_PASSED, null);
		} else {
			registerTest(name, String.valueOf(expected), String.valueOf(actual), 
					Assertion.STATUS_TEST_FAILED, Assertion.STATUS_EXTRA_VALUE_MISMATCH);
		}
	}
	
	
	
	/**
	 * Registers a test unit with the specified name, the actual and expected
	 * value to the test list.
	 * @param name the name of the test unit
	 * @param expected the expected value of this test
	 * @param actual the actual value that a specific function, method results in
	 * @param status the evaluated status of this test
	 */
	private void registerTest(String name, String expected, String actual, String status, String extra) {
		if(name == null) {
			name = "Test " + (tests.size() + 1);
		}
		Assertion current = new Assertion(name);
		if(!status.equals(Assertion.STATUS_TEST_PASSED)) {
			failedTestCount++;
		}
		current.setExpectedValue(expected);
		current.setActualValue(actual);
		current.setStatus(status);
		current.setStatusExtra(extra);		
		tests.add(current);
	}
	
	/**
	 * Prints a summary of all tests including the amount of
	 * tests that have passed or failed.
	 */
	public void printSummary() {
		if(tests.size() == 0) {
			System.out.println("There is no test to evaluate!");
			return;
		}
		for(Assertion test : tests) {
			System.out.println(test);
		}
		int testCount = tests.size();
		System.out.printf("%d/%d Tests passed! \n%d/%d Tests failed!", 
				testCount - failedTestCount, testCount, 
				failedTestCount, testCount);
	}
	
	/**
	 * Builds a string representation of the specified array
	 * @param array the array to get the string representation from
	 * @return the string representation
	 */
	private String buildCharArrayString(char[] array)  {
		String arrayString = "";
		for(int i = 0; i < array.length; i++) {
			if(i != array.length - 1) {
				arrayString += array[i] + ",";
			} else {
				arrayString += array[i];
			}
		}
		return arrayString;
	}
	
	/**
	 * Builds a string representation of the specified array
	 * @param array the array to get the string representation from
	 * @return the string representation
	 */
	private String buildBooleanArrayString(boolean[] array)  {
		String arrayString = "";
		for(int i = 0; i < array.length; i++) {
			if(i != array.length - 1) {
				arrayString += array[i] + ",";
			} else {
				arrayString += array[i];
			}
		}
		return arrayString;
	}
	
	/**
	 * Builds a string representation of the specified array
	 * @param array the array to get the string representation from
	 * @return the string representation
	 */
	private String buildIntArrayString(int[] array)  {
		String arrayString = "";
		for(int i = 0; i < array.length; i++) {
			if(i != array.length - 1) {
				arrayString += array[i] + ",";
			} else {
				arrayString += array[i];
			}
		}
		return arrayString;
	}
	
	
	
}