import java.util.Scanner;


public class Problem1 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c, d;

        System.out.println("Enter value for a:  ");
        a = scan.nextInt();

        System.out.println("Enter value for b:  ");
        b = scan.nextInt();

        System.out.println("Enter value for c:  ");
        c = scan.nextInt();

        System.out.println("Enter value for d:  ");
        d = scan.nextInt();

        int Sum = sum(a, b, c, d);
        System.out.println("Sum: " + Sum);

        int Multiply = multiply(a, b, d);
        System.out.println("Product: " + Multiply);

        double Divide = divide(b, d);
        System.out.println("Quotient: " + Divide);

        int Subtract = subtract(b, c);
        System.out.println("Difference: " + Subtract);



    }

    public static int sum(int a, int b, int c, int d) {
        int result = a + b + c + d;
        return result;
    }

    public static int multiply(int a, int b, int c) {
        int result = a * b * c;
        return result;
    }

    public static double divide(int b, int d) {
        double result = (double) b / d;
        return result;
    }

    public static int subtract(int a, int b) {
        int result = a - b;
        return result;
    }

}

