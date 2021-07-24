//boltaev lazizbek: abramyan task:04
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a, b;
        float geo, arf;

        System.out.print("Enter the positive a: ");
        a = num.nextInt();

        System.out.print("Enter the positive b: ");
        b = num.nextInt();

        if (a < 0 || b < 0) {
            System.out.println("Please enter the positive numbers");

            System.out.print("Enter the positive a: ");
            a = num.nextInt();

            System.out.print("Enter the positive b: ");
            b = num.nextInt();
        }

        geo = a * b;
        arf = (a + b) / 2f;

        System.out.println("Arithmetic mean: " + arf);
        System.out.println("Geometric mean: " + Math.sqrt(geo));

    }
}
