//boltaev lazizbek: acmp task:01 with file
import java.util.Scanner;
import java.io.File;
import java.util. Arrays;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("INPUT.txt");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[3];
        int counter = 0;

        for(String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }
        int num1 = numbers[0];
        int num2 = numbers[1];
        int d = numbers[2];
        scanner.close();
        int k, res;
        k = num2 - num1;
        res = num2;
        for (int i = 0; i < d ; i++ ) {
            res += k;            
        }

        try {
            File output = new File("OUTPUT.txt");

            if(!output.exists())
                output.createNewFile();

            PrintWriter pw = new PrintWriter(output);
            pw.println(res);
            pw.close();
        } catch (IOException e) {
            System.out.println("Error" + e);
        }   
    }
}



