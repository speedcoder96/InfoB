package de.uos.rt.exercise._3._3;

public class Point extends ComparableGeometry {
	
	private double[] coordinates;
	
	private Point(int dimensions) {
		super(dimensions);
	}

	public Point(double... coordinates) {
		this(coordinates.length);
		this.coordinates = coordinates;
	}
	
	public void setCoordinates(double... coordinates) {
		if(coordinates.length == this.coordinates.length) {
			this.coordinates = coordinates;
		}
	}
	
	public double[] getCoordinates() {
		return coordinates;
	}

	@Override
	public int compareTo(Object other) {
		return (int)(this.volume() - ((Geometry)other).volume());
	}

	@Override
	public double volume() {
		return 0;
	}

	@Override
	public Geometry encapsulate(Geometry other) {
		if(other.dimensions() == dimensions()) {
			if(other instanceof Point) {
				Point otherPoint = (Point)other;
				return new Volume(this, otherPoint);
			} else if(other instanceof Volume) {
				Volume otherVolume = (Volume)other;
				Volume a = new Volume(this, otherVolume.getX());
				Volume b = new Volume(this, otherVolume.getY());
				if(a.compareTo(b) > 0) {
					return a;
				}
				return b;
			}
		}
		return null;
	}

}
