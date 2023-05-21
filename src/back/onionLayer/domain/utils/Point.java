package back.onionLayer.domain.utils;

import java.util.Objects;

public class Point {
	private final int x;
	private final int y;
	public Point(final int x, final int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point plus(final Point o) {
		return new Point(this.x+o.getX(), this.y+o.getY());
	}
	
	public Point minus(final Point o) {
		return new Point(this.x-o.getX(), this.y-o.getY());
	}
	
	public Point product(final int num) {
		return new Point(num*this.x, num*this.y);
	}
	
	public static Point originPoint() {
		return new Point(0, 0);
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}
}
