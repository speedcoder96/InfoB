package de.uos.rt.exercise._3._3;

public abstract class Geometry {
	
	private int dimension;

	public Geometry(int dimension) {
		if (dimension < 2) {
			throw new RuntimeException("dimension is < 2");
		}
		this.dimension = dimension;
	}

	public int dimensions() {
		return dimension;
	}

	public abstract double volume();
	public abstract Geometry encapsulate(Geometry paramGeometry);

}
