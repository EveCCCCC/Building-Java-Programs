package Chapter7;

public class NestedLoopAlgorithms {
	public static void main(String[] args) {
		int[] list = {5,4,3,2,1};
		int result = countInversion(list);
		System.out.println(result);
	}
	public static int countInversion(int[] list) {
		int count = 0;
		for (int i = 0; i < list.length - 1; i++) {
			for (int j = i+1; j < list.length; j++) {
				if (list[i] > list[j]) {
					count += 1;
				}
			}
		}
		return count;
	}
}
