package de.uos.rt.exercise._3._3;

public class Point2D extends Point {

	public Point2D(double x, double y) {
		super(2, x, y);
	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}

	@Override
	public double volume() {
		return 0;
	}

	@Override
	public Geometry encapsulate(Geometry paramGeometry) {
		return null;
	}
	
}