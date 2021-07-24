//boltaev lazizbek: abramyan task:16
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        final double pi = 3.14;       
        int l;
        double S;

        System.out.print("Enter the l: ");
        l = num.nextInt();

        S = l*l/(4*pi);        

        System.out.println("S: " + S);
       
    }
}

