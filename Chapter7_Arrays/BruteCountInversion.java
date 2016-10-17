package Chapter7;

import java.util.Arrays;

public class BruteCountInversion {
	public static void main(String[] args) {
		int[] list = {5,4,3,2,1};
		int result = bruteCountInversions(list);
		System.out.println(result);
	}
	
	public static int bruteCountInversions(int[] list) {
		int n = list.length;
		if (n == 1) {
			return 0;
		} else {
			int x = bruteCountInversions(Arrays.copyOfRange(list, 0, n/2));
			int y = bruteCountInversions(Arrays.copyOfRange(list, n/2, list.length));
			int z = bruteCountSplit(list);
			return x+y+z;
		}		
	}
	
	public static int bruteCountSplit(int[] list) {
		int n = list.length;
		int[] listA = Arrays.copyOfRange(list, 0, n/2);
		int[] listB = Arrays.copyOfRange(list, n/2, list.length);
		int count = 0;
		for (int i = 0; i < listA.length; i++) {
			for (int j = 0; j < listB.length; j++) {
				if (listA[i] > listB[j]) {
					count += 1;
				}
			}
		}
		return count;
	}
}
