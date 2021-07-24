//boltaev lazizbek: abramyan task:08
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int r, n;
        double P;

        System.out.print("Enter the radius: ");
        r = num.nextInt();

        System.out.print("Enter the number of angeles: ");
        n = num.nextInt();

        P = 2 * n * r * Math.sin(3.14 / n);
        System.out.println("Perimeter: " + P);
    }
}
