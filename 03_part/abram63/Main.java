//boltaev lazizbek: abramyan task:63
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = 15, b = 3, r, s;

        System.out.print("Enter the r: ");
        r = num.nextInt();

        System.out.print("Enter the s: ");
        s = num.nextInt();

        
		if (a % b == r || a % b == s) {
			System.out.println("yes");
		} else {
			System.out.println("no");				
		}       
    }
}
