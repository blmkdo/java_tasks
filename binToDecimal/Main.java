//boltaev lazizbek: binary to decimal
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Enter the binary code: ");
        String x = num.nextLine();
        int res = 0, i = 0, foo, j = x.length() - 1;

        while (i < x.length()) {
            res += (Character.getNumericValue(x.charAt(i)) * Math.pow(2, j));
            j--;
            i++;
        }
        System.out.println("decimal code:" + res);
    }
}

