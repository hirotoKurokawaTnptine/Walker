package back.onionLayer.domain;

import back.onionLayer.domain.utils.Direction;
import back.onionLayer.domain.utils.Point;

public class Walker{
	private Point location;
	
	public Walker() {
		location = Point.originPoint();
	}
	
	public void move(final Direction direction) {
		this.location = this.location.plus(direction.getPoint());
	}
	
	public Point getLocation() {
		return location;
	}
}
