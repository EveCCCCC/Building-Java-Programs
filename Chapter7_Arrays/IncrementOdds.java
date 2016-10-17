package Chapter7;

public class IncrementOdds {
	public static void main(String[] args) {
		int[] list = buildingOddArray(5);
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
		incrementAll(list);
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}
	
	// returns array of given size composed of consecutive odds
	public static int[] buildingOddArray(int size) {
		int[] data = new int[size];
		for (int i = 0; i < data.length; i++) {
			data[i] = 2*i + 1;
		}
		return data;
	}
	
	// add one to each array element
	public static void incrementAll(int[] data) {
		for (int i = 0; i < data.length; i++) {
			data[i] += 1;
		}
	}
}
