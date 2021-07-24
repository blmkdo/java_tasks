//boltaev lazizbek: abramyan task:40
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x, y;        

        System.out.print("Enter the x: ");
        x = num.nextInt();

        System.out.print("Enter the y: ");
        y = num.nextInt();       
	
		if (x <= y) {
			x = 0; 	

		}

		System.out.println("number 1: " + x);
		System.out.println("number 2: " + y);	
        
		       
    }
}
