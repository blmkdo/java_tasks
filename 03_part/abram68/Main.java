//boltaev lazizbek: abramyan task:68
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        String w;
        int i, j, b = 0;

        System.out.print("Enter the number: ");
        w = num.nextLine();

        for (i = 1; i < 2 ; i++) {
            for (j = 1; j < w.length(); j++) {
                char index = w.charAt(i);
                char jndex = w.charAt(j);
                if (index == jndex) {
                    b++;                    
                }
            }
            if (b >= 3) {
                System.out.println(" yes ");
            } else if (i == 2) {
                System.out.println(" no ");   
                b = 0;             
            }            
        }        	    
    }
}
