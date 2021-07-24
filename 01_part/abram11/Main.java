//boltaev lazizbek: abramyan task:11 b
import java.util.Scanner;

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        final double e = 2.7182;
        int x, y, z;
        double a, b;

        System.out.print("Enter the x: ");
        x = num.nextInt();

        System.out.print("Enter the y: ");
        y = num.nextInt();

        System.out.print("Enter the z: ");
        z = num.nextInt();

        a = (3 + Math.pow(e, y - 1)) / (1 + Math.sqrt(x) * Math.abs(y - Math.sin(z) / Math.cos(z)));
        b = 1 + Math.abs(y - x) + Math.sqrt(y -x) / 2 + Math.pow(Math.abs(y - x), 3) / 3;
        

        System.out.println("a: " + a);
        System.out.println("b: " + b);

    }
}

