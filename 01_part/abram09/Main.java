//boltaev lazizbek: abramyan task:09
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int r1, r2, r3;
        float R, AR, BR;

        System.out.print("Enter the r1: ");
        r1 = num.nextInt();

        System.out.print("Enter the r2: ");
        r2 = num.nextInt();

        System.out.print("Enter the r3: ");
        r3 = num.nextInt();

        AR = r1 * r2 * r3;
        BR = r1 * r2 + r1 * r3 + r2 * r3;
        R = AR / BR;


        System.out.println("R equals to: " + R);
    }
}
