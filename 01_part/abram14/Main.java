//boltaev lazizbek: abramyan task:14
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        final double Gr = 6.67430; 
        int r, m1, m2 ;
        double F;

        System.out.print("Enter the r: ");
        r = num.nextInt();

        System.out.print("Enter the m1: ");
        m1 = num.nextInt();

        System.out.print("Enter the m2: ");
        m2 = num.nextInt();

        F = Gr * m1 * m2 / (r * r);
        

        System.out.println("F: " + F);
        

    }
}

