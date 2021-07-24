//boltaev lazizbek: abramyan task:66
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x, y, z, k, m;       

        System.out.print("Enter the x: ");
        x = num.nextInt();
        System.out.print("Enter the y: ");
        y = num.nextInt();
        System.out.print("Enter the z: ");
        z = num.nextInt();
        System.out.print("Enter the k: ");
        k = num.nextInt();
        System.out.print("Enter the m: ");
        m = num.nextInt();

        if (k < m * m) {
            x = Math.abs(x);
            y /= 0.5;
            z /= 0.5;            
        } else if (k == m * m) {
            y = Math.abs(y);
            x /= 0.5;
            z /= 0.5;            
        } else if (k > m * m) {
            z = Math.abs(z);
            x /= 0.5;
            y /= 0.5;            
        } else {
            System.out.println("x: " + x);
            System.out.println("y: " + y);
            System.out.println("z: " + z);
        }

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);	
		    
    }
}
