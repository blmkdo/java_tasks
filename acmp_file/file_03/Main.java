//boltaev lazizbek: acmp task:03 with file
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
        int i, j;
        char num1 = '0';             

        
        try {
            File output = new File("OUTPUT.txt");

            if(!output.exists())
                output.createNewFile();

            PrintWriter pw = new PrintWriter(output);
            for (i = 0; i < inNum[0].length(); i++) {
                for (j = 0; j < inNum[1].length(); j++) {
                    if (inNum[0].charAt(i) == inNum[1].charAt(j) && inNum[0].charAt(i) != num1) {
                        num1 = inNum[0].charAt(i);
                        pw.print(num1 + " "); 
                    }               
                }
            }           


            pw.close();
        } catch (IOException e) {
            System.out.println("Error" + e);
        }               
        	    
    }
}


        

        

        