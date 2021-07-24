//boltaev lazizbek: abramyan task:17
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int r = 20;
        int R;
        float S;

        System.out.print("Enter the R more than 20: ");
        R = num.nextInt();

        if (R <= 20) {
            System.out.print("Please, enter the R more than 20: ");
            R = num.nextInt();
        }

        S = 3.14f * (R * R - r * r);

        System.out.println("Square of circle: " + S);
    }
}
