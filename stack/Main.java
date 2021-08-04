//boltaev lazizbek: task: stack
import java.util.Scanner;
import java.util.Stack;
import java.io.*;


public class Main {

    public static void main(String[] args) {
        Stack<Double> operand = new Stack<Double>();
        Stack<String> operator = new Stack<String>();

        Scanner num = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String x = num.nextLine();

        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            String c = String.valueOf(ch);

            if(c.equals("(") || c.equals(" ") )   ;
            else if (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")  || c.equals("sqrt") )
                operator.push(c);
            else if (c.equals(")")) {
                String tor = operator.pop();
                Double and = operand.pop();
                switch(tor)
                    {
                        case "+":
                        and += operand.pop();
                        break;

                        case "-":
                        and = operand.pop() - and;
                        break;

                        case "/":
                        and = operand.pop() / and;
                        break;

                        case "*":
                        and *= operand.pop();
                        break;

                        case "sqrt":
                        and = Math.sqrt(and);
                        break;
                  }
                  operand.push(and);
            } else operand.push(Double.parseDouble(c));

        }
        System.out.print("Result is: " + operand.pop());
    }
}
