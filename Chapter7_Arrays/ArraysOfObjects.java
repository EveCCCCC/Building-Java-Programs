package Chapter7;

import java.awt.*;
import java.util.Arrays;

public class ArraysOfObjects {
	public static void main(String[] args) {
		Point[] points1 = new Point[3];
		points1[0] = new Point(1,2);
		points1[1] = new Point(2,3);
		points1[2] = new Point(3,4);
		System.out.println(Arrays.toString(points1));
		
		Point[] points2 = {new Point(1,2), new Point(2,3), new Point(3,4)};
		System.out.println(Arrays.toString(points2));
		
	}
}
