// the prototype the student will see
import java.util.*;

public class RevisitingReturnValue {
    public static void main(String[] args) {
        System.out.println(indexOfString('o', "Hello World"));
    }
    public static int indexOfString(char ch, String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                return i;
            }
        }
        return -1;
    }
}





// -------------------------------------------------------
