//boltaev lazizbek: abramyan task:38
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x, y, z;        

        System.out.print("Enter the x: ");
        x = num.nextInt();

        System.out.print("Enter the y: ");
        y = num.nextInt();       
	
		if (x > y) {
			z = x - y;
		} else {
			z = y - x + 1;		
		}
        System.out.println("z: " + z);
		       
    }
}
