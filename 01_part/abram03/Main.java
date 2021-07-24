//boltaev lazizbek: abramyan task:03
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a, square, volume;

        System.out.print("Enter the a: ");
        a = num.nextInt();

        square = a * a;
        volume = a * a * a;

        System.out.println("Square of cube: " + square);
        System.out.println("Volume of cube: " + volume);

    }
}
