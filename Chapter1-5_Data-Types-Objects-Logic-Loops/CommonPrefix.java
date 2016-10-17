public class CommonPrefix {
    public static void main(String[] args) {
        int x = 32845;
        int y = 328929343;
        printCommonPrefix(x, y);
    }
    public static void printCommonPrefix(int x, int y) {
        int z = 0;
        // point A
        while (x!=y) {
            // point B
            z += 1;
            // point C
            if (x>y) {
                // point D
                x /= 10;
            } else {
                // point E
                y /= 10;
            }
            // point F
        }
        // point G
        System.out.println("Common prefix = " + x);
        System.out.println("Digits discarded = " + z);
    }
}
