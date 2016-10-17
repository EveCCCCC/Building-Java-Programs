import java.util.*;

public class FirstWord {
    public static void main (String[] args) {
        String s = "four";
        System.out.println(firstWord(s));
    }

    public static String firstWord(String s) {
        int start = 0;
        while (start < s.length()-1 && s.charAt(start) == ' ') {
            start += 1;
        }
        int stop = start;
        while (stop < s.length() && s.charAt(stop) != ' ') {
            stop += 1;
        }
        return s.substring(start, stop);
    }
}
