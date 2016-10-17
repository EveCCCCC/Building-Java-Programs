public class DrawV {
    public static void main(String[] args) {
        for (int line = 0; line < 5; line++) {
            for (int i = 0; i < line+1; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < (11 - 2 * (line+1)); i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
