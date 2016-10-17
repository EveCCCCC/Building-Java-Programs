package Chapter7;

import java.util.Arrays;

public class CountingInversions_self {
	
	public static void main(String[] args) {
		
		int[] list = {5,4,3,2,1};
		Object result = sortCount(list)[1];
		Object listX = sortCount(list)[0];
		System.out.println(result);
		System.out.println(Arrays.toString((int[])listX));
		/*		
		int[] a = {1,2,5,6,7};
		int[] b = {3,4};
		Object x = mergeCountSplit(a, b)[1];
    	System.out.println(x);
		*/	
	}
	
	public static Object[] sortCount(Object listA) {
		int n = ((int[])listA).length;
		if (n == 1) {
			Object[] obj = {listA, 0};
			return obj;
		} else {
			int x = (int)(sortCount(Arrays.copyOfRange((int[])listA, 0, n/2))[1]);
			int[] listB = (int[])sortCount(Arrays.copyOfRange((int[])listA, 0, n/2))[0];
			int y = (int)(sortCount(Arrays.copyOfRange((int[])listA, n/2, ((int[])listA).length))[1]);
			int[] listC = (int[])sortCount(Arrays.copyOfRange((int[])listA, n/2, ((int[])listA).length))[0];
			int z = (int)(mergeCountSplit((int[])listB, (int[])listC)[1]);
			int[] listD = (int[])mergeCountSplit(listB, listC)[0];
			Object[] obj = {listD, x+y+z};
			System.out.println("      " + Arrays.toString(listD));
			return obj;
		}		
	}
	

	public static Object[] mergeCountSplit(int[] listB, int[] listC) {
		int[] listD = new int[listB.length + listC.length];
		int x = 0, i = 0, j = 0, d = listB.length;
		boolean flag = true;
		
		int index = 0;
		while (flag == true) {
			if (listB[i] < listC[j]) {
				listD[index] = listB[i];
				i += 1;
				index += 1;
				d -= 1;
				if (i == listB.length) {
					for (int mimi = index; index < listD.length-1; mimi ++) {
						listD[mimi] = listC[j];
						j += 1;
						if (j == listC.length){
							break;
						}
					}
					flag = false;
				}
			} else {
				listD[index] = listC[j];
				j += 1;
				index += 1;
				x += d;
				if (j == listC.length) {
					for (int mimi = index; index < listD.length-1; mimi ++) {
						listD[mimi] = listB[i];
						i += 1;
						if (i == listB.length){
							break;
						}
					}
					flag = false;
				}
			}
		}
		Object[] res = {listD, x};
		return res;
	}
}