//boltaev lazizbek: abramyan task:42
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float x, y;        

        System.out.print("Enter the x: ");
        x = num.nextInt();

        System.out.print("Enter the y: ");
        y = num.nextInt();       
	
		if (x == y) {
			System.out.println("They could be different " + x);
			System.out.print("Enter the x: ");
	        x = num.nextInt();
	        System.out.print("Enter the y: ");
	        y = num.nextInt();   
		} else {
			if (x < y) {
				x = (x + y) / 2f;
				y*=2;
			} else {
				y = (x + y) / 2f;
				x*=2;
			}

		}

		System.out.println("number 1: " + x);
		System.out.println("number 2: " + y);	
        
		       
    }
}
