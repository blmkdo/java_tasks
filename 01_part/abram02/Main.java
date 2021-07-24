//boltaev lazizbek: abramyan task:02
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float x, y, result;

        System.out.print("Enter the x: ");
        x = num.nextInt();

        System.out.print("Enter the y: ");
        y = num.nextInt();

        if (x > 0 && y > 0) {
            result = (x - y) / (1 + x * y);
        } else if (x < 0 && y > 0) {
            x = x * (-1);
            result = (x - y) / (1 + x * y);
        } else if (x > 0 && y < 0) {
            y = y * (-1);
            result = (x - y) / (1 + x * y);
        } else {
            x = x * (-1);
            y = y * (-1);
            result = (x - y) / (1 + x * y);
        }

        System.out.println("Result: " + result);

    }
}
