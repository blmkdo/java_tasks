//boltaev lazizbek: abramyan task:29
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);               
        int x, y;
        double s;

        System.out.print("Enter the x: ");
        x = num.nextInt();

        System.out.print("Enter the y ");
        y = num.nextInt();
        s = (3 * (x * x) * (y * y)) - (2 * x * (y * y)) - (7 * (x * x) * y) - (4 * (y * y)) + (15 * x * y) + (2 * (x * x)) - (3 * x) + (10 * y) + 6;      
     

        System.out.println("S: " + s);
       
    }
}

