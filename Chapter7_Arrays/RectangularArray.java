package Chapter7;

import java.util.Arrays;

public class RectangularArray {
	public static void main(String[] args) {
		int[][] aList = {{1,2,3}, {1,2,3}};
		System.out.println(Arrays.deepToString(aList));
		
		int[][][] bList = {{{1,2}, {1,2}}, {{2,3}, {2,3}}};
		System.out.println(Arrays.deepToString(bList));
		
		int[][][] cList = {{{1,2}, {1,2}}, {{1,2,3}, {2,3}, {4,5,6}}};
		System.out.println(Arrays.deepToString(cList));
	}
}
