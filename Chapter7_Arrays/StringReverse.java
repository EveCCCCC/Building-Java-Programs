package Chapter7;

public class StringReverse {
	public static void main(String[] args) {
		String s = "Mississippi";
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			result = s.charAt(i) + result;
			}
		System.out.println(s);
		System.out.println(result);
	}
}