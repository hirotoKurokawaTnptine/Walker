package back.onionLayer.domain.utils;

// 8方向
public enum Direction {
	UP(new Point(0, -1)),
	DOWN(new Point(0, 1)),
	LEFT(new Point(-1, 0)),
	RIGHT(new Point(1, 0)),
	UP_LEFT(new Point(-1, -1)),
	UP_RIGHT(new Point(1, -1)),
	DOWN_LEFT(new Point(-1, 1)),
	DOWN_RIGHT(new Point(1, 1));

	private final Point point;

	private Direction(final Point point) {
		this.point = point;
	}

	public Point getPoint() {
		return point;
	}
}
