package de.uos.rt.exercise.test;

/**
 * 
 * @author Rene Sommerfeld
 * @author Tim Adam
 * @version 1.0 07.05.2017 
 * 
 * This class declares a test unit case (Assertion). It holds information
 * such as the name of the test, the expected value a certain 
 * test should have, and the actual value that is being calculated 
 * in run time. Each test gets created by the Assertion class, which
 * also evaluates them.
 * 
 * 
 */
public class Assertion {
	/**
	 * Status for a passed test unit
	 */
	public static final String STATUS_TEST_PASSED = "PASSED";
	/**
	 * Status for a failed test unit
	 */
	public static final String STATUS_TEST_FAILED = "FAILED";
	/**
	 * Status extra for array length mismatch of a failed test unit
	 */
	public static final String STATUS_EXTRA_ARRAY_LENGTH_MISMATCH = "ARRAY LENGTH MISMATCH";
	/**
	 * Status extra for value mismatch of a failed test unit
	 */
	public static final String STATUS_EXTRA_VALUE_MISMATCH = "VALUE MISMATCH";
	/**
	 * Status extra for null value of a failed test unit
	 */
	public static final String STATUS_EXTRA_NULL = "NULL VALUE";
	/**
	 * Status extra for a not equal value according to equals method
	 */
	public static final String STATUS_EXTRA_NOT_EQUAL = "NOT EQUAL ACCORDING TO EQUALS";
	/**
	 * Status extra for an equal value according to equals method
	 */
	public static final String STATUS_EXTRA_EQUAL = "EQUAL ACCORDING TO EQUALS";
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
	 * Replacement tag for the status extra of the test unit in toString
	 * method
	 */
	private static final String STATUS_EXTRA_TAG = "[ext]";
	
	/**
	 * Defines the format of the string that toString method returns
	 */
	private static final String TOSTRING_FORMAT = "Test: \t" +	NAME_TAG + "\n" + 
			"Exp.:\t"  + EXPECTED_TAG + " \n" + 
			"Act.:\t" + ACTUAL_TAG + "\n" + 
			"Status:\t" + STATUS_TAG + " ( " + STATUS_EXTRA_TAG + " )" + "\n";
	
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
	 * the string representation of the status of the test unit
	 */
	private String statusExtra;
	
	/**
	 * Creates a named test unit
	 * @param name the name of the test unit
	 */
	public Assertion(String name) {
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
	 * @param status the string representation of the status
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	/**
	 * Sets the string extra representation of the status
	 * @param statusExtra the string representation of the status extra
	 */
	public void setStatusExtra(String statusExtra) {
		this.statusExtra = statusExtra;
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
		String statusExtraTag = (statusExtra != null) ? statusExtra : "";
		return TOSTRING_FORMAT
				.replace(NAME_TAG, nameTag)
				.replace(EXPECTED_TAG, expectedTag)
				.replace(ACTUAL_TAG, actualTag)
				.replace(STATUS_TAG, statusTag)
				.replace(STATUS_EXTRA_TAG, statusExtraTag);
	}
	
}
