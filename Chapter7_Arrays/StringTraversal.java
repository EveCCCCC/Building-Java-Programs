package Chapter7;

public class StringTraversal {
	public static void main(String[] args) {
		String s = "Mississippi";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'i') {
				count += 1;
			}
		}
		System.out.println(count);
	}
}
