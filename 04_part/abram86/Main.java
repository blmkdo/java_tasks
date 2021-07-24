//boltaev lazizbek: abramyan task:86
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n, a = 0, b = 0, v, d, g;

        System.out.print("Enter the n>=100: ");
        n = num.nextInt();

        v = n % 10; 
        d = (n / 10) % 10;
        g = Integer.parseInt(Integer.toString(n).substring(0, 1)); 


        while(n != 0) {
            b += (n % 10);           
            n /= 10;
            a++;            
        }             
        System.out.println("a) count of chars: " + a);        
        System.out.println("b) sum of chars: " + b);
        System.out.println("v) last char of number: " + v);     
        System.out.println("g) first char of number: " + g);        
        System.out.println("d) prelast char of number: " + d);		    
    }
}
