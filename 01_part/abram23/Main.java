//boltaev lazizbek: abramyan task:23
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);               
        int a, b, c;
        double ah, bh, ch;

        System.out.print("Enter the a: ");
        a = num.nextInt();

        System.out.print("Enter the b: ");
        b = num.nextInt();

        System.out.print("Enter the c: ");
        c = num.nextInt();

        ah = Math.sqrt(c * c - Math.pow(((-b * b + a * a + c * c) / (2 * a)), 2));
        bh = Math.sqrt(a * a - Math.pow(((-c * c + a * a + b * b) / (2 * b)), 2));
        ch = Math.sqrt(b * b - Math.pow(((-a * a + b * b + c * c) / (2 * c)), 2));

        
        System.out.println("Height of a: " + ah);
        System.out.println("Height of b: " + bh);
        System.out.println("Height of c: " + ch);

       
    }
}

