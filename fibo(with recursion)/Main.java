//boltaev lazizbek: fibonacci
import java.util.Scanner;
public class Main {

    public static int fibo(int x) {
        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        } else {
            return fibo(x - 1) + fibo(x - 2);
        }
    }
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Enter the X: ");
        int x = num.nextInt();
        int f = fibo(x);

        System.out.println("fibo Number: " + f);		    
    }
}
