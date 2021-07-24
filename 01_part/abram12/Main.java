//boltaev lazizbek: abramyan task:12
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a;
        double S;

        System.out.print("Enter the a: ");
        a = num.nextInt();

        S = (a * a * Math.sqrt(3))/4d;
        System.out.println("Square of triangle: " + S);

    }
}
