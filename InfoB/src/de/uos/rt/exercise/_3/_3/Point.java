package de.uos.rt.exercise._3._3;

public class Point extends ComparableGeometry {
	
	private double[] values;

	public Point(int dimension, double... values) {
		super(dimension);
		this.values = values;
	}

	@Override
	public int compareTo(Object arg0) {
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
