package Chapter8;

//A constructed Point class similar to Java default Point class but with private fields

public class Point {
	private int x;
	private int y;
	
	// constructs a new point with the given (x, y) location
	public Point(int initialX, int initialY) {
		//x = initialX;
		//y = initialY;
		setLocation(initialX, initialY);
	}
	
	// the default constructor
	public Point() {
		//x = 0;
		//y = 0;
		this(0, 0); // calls Point(int, int) constuctor
	}
	
	// returns the X coordinate
	public int getX() {
		return x;
	}
	
	// return the Y coordinate
	public int getY() {
		return y;
	}
	
	// set new location (X, Y)
	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// returns the distance between this point and (0, 0)
	public double distanceFromPoint() {
		return Math.sqrt(x*x + y*y);
	}
	
	// returns the distance between this point and a second point
	public double distanceFromPoint(Point pt) {
		return Math.sqrt((x-pt.x)*(x-pt.x) + (y-pt.y)*(y-pt.y));
	}
	
	// shifts this point's location by the given amount
	public void translate(int dx, int dy) {
		//x += dx;
		//y += dy;
		setLocation(x + dx, y + dy);
	}
	
	// returns a String representation of this point
	public String toString() {
		return "Point: (" + x + ", " + y + ")";
	}
}
