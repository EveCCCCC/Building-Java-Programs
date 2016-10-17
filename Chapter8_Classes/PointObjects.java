package Chapter8;

import java.awt.Point;

public class PointObjects {
	public static void main(String[] args) {
		Point p =  new Point(3,8);
		System.out.println("initially p = " + p);
		
		p.translate(-1,-2);
		System.out.println("after translating p = " + p);
		
		int sum = p.x + p.y;
		System.out.println("p.x + p.y = " + sum);
		
		p.x = 12;
		p.y = 15;
		System.out.println("reset p.x and p.y, p = " + p);
	}
}
