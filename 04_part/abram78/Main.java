//boltaev lazizbek: abramyan task:78(a, b)
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double x, n, a, b;

        System.out.print("Enter the x: ");
        x = num.nextInt();

        System.out.print("Enter the n: ");
        n = num.nextInt();

        //<!-- example of loop "for" abramov 78ex:a -->
        a = x;
            
        for (int i=2; i <=n ; i++) {
            a *= x;                
        }

        //<!-- example of loop "do while"  abramov 78ex:b-->    
        
        b = x;        
        int i = 0;
        do {
            b *= (x + i);           
            i++;
        } while ( i < n);
        
    

        
        System.out.println("a) Result: " + a);
        System.out.println("b) Result: " + b);


      
    }
}
