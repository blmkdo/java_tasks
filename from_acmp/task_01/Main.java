//boltaev lazizbek: acmp task:01
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int num1, num2, d, k, res;

        System.out.print("Enter the num1: ");
        num1 = num.nextInt();

        System.out.print("Enter the num2: ");
        num2 = num.nextInt();

        System.out.print("Enter the steps d: ");
        d = num.nextInt();

        k = num2 - num1;
        res = num2;
        for (int i = 0; i < d ; i++ ) {
            res += k;            
        }        
        System.out.println(d + "th of number is: " + res);		    
    }
}
