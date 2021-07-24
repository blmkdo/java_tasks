//boltaev lazizbek: abramyan task:41
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x, y, z;        

        System.out.print("Enter the x: ");
        x = num.nextInt();

        System.out.print("Enter the y: ");
        y = num.nextInt();

        System.out.print("Enter the z: ");
        z = num.nextInt();         
	
		if (x >= 1 && x <= 3) {
			System.out.println("number 1: " + x);
		} else {
			System.out.println("number 1: empty");
		}

		if (y >= 1 && y <= 3) {
			System.out.println("number 2: " + y);
		} else {
			System.out.println("number 2: empty");
		}

		if (z >= 1 && z <= 3) {
			System.out.println("number 3: " + z);
		} else {
			System.out.println("number 3: empty");
		}       
		       
    }
}
