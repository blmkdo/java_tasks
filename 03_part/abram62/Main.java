//boltaev lazizbek: abramyan task:62
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a;

        System.out.print("Enter the a: ");
        a = num.nextInt();

        
		if (a % 2 == 0) {
			System.out.println("a is even ");
		} else {
			System.out.println("a is odd ");				
		}       
    }
}
