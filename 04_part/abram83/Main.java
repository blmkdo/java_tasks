//boltaev lazizbek: abramyan task:83a
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a;
        float res = 0, n = 1;

        System.out.print("Enter the a: ");
        a = num.nextInt();
        
//        do {
//            res = res + 1 / n;
//            n = n + 1;
//        } while(res > a);

        while (res > a) {
            res += 1/n;
            n = n + 1;
        }
            
        System.out.println("result: " + res);
        	    
    }
}
