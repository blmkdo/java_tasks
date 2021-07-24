//boltaev lazizbek: abramyan task:65
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n;
        double m = 0;

        System.out.print("Enter the n: ");
        n = num.nextInt();

        while(n != 0) {           
            m += (n % 10);
            n/=10;
        }
        System.out.println(m + " ");



        if (n * n == Math.pow(m, 3)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }           
		
		    
    }
}
