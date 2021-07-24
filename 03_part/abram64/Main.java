//boltaev lazizbek: abramyan task:64
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a, b;

        System.out.print("Enter the a: ");
        a = num.nextInt();       
		
        b = a /100;			
		
        System.out.println("Count of hundreds: " + b);       
    }
}
