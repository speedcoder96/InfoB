package de.uos.rt.exercise._3._3;

import de.uos.rt.exercise.test.AssertionEvaluator;

public class GeometryTest {

	public static void main(String[] args) {
		testPointVolume();
		AssertionEvaluator.getInstance().printSummary();
	}
	
	private static void testPointVolume() {
		Point p = new Point(1, 3, 4, 5);
		AssertionEvaluator.getInstance().eval(0, p.volume());
	}
	
	private static void testPoint2DVolume() {
		Point2D p2D = new Point2D(2, 3);
	}
	
}
