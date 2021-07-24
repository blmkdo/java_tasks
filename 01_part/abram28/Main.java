//boltaev lazizbek: abramyan task:28
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);               
        int x;
        double s;

        System.out.print("Enter the x: ");
        x = num.nextInt();
        
        s = (((2*x-3)*x+4)*x-5)*x+6;

        System.out.println("S: " + s);
       
    }
}

