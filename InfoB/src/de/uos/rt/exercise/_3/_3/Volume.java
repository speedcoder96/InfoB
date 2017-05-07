package de.uos.rt.exercise._3._3;

public class Volume extends ComparableGeometry {

	private Point x;
	private Point y;
	
	private Volume(int dimensions) {
		super(dimensions);
	}
	
	public Volume(Point x, Point y) {
		this(x.dimensions());
		checkDimensions(y);
	}
	
	private void checkDimensions(Point y) {
		if(dimensions() != y.dimensions()) {
			throw new RuntimeException("Dimension are not equal");
		}
		this.y = y;
	}
	
	public Point getX() {
		return x;
	}
	
	public Point getY() {
		return y;
	}

	@Override
	public int compareTo(Object other) {
		Volume otherVolume = (Volume)other;
		if(volume() > otherVolume.volume()) {
			return 1;
		} else if(volume() < otherVolume.volume()) {
			return -1;
		}
		return 0;
	}

	@Override
	public double volume() {
		double volume = 1;
		double[] xCoordinates = x.getCoordinates();
		double[] yCoordinates = y.getCoordinates();
		for(int dim = 0; dim < dimensions(); dim++) {
			volume *= yCoordinates[dim] - xCoordinates[dim];
		}
		return Math.abs(volume);
	}

	@Override
	public Geometry encapsulate(Geometry other) {
		if(other.dimensions() == dimensions()) {
			if(other instanceof Point) {
				return other.encapsulate(this);
			} else if (other instanceof Volume) {
				return findBiggestVolume((Volume)other);
			}
		}
		return null;
	}
	
	private Geometry findBiggestVolume(Volume other) {
		Volume a = new Volume(x, ((Volume)other).getX());
		Volume b = new Volume(y, ((Volume)other).getX());
		Volume c = new Volume(x, ((Volume)other).getY());
		Volume d = new Volume(y, ((Volume)other).getY());
		if(a.compareTo(b) >= 0) {
			if(a.compareTo(c) >= 0) {
				return a;
			}
			return c;
		}
		if(b.compareTo(d) >= 0) {
			return b;
		}
		return d;
	}

}
