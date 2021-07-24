//boltaev lazizbek: abramyan task:01
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a, b, lus, nus, mul;

        System.out.print("Enter the a: ");
        a = num.nextInt();

        System.out.print("Enter the b: ");
        b = num.nextInt();

        lus = a + b;
        nus = a - b;
        mul = a * b;

        System.out.println("Sum of a and b: " + lus);
        System.out.println("Difference of a and b: " + nus);
        System.out.println("Product of a and b: " + mul);
    }
}
