//boltaev lazizbek: conjectureNumGame
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int interA = 0;
        int interB = 128;
        int bar = 10;
        int res = (interB - interA) / 2;
        int i = 0;

        while (bar != 11) {
            Scanner scan = new Scanner(System.in);
            System.out.print(res + " equal(11), more(1), less(0): " );
            bar = scan.nextInt();

            if (bar == 1 ) {
                interA = res;
                res = ((interB - interA) / 2) + interA;
                i++;
            } else if (bar == 0 ) {
                interB = res;
                res = ((interB - interA) / 2) + interA;
                i++;
            }
        }
        System.out.print("I guess, num is " + res + " in " + i + " attempts");
    }
}
