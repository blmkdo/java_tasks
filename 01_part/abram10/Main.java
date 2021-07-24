//boltaev lazizbek: abramyan task:10
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int h;
        double T;

        System.out.print("Enter the height: ");
        h = num.nextInt();


        T = Math.sqrt(2 * h / 10f);

        System.out.println("Time: " + T);
    }
}

