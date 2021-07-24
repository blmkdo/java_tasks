//boltaev lazizbek: abramyan task:37
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a, b, c, x2, abs;
        float T;

        System.out.print("Enter the a: ");
        a = num.nextInt();

        System.out.print("Enter the b: ");
        b = num.nextInt();

        System.out.print("Enter the c: ");
        c = num.nextInt();
	
	if (a >= b && b>=c) {
		a = a * 2;
		b = b * 2;
		c = c * 2;
	} else {
		a = Math.abs(a);
		b = Math.abs(b);
		c = Math.abs(c);		
	}
        System.out.println("a: " + a);
	System.out.println("b: " + b);
	System.out.println("c: " + c);
        
    }
}
