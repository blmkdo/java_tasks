//boltaev lazizbek: abramyan task:06

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int k1, k2;
        double g, S;

        System.out.print("Enter the k1: ");
        k1 = num.nextInt();

        System.out.print("Enter the k2: ");
        k2 = num.nextInt();

        S = k1 * k2 / 2d;
        g = Math.sqrt(k1 * k1 + k2 * k2);

        System.out.println("Square: " + S);
        System.out.println("Hypotenuse: " + g);
    }
}
