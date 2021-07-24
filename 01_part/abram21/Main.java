//boltaev lazizbek: abramyan task:21
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);               
        int c, d;
        double s, x1, x2, dis;

        System.out.print("Enter the d: ");
        d = num.nextInt();

        System.out.print("Enter the c: ");
        c = num.nextInt();

        dis = 9 + 4 * Math.abs(c * d);
        x1 = ( 3 + Math.sqrt(dis)) / 2;
        x2 = (3 - Math.sqrt(dis)) / 2;
        if (x1 < x2) {
            dis = x2; 
            x1 = x2; 
            x2 = dis;
        }
        dis = Math.abs(c * x1 * x1 * x1 + d * x2 * x2 - c * d);
        s = Math.abs((Math.sin(dis)*Math.sin(dis)*Math.sin(dis))/(Math.sqrt(Math.sqrt(dis)+3.14)));
        s = s + Math.sin(c * x1 * x1 *x1 + d * x2 * x2 - x1)/Math.cos(c * x1 * x1 * x1 + d * x2 * x2 - x1);

            

        System.out.println("S: " + s);
       
    }
}

