package de.uos.rt.exercise.test;

/**
 * 
 * @author Rene Sommerfeld
 * @author Tim Adam
 * 
 * This class declares a test unit case. It holds information
 * such as the name of the test, the expected value a certain 
 * test should have, and the actual value that is being calculated 
 * in run time. Each test gets created by the Assertion class, which
 * also evaluates them.
 */
public class AssertionTest {
	/**
	 * Status for a passed test unit
	 */
	public static final String STATUS_TEST_PASSED = "PASSED";
	/**
	 * Status for a failed test unit
	 */
	public static final String STATUS_TEST_FAILED = "FAILED";

	/**
	 * Replacement tag for the name of the test unit in toString
	 * method
	 */
	private static final String NAME_TAG = "[name]";
	
	/**
	 * Replacement tag for the expected value of the test unit in toString
	 * method
	 */
	private static final String EXPECTED_TAG = "[exp]";
	
	/**
	 * Replacement tag for the actual value of the test unit in toString
	 * method
	 */
	private static final String ACTUAL_TAG = "[act]";
	
	/**
	 * Replacement tag for the status of the test unit in toString
	 * method
	 */
	private static final String STATUS_TAG = "[stat]";
	
	/**
	 * Defines the format of the string that toString method returns
	 */
	private static final String TOSTRING_FORMAT = "Test: \t" +	NAME_TAG + "\n" + 
			"Exp.:\t"  + EXPECTED_TAG + " \n" + 
			"Act.:\t" + ACTUAL_TAG + "\n" + 
			"Status:\t" + STATUS_TAG + "\n";
	
	/**
	 * the name of the test unit
	 */
	private String name;
	/**
	 * the string representation of the expected value 
	 */
	private String expectedValue;
	/**
	 * the string representation of the actual value
	 */
	private String actualValue;
	/**
	 * the string representation of the status of the test unit
	 */
	private String status;
	
	/**
	 * Creates a named test unit
	 * @param name the name of the test unit
	 */
	public AssertionTest(String name) {
		this.name = name;
	}
	
	/**
	 * Sets the string representation of the expected value
	 * @param expectedValue the string representation of the expected value
	 */
	public void setExpectedValue(String expectedValue) {
		this.expectedValue = expectedValue;
	}
	
	/**
	 * Sets the string representation of the actual value
	 * @param actualValue the string representation of the actual value
	 */
	public void setActualValue(String actualValue) {
		this.actualValue = actualValue;
	}
	
	/**
	 * Sets the string representation of the status
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	/**
	 * Returns the string representation of this test instance in the 
	 * defined format of @see{Test.TOSTRING_FORMAT}
	 */
	@Override
	public String toString() {
		String nameTag = (name != null) ? name : NAME_TAG;
		String expectedTag = (expectedValue != null) ? expectedValue : EXPECTED_TAG;
		String actualTag = (actualValue != null) ? actualValue : ACTUAL_TAG;
		String statusTag = (status != null) ? status : STATUS_TAG;
		return TOSTRING_FORMAT
				.replace(NAME_TAG, nameTag)
				.replace(EXPECTED_TAG, expectedTag)
				.replace(ACTUAL_TAG, actualTag)
				.replace(STATUS_TAG, statusTag);
	}
	
}
