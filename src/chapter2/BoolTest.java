package chapter2;

public class BoolTest {
    public static void main(String[] args) {

        boolean b;

        b = false;
        System.out.println("b = " + b);
        b = true;
        System.out.println("b = " + b);
        if (b)
            System.out.println("sik kexni");
        b = false;
        if (b)
            System.out.println("sik chiexni");
        System.out.println("10 > 9 = " + (10 > 9));
    }
}
