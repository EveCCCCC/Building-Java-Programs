public class DrawHourGlass {
    static int height = 5;
    public static final int SUB_HEIGHT = height - 1;
    //static int SUB_HEIGHT = height - 1;   // seems to work too!

    public static void main(String[] args) {
        drawLine();
        drawTop();
        drawBottom();
        drawLine();
    }
    public static void drawLine() {
        System.out.print("+");
        for (int i = 1; i <= SUB_HEIGHT*2; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
    public static void drawTop() {
        for (int line = 1; line <= SUB_HEIGHT; line++) {
            System.out.print("|");
            for (int space1 = 1; space1 <= (line-1); space1++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int dot = 1; dot <= (SUB_HEIGHT*2-2*line); dot++) {
                System.out.print(".");
            }
            System.out.print("/");
            for (int space2 = 1; space2 <= (line-1); space2++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
    public static void drawBottom() {
        for (int line = SUB_HEIGHT; line >= 1; line--) {
            System.out.print("|");
            for (int space1 = 1; space1 <= (line-1); space1++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int dot = 1; dot <= (SUB_HEIGHT*2-2*line); dot++) {
                System.out.print(".");
            }
            System.out.print("\\");
            for (int space2 = 1; space2 <= (line-1); space2++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}
