//boltaev lazizbek: abramyan task:84 v
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x, n, i;
        double res = 0d, sin = 1d;


        System.out.print("Enter the x: ");
        x = num.nextInt();

        System.out.print("Enter the n: ");
        n = num.nextInt();

        for (i = 0; i < n; i++) {
            sin = Math.sin(sin * x);
            res += sin;

        }   
            
        System.out.println("v) resulr: " + res);    
        	    
    }
}
