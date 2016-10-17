public class DrawCone {
    public static void main(String[] args) {
        int lineNum = 3;
        for (int line = lineNum; line >= 1; line--) {
            for (int i = 1; i <= (line - 1); i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= (2*lineNum + 1 - 2 * line); i++) {
                System.out.print("*");
            }
            System.out.println();
            }
      }
}
