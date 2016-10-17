package Chapter7;

import java.util.Arrays;

public class MultipleObjects {
	public static void main(String[] args) {
		int[] l1 = {1,2,3,4,5};
		int[] l2 = {1,2,3,4,5};
		int[] l3 = l1;
		
		System.out.println(Arrays.equals(l1, l2));
		System.out.println(Arrays.equals(l1, l3));
		System.out.println();
		
		l1[3] = 100;
		System.out.println(Arrays.equals(l1, l2));
		System.out.println(Arrays.equals(l1, l3));
	}
}
