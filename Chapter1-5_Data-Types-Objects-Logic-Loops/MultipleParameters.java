public class MultipleParameters {
    public static void main(String[] args) {
        System.out.println('='+'=');

        char ch = '=';
        int num = 10;
        writeChar(ch, 2*num);
        System.out.println();
        for (int i = 1; i <= num; i++) {
            writeChar('>', i);
            writeChar(' ', 2*num-2*i);
            writeChar('<', i);
            System.out.println();
        }
    }

    public static void writeChar(char ch, int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print(ch);
        }
    }
}
