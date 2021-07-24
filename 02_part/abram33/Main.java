//boltaev lazizbek: abramyan task:33
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int num1, num2, max, min;

        System.out.print("Enter the num1: ");
        num1 = num.nextInt();

        System.out.print("Enter the num2: ");
        num2 = num.nextInt();

        if (num1 > num2) {
            max = num1;
            min = num2;

        } else {
            max = num2;
            min = num1;

        }

        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);

    }
}
