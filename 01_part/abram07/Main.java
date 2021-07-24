//boltaev lazizbek: abramyan task:07

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int v1, v2, t2, t1;
        float T, V;

        System.out.print("Enter the v1: ");
        v1 = num.nextInt();

        System.out.print("Enter the v2: ");
        v2 = num.nextInt();

        System.out.print("Enter the t1: ");
        t1 = num.nextInt();

        System.out.print("Enter the t2: ");
        t2 = num.nextInt();

        V = v1 + v2;
        T = (v1 * t1 + v2 * t2)/V;

        System.out.println("Volume: " + V);
        System.out.println("Temperature: " + T);
    }
}
