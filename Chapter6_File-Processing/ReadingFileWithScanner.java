import java.util.*;
import java.io.*; // for File

public class ReadingFileWithScanner {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("DrawBoxes.java"));
        int count = 0;
        while (input.hasNext()) {
            String word = input.next();
            count += 1;
        }
        System.out.println("total words = " + count);
    }
}
