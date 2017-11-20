package de.c0lect0r.codekatas.rover;

public final class Coordinates { 
    private final double x;    // x-coordinate
    private final double y;    // y-coordinate
   
    // random point
    public Coordinates() {
        x = 1;
        y = 1;
    }

    // point initialized from parameters
    public Coordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // accessor methods
    public double x() { return x; }
    public double y() { return y; }
   

    // Euclidean distance between this point and that point
    public double distanceTo(Coordinates that) {
        double dx = this.x - that.x;
        double dy = this.y - that.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    // return a string representation of this point
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Coordinates)) {
			return false;
		}
		Coordinates other = (Coordinates) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x)) {
			return false;
		}
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y)) {
			return false;
		}
		return true;
	}
}