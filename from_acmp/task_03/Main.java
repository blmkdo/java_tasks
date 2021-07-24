//boltaev lazizbek: acmp task:03
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        String numberA, numberB;
        int i, j;
        char num1 = '0';

        System.out.print("Enter the number A: ");
        numberA = num.nextLine();

        System.out.print("Enter the number B: ");
        numberB = num.nextLine();

        System.out.println("length of number A: " + numberA.length());    
        System.out.println("length of number B: " + numberB.length());

        for (i = 0; i < numberA.length(); i++) {
            for (j = 0; j < numberB.length(); j++) {
                if (numberA.charAt(i) == numberB.charAt(j) && numberA.charAt(i) != num1) {
                    num1 = numberA.charAt(i);
                    System.out.print(num1 + " "); 
                }               
            }
        }        
        // System.out.println("Result is: " + res);		    
    }
}
