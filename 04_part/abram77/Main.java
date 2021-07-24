//boltaev lazizbek: abramyan task:77(a, b)
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double n, a;

        System.out.print("Enter the n: ");
        n = num.nextInt();
        a = Math.pow(2, n);
        // for (int i = 0 ; i < 2; i++ ) {
        //     res = 2 *
            
        // } 
        // task b       
        int b = 1;      
        int i = 1;
        while (i <= n) {
            b = b * i;            
            i++;
        }
        System.out.println("a) Result: " + a);
        System.out.println("b) Result: " + b);


      
    }
}
