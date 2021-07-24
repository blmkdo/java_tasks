//boltaev lazizbek: abramyan task:34
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int num1, num2, num3, max, min;

        System.out.print("Enter the num1: ");
        num1 = num.nextInt();

        System.out.print("Enter the num2: ");
        num2 = num.nextInt();

        System.out.print("Enter the num3: ");
        num3 = num.nextInt();

        if (num1 > num2 && num1 > num3) {
            max = num1;
            if (num2 > num3) {
                min = num3;
            } else {
                min = num2;
            }
        } else if (num2 > num1 && num2 > num3) {
            max = num2;
            if (num1 > num3) {
                min = num3;
            } else {
                min = num1;
            }
        } else {
            max = num3;
            if (num1 > num2) {
                min = num2;
            } else {
                min = num1;
            }
        }

        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);

    }
}
