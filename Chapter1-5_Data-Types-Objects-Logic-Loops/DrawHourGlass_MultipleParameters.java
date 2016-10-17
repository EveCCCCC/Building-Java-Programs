public class DrawHourGlass_MultipleParameters {
    public static void main(String[] args) {
        int height = 5;
        int SUB_HEIGHT = height - 1;
        drawLine(SUB_HEIGHT);
        drawTop(SUB_HEIGHT);
        drawBottom(SUB_HEIGHT);
        drawLine(SUB_HEIGHT);
    }

    public static void writeChar(char ch, int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print(ch);
        }
    }

    public static void drawLine(int num) {
        System.out.print("+");
        writeChar('-', 2*num);
        System.out.println("+");
    }

    public static void drawTop(int num) {
        for (int line = 1; line <= num; line++) {
            System.out.print("|");
            writeChar(' ', line - 1);
            System.out.print("\\");
            writeChar('.', 2*(num-line));
            System.out.print("/");
            writeChar(' ', line - 1);
            System.out.println("|");
        }
    }

    public static void drawBottom(int num) {
        for (int line = num; line >= 1; line--) {
            System.out.print("|");
            writeChar(' ', line - 1);
            System.out.print("/");
            writeChar('.', 2*(num-line));
            System.out.print("\\");
            writeChar(' ', line - 1);
            System.out.println("|");
        }
    }
}
