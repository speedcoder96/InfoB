package de.uos.rt.exercise._3._3;

public class Volume extends ComparableGeometry {

	private Point first;
	private Point second;
	
	public Volume(int dimension, Point first, Point second) {
		super(dimension);
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
