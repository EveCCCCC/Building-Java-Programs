public class DrawBox {
    public static void main(String[] args) {
        drawBox(10, 5);
        drawBox();
    }

    public static void drawBox(int width, int height) {
        // draw top
        writeChar('*', width);
        System.out.println();
        // draw middle
        for (int i = 1; i <= height-2; i++ ) {
            System.out.print('*');
            writeChar(' ', width-2);
            System.out.println('*');
        }
        // draw bottom
        writeChar('*', width);
        System.out.println();
    }

    public static void drawBox() {
        int width = 8;
        int height = 4;
        // draw top
        writeChar('*', width);
        System.out.println();
        // draw middle
        for (int i = 1; i <= height-2; i++ ) {
            System.out.print('*');
            writeChar(' ', width-2);
            System.out.println('*');
        }
        // draw bottom
        writeChar('*', width);
        System.out.println();
    }

    public static void writeChar(char ch, int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print(ch);
        }
    }
}
