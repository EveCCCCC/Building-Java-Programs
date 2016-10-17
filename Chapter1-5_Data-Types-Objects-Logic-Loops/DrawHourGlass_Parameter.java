public class DrawHourGlass_Parameter {

    public static void main(String[] args) {
        int height = 5;
        int SUB_HEIGHT = height - 1;
        drawLine(SUB_HEIGHT);
        drawTop(SUB_HEIGHT);
        drawBottom(SUB_HEIGHT);
        drawLine(SUB_HEIGHT);
    }

    public static void whiteSpaces(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }

    public static void drawDots(int number) {
        for (int dot = 1; dot <= (number); dot++) {
            System.out.print(".");
          }
    }

    public static void drawDash(int num) {
        for (int i = 1; i <= num*2 ; i++) {
            System.out.print("-");
          }
    }

    public static void drawLine(int num) {
        System.out.print("+");
        drawDash(num);
        System.out.println("+");
    }

    public static void drawTop(int num) {
        for (int line = 1; line <= num; line++) {
            System.out.print("|");
            whiteSpaces(line - 1);
            System.out.print("\\");
            drawDots(num*2-2*line);
            System.out.print("/");
            whiteSpaces(line - 1);
            System.out.println("|");
        }
    }

    public static void drawBottom(int num) {
        for (int line = num; line >= 1; line--) {
            System.out.print("|");
            whiteSpaces(line - 1);
            System.out.print("/");
            drawDots(num*2-2*line);
            System.out.print("\\");
            whiteSpaces(line - 1);
            System.out.println("|");
        }
    }
}
