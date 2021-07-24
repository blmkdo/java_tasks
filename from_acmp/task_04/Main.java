//boltaev lazizbek: acmp task:04
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        String number;
        int res = 0, i = 0, counter = 0;
        char num1;

        System.out.print("Enter the number: ");
        number = num.nextLine();
        System.out.println("length of number: " + number.length());    


        while (i < number.length()) {
            num1 = number.charAt(i);
            if (num1 == '0') {
                counter++;
                if (counter > res) {
                    res = counter;                        
                }
            } else {
                counter = 0;
            }
            i++;
        }        
       
        System.out.println("Result is: " + res);		    
    }
}
