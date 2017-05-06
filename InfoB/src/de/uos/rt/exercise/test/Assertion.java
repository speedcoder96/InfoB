package de.uos.rt.exercise.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Rene Sommerfeld
 * @author Tim Adam
 * 
 * The Assertion class is a singleton. It has a bunch of 
 * overloaded 'eval' methods that compare an expected value 
 * that should be the result, to an actual value that a 
 * specific method results in. If the two values are equal,
 * a test unit is marked as PASSED, otherwise as FAILED. 
 * If all test units are registered to this class the call of
 * the printSummary method provides the information about whether 
 * or not a test has passed and how many tests have passed.
 */
public class Assertion {

	/**
	 * Holds the singleton instance of this class
	 */
	private static Assertion instance;
	
	/**
	 * Holds each test that gets registered for evaluation
	 */
	private List<AssertionTest> tests;
	
	/**
	 * Holds the number of tests that have failed
	 */
	private int failedTestCount;

	private Assertion() {
		tests = new ArrayList<AssertionTest>();
		failedTestCount = 0;
	}
	
	/**
	 * Returns the singleton instance of the Assertion class
	 * @return the singleton instance of this class
	 */
	public static Assertion getInstance() {
		if(instance == null) {
			instance = new Assertion();
		}
		return instance;
	}
	
	/**
	 * Evaluates a test unit and registers it in the test unit list.
	 * @param name the name of the test unit
	 * @param expected the expected value of this test
	 * @param actual the actual value that a specific function, method results in
	 */
	public void eval(String name, boolean expected, boolean actual) {
		if(expected == actual) {
			registerTest(name, String.valueOf(expected), String.valueOf(actual), AssertionTest.STATUS_TEST_PASSED);
		} else {
			registerTest(name, String.valueOf(expected), String.valueOf(actual), AssertionTest.STATUS_TEST_FAILED);
		}
	}
	
	/**
	 * Evaluates a test unit and registers it in the test unit list.
	 * @param name the name of the test unit
	 * @param expected the expected value of this test
	 * @param actual the actual value that a specific function, method results in
	 */
	public void eval(String name, char expected, char actual) {
		if(expected == actual) {
			registerTest(name, String.valueOf(expected), String.valueOf(actual), AssertionTest.STATUS_TEST_PASSED);
		} else {
			registerTest(name, String.valueOf(expected), String.valueOf(actual), AssertionTest.STATUS_TEST_FAILED);
		}
	}
	
	/**
	 * Evaluates a test unit and registers it in the test unit list.
	 * @param name the name of the test unit
	 * @param expected the expected value of this test
	 * @param actual the actual value that a specific function, method results in
	 */
	public void eval(String name, byte expected, byte actual) {
		if(expected == actual) {
			registerTest(name, String.valueOf(expected), String.valueOf(actual), AssertionTest.STATUS_TEST_PASSED);
		} else {
			registerTest(name, String.valueOf(expected), String.valueOf(actual), AssertionTest.STATUS_TEST_FAILED);
		}
	}
	
	/**
	 * Evaluates a test unit and registers it in the test unit list.
	 * @param name the name of the test unit
	 * @param expected the expected value of this test
	 * @param actual the actual value that a specific function, method results in
	 */
	public void eval(String name, short expected, short actual) {
		if(expected == actual) {
			registerTest(name, String.valueOf(expected), String.valueOf(actual), AssertionTest.STATUS_TEST_PASSED);
		} else {
			registerTest(name, String.valueOf(expected), String.valueOf(actual), AssertionTest.STATUS_TEST_FAILED);
		}
	}
	
	/**
	 * Evaluates a test unit and registers it in the test unit list.
	 * @param name the name of the test unit
	 * @param expected the expected value of this test
	 * @param actual the actual value that a specific function, method results in
	 */
	public void eval(String name, int expected, int actual) {
		if(expected == actual) {
			registerTest(name, String.valueOf(expected), String.valueOf(actual), AssertionTest.STATUS_TEST_PASSED);
		} else {
			registerTest(name, String.valueOf(expected), String.valueOf(actual), AssertionTest.STATUS_TEST_FAILED);
		}
	}
	
	/**
	 * Evaluates a test unit and registers it in the test unit list.
	 * @param name the name of the test unit
	 * @param expected the expected value of this test
	 * @param actual the actual value that a specific function, method results in
	 */
	public void eval(String name, long expected, long actual) {
		if(expected == actual) {
			registerTest(name, String.valueOf(expected), String.valueOf(actual), AssertionTest.STATUS_TEST_PASSED);
		} else {
			registerTest(name, String.valueOf(expected), String.valueOf(actual), AssertionTest.STATUS_TEST_FAILED);
		}
	}
	
	/**
	 * Registers a test unit with the specified name, the actual and expected
	 * value to the test list.
	 * @param name the name of the test unit
	 * @param expected 
	 * @param actual
	 * @param status
	 */
	private void registerTest(String name, String expected, String actual, String status) {
		if(name == null) {
			name = "Test " + tests.size() + 1;
		}
		AssertionTest current = new AssertionTest(name);
		if(!status.equals(AssertionTest.STATUS_TEST_PASSED)) {
			failedTestCount++;
		}
		current.setExpectedValue(expected);
		current.setActualValue(actual);
		current.setStatus(status);
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
		for(AssertionTest test : tests) {
			System.out.println(test);
		}
		int testCount = tests.size();
		System.out.printf("%d/%d Tests passed! \n%d/%d Tests failed!", 
				testCount - failedTestCount, testCount, 
				failedTestCount, testCount);
	}
	
	
	
	
}