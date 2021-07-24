//boltaev lazizbek: prime division
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x, y = 2;

        System.out.print("Enter the X: ");
        x = num.nextInt();

        while (y * y <= x) {
            if (x % y == 0) {
                System.out.print(y);                
                x /= y;
                System.out.print("*");                               
            } else if (y == 2) { y = 3;    
            } else { y += 2;}
        }
        System.out.println(x);          
    }
}

