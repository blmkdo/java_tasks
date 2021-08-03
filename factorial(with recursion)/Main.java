//boltaev lazizbek: task: factorial without and with recursion
import java.util.Scanner;
public class Main {

    // without recursion

//    public static void main(String[] args) {
//        Scanner num = new Scanner(System.in);
//        System.out.print("Enter the X: ");
//        int x = num.nextInt();
//        int y =  1;
//        for (int i = 1; i <= x; i++) {
//            y = y * i;
//            System.out.println("res:" + y);
//        }
//    }
    public static int fact(int n) {
        if  (n <= 1)
            return 1;
        else
            return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = num.nextInt();

        System.out.print("Factorial of " + n + ": " + fact(n));
    }
}





