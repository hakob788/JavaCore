package chapter2;

public class Light {
    public static void main(String[] args) {
        int mil = 186000;
        long days;
        long seconds;
        long distance;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = mil * seconds;
        System.out.print(" za " + days);
        System.out.print(" dney svet praydyot okolo ");
        System.out.print(distance + " mil ");
    }

}
