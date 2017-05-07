package de.uos.rt.exercise.test;

/**
 * 
 * @author Rene Sommerfeld
 * @author Tim Adam
 * @version 1.0 07.05.2017 
 * 
 * Defines an object pool containing one instance that is used for testing
 * on null values with the eval method (params Object Object) of the AssertionEvaluator.
 * The NullAssertion should only be used for the expected parameter of eval method.
 */
public class NullAssertion {

	public static final NullAssertion NULL_VALUE = new NullAssertion();
	
	private NullAssertion() {
		
	}
	
}
