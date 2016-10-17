public class temp {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z1 = ++x * y--;
        int z2 = ++x * --y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z1);
        System.out.println(z2);
    }
}
