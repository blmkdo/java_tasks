//boltaev lazizbek: abramyan task:81
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x, a, n, i;
        double res = 0d;

        System.out.print("Enter the a: ");
        a = num.nextInt();  

        System.out.print("Enter the n: ");
        n = num.nextInt();
        for (i = 0; i < n ; i++ ) {
            res = Math.pow((res + a), 2);            
        }        

        System.out.println("result: " + res);
                
    }
}