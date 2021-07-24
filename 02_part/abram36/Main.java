//boltaev lazizbek: abramyan task:36
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int num1, num2, num3;
        String note;

        System.out.print("Enter the num1: ");
        num1 = num.nextInt();

        System.out.print("Enter the num2: ");
        num2 = num.nextInt();

        System.out.print("Enter the num3: ");
        num3 = num.nextInt();

        if (num1 < num2 && num2 < num3) {
            note = "yes";
        } else {
            note = "no";
        }
        System.out.println(note);

    }
}
