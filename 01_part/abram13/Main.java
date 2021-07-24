//boltaev lazizbek: abramyan task:13
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int l;
        double T;

        System.out.print("Enter the length: ");
        l = num.nextInt();

        T = 2 * 3.14 * Math.sqrt(l / 10d);

        System.out.println("Temperature: " + T);
    }
}
