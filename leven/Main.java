//boltaev lazizbek: Levenshtein
import java.util.Scanner;
import java.util.Arrays;



class Main {
  
    static int lev_dis(String str1, String str2)
    {
          
        if (str1.isEmpty())
        {
            return str2.length();
        }

        if (str2.isEmpty()) 
        {
            return str1.length();
        }       
  
        int replace = lev_dis(
              str1.substring(1), str2.substring(1))
              + NumOfReplacement(str1.charAt(0),str2.charAt(0));  
        
        int insert = lev_dis(
                         str1, str2.substring(1))+ 1; 
        
        int delete = lev_dis(
                         str1.substring(1), str2)+ 1;       
        
        return minm_edits(replace, insert, delete);
    }
  
    static int NumOfReplacement(char c1, char c2)
    {        
        return c1 == c2 ? 0 : 1;
    }
  
    static int minm_edits(int... nums)
    {        
        return Arrays.stream(nums).min().orElse(
            Integer.MAX_VALUE);
    }  
    
    public static void main(String args[])
    {
        Scanner num = new Scanner(System.in);
        String s1, s2;

        System.out.print("Enter the String 1: ");
        s1 = num.nextLine();

        System.out.print("Enter the String 2: ");
        s2 = num.nextLine();       
  
        System.out.println(lev_dis(s1, s2));
    }
}