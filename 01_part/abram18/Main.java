//boltaev lazizbek: abramyan task:18
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);               
        int R, a;
        double A;

        System.out.print("Enter the R: ");
        R = num.nextInt();

        System.out.print("Enter the a: ");
        a = num.nextInt();

        A = 2 * R * Math.sin(a);         

        System.out.println("A: " + A);
       
    }
}

