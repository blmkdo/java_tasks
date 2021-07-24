//boltaev lazizbek: abramyan task:35
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int num1, num2, num3, max, min, lus, pro, lus2, nim;

        System.out.print("Enter the num1: ");
        num1 = num.nextInt();

        System.out.print("Enter the num2: ");
        num2 = num.nextInt();

        System.out.print("Enter the num3: ");
        num3 = num.nextInt();

        lus = num1 + num2 + num3;
        pro = num1 * num2 * num3;
        lus2 = num1 + num2 + num3/2;

        if (lus > pro) {
            max = lus;
        } else {
            max = pro;
        }

        if (lus2 < pro) {
            nim = lus2;
        } else {
            nim = pro;
        }
        min = nim * nim + 1;

        System.out.println("Maximum number from max(x + y + z, xyz): " + max);
        System.out.println("Minimum number from min^2(x + y + z/2, xyz) + 1:  " + min);

    }
}
