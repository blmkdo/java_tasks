//boltaev lazizbek: abramyan task:15
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);       
        int a, c;
        double r, b;

        System.out.print("Enter the a: ");
        a = num.nextInt();

        System.out.print("Enter the c: ");
        c = num.nextInt();

        b = Math.sqrt(c * c - a * a);
        r = (a + b - c) / 2d;
        

        System.out.println("r: " + a);
        System.out.println("b: " + b);
    }
}

