public class DrawConeConstant {
    public static final int LINE = 3;
    public static void main(String[] args) {
        for (int line = LINE; line >= 1; line--) {
            for (int i = 1; i <= (line - 1); i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= (2*LINE + 1 - 2 * line); i++) {
                System.out.print("*");
            }
            System.out.println();
            }
      }
}
