package Chapter10;

public class CompareTo {
	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = "AC";
		String s3 = "A";
		System.out.println(s1.compareTo(s2));	// -1
		System.out.println(s1.compareTo(s3));	// 2
	}
}
