package Chapter7;

import java.util.Arrays;

public class ShiftingValuesInAnArray {
	public static void main(String[] args) {
		int[] l1 = {1,2,3,4,5};
		int[] l2 = {1,2,3,4,5};
		
		System.out.println(Arrays.toString(l1));
		shiftLeft(l1);
		System.out.println(Arrays.toString(l1) + "\n");
		
		System.out.println(Arrays.toString(l2));
		shiftRight(l2);
		System.out.println(Arrays.toString(l2));
	}
	public static void shiftLeft(int[] l) {
		int first = l[0];
		for (int i = 0; i < l.length-1; i++) {
			l[i] = l[i+1];
		}
		l[l.length-1] = first;
	}
	public static void shiftRight(int[] l) {
		int last = l[l.length-1];
		for (int i = l.length-1; i > 0; i--) {
			l[i] = l[i-1];
		}
		l[0] = last;
	}
}
