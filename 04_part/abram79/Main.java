//boltaev lazizbek: abramyan task:79
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double ind = 0.1, res;     
          
        res = 1 + Math.sin(ind);
        while (ind <= 10) {
            ind += 0.1;
            res *= (1 + Math.sin(ind));
        }  
        
        System.out.println("Result: " + res);    
    }
}
