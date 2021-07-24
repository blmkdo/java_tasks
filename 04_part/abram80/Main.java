//boltaev lazizbek: abramyan task:80
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x, i, n = 101;
        double res = 1d, a, b = 1d, c;
        //chus  znam  znak

        System.out.print("Enter the x: ");
        x = num.nextInt();

        for (i = 1; i < (n/2) ; i++ ) {
            if (i % 2 == 0) {
                c = 1;                
            } else {
                c = -1;
            }
            a = Math.exp((i * 2 - 1)*Math.log(x));
            b *= (i * 2 - 1);
            res += c * a / b;
            b *= (i * 2);            
        }
       
        System.out.println("result: " + res);
                
    }
}