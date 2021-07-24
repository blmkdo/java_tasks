//boltaev lazizbek: abramyan task:20
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);               
        int a, d, n;
        double S;

        System.out.print("Enter the d: ");
        d = num.nextInt();

        System.out.print("Enter the a: ");
        a = num.nextInt();

        System.out.print("Enter the n: ");
        n = num.nextInt();

        S = 0.5 * n * (2 * a + d * (n-1));         

        System.out.println("S: " + S);
       
    }
}

