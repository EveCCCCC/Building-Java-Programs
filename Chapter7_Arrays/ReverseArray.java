package Chapter7;

import java.util.*;

public class ReverseArray {
	public static void main(String[] args) {
		int[] list = {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(list));
		reverse(list);
		System.out.println(Arrays.toString(list));
	}
	
	public static void reverse(int[] list) {
		for (int i = 0; i < list.length/2; i++) {
			int j = list.length - 1 - i;
			int temp = list[i];
			list[i] = list[j];
			list[j] = temp;
		}
	}
}
