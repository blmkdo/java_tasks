//boltaev lazizbek: abramyan task:05

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a, b;
        float geo, arf;

        System.out.print("Enter the a: ");
        a = num.nextInt();

        System.out.print("Enter the b: ");
        b = num.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        geo = a * b;
        arf = (a + b) / 2f;

        System.out.println("Arithmetic mean: " + arf);
        System.out.println("Geometric mean: " + Math.sqrt(geo));

    }
}
