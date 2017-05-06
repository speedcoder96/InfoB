package de.uos.rt.exercise._3._3;

public class Rectangle extends ComparableGeometry {

	private Point2D bottomLeft;
	private Point2D topRight;
	
	public Rectangle(int dimension, Point2D bottomLeft, Point2D topRight) {
		super(dimension);
		this.bottomLeft = bottomLeft;
		this.topRight = topRight;
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
