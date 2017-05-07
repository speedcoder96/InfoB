package de.uos.rt.exercise._3._3;

public class Point2D extends Point {
	
	public Point2D(double x, double y) {
		super(x, y);
	}

	@Override
	public double volume() {
		return 0;
	}

	@Override
	public Geometry encapsulate(Geometry paramGeometry) {
		if(dimensions() != paramGeometry.dimensions()) {
			return null;
		}
		return null;
	}
	
}