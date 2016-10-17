package Chapter10;

// reports the overlap between 2 lists

import java.util.*;
import java.io.*; 

public class Vocabulary1 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in1 = new Scanner("code runs faster because the method that adds a word at the end");
		Scanner in2 = new Scanner("very fast compared with the method that removes a word from the middle of the list");

		ArrayList<String> list1 = getWords(in1);
		ArrayList<String> list2 = getWords(in2);
		ArrayList<String> common = getOverlap(list1, list2);

		System.out.println("list1 = " + list1);
		System.out.println("list2 = " + list2);
		System.out.println("overlap = " + common); 
	}
	
	public static ArrayList<String> getWords(Scanner input) {
		// read all words and sort
		ArrayList<String> words = new ArrayList<String>();
		while (input.hasNext()) {
			String next = input.next().toLowerCase();
			words.add(next);
		}
		Collections.sort(words);

		// add unique words to new list and return
		ArrayList<String> result = new ArrayList<String>();
		if (words.size() > 0) {
			result.add(words.get(0));
			for (int i = 1; i < words.size(); i++) {
				if (!words.get(i).equals(words.get(i - 1))) {
					result.add(words.get(i));
				}
			}
		}
		return result;
	} 
	
	public static ArrayList<String> getOverlap(ArrayList<String> list1, ArrayList<String> list2) {
		ArrayList<String> result = new ArrayList<String>();
		int i1 = 0;
		int i2 = 0;
		while (i1 < list1.size() && i2 < list2.size()) {
			int num = list1.get(i1).compareTo(list2.get(i2));
			if (num == 0) {
				result.add(list1.get(i1));
				i1++;
				i2++;
			} else if (num < 0) {
				i1++;
			} else {  // num > 0
				i2++;
			}
		}
		return result;
	} 
	
	
	
	
	
	
}
