//boltaev lazizbek: abramyan task:82
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x, i;
        double res, a = 1d, b = 1d;

        System.out.print("Enter the x: ");
        x = num.nextInt();

        for (i = 2; i < 6; i++ ) {
            a = a * (x-Math.exp((i-1)*Math.log(2)));
            b = b * (x-(Math.exp((i-1)*Math.log(2)) - 1));            
        }

        res = a / b;

        System.out.println("result: " + res);
                
    }
}
