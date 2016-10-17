public class DrawHourGlassNoConstant {
    public static void main(String[] args) {
        drawLine();
        drawTop();
        drawBottom();
        drawLine();
    }

    public static void drawLine() {
        System.out.print("+");
        for (int i = 1; i <= 6; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void drawTop() {
        for (int line = 1; line <= 3; line++) {
            System.out.print("|");
            for (int space1 = 1; space1 <= (line-1); space1++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int dot = 1; dot <= (6-2*line); dot++) {
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
        for (int line = 3; line >= 1; line--) {
            System.out.print("|");
            for (int space1 = 1; space1 <= (line-1); space1++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int dot = 1; dot <= (6-2*line); dot++) {
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
