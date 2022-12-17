package chapter2;

public class ForTEst {
    public static void main(String[] args) {
        int x = 0, y = 20;
        for (x = 0; x < 10; x++) {
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            y = y - 2;
        }
    }
}
