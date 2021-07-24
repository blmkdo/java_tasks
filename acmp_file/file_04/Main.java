//boltaev lazizbek: acmp task:04 with file
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
        String[] inNum = line.split(" ");
        scanner.close();
        int res = 0, i = 0, counter = 0;
        char num1;

        while (i < inNum[0].length()) {
            num1 = inNum[0].charAt(i);
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

        try {
            File output = new File("OUTPUT.txt");

            if(!output.exists())
                output.createNewFile();

            PrintWriter pw = new PrintWriter(output);
            pw.println("Result is: " + res);
            pw.close();
        } catch (IOException e) {
            System.out.println("Error" + e);
        }
        		    
    }
}

