
import java.util.*;

public class operations {

    Scanner sc;

    public void addition() {
        System.out.print("Enter First Number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter Second Number: ");
        double num2 = sc.nextDouble();

        double sum = num1 + num2;

        System.out.println("Result = " + sum);
    }

    public void subtraction() {
        System.out.print("Enter First Number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter Second Number: ");
        double num2 = sc.nextDouble();

        double difference = num1 - num2;

        System.out.println("Result = " + difference);
    }

    public void multiplication() {
        System.out.print("Enter First Number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter Second Number: ");
        double num2 = sc.nextDouble();

        double product = num1 * num2;

        System.out.println("Result = " + product);
    }

    public void division() {
        System.out.print("Enter Dividend: ");
        double a = sc.nextDouble();
        System.out.print("Enter Divisor: ");
        double b = sc.nextDouble();

        if (b == 0) {
            System.out.println("Division by zero is not possible.");
        } else {
            System.out.println("Result = " + (a / b));
        }
    }

    public void modulus() {
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        if (b == 0) {
            System.out.println("Modulus by zero is not possible.");
        } else {
            System.out.println("Result = " + (a % b));
        }
    }

    public void power() {
        System.out.print("Enter Base: ");
        double a = sc.nextDouble();
        System.out.print("Enter Exponent: ");
        double b = sc.nextDouble();

        System.out.println("Result = " + Math.pow(a, b));
    }

    public void square() {
        System.out.print("Enter Number: ");
        double a = sc.nextDouble();

        System.out.println("Square = " + (a * a));
    }

    public void cube() {
        System.out.print("Enter Number: ");
        double a = sc.nextDouble();

        System.out.println("Cube = " + (a * a * a));
    }

    public void squareRoot() {
        System.out.print("Enter Number: ");
        double a = sc.nextDouble();

        if (a < 0) {
            System.out.println("Square root of negative number is not possible.");
        } else {
            System.out.println("Square Root = " + Math.sqrt(a));
        }
    }

    public void factorial() {
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        long fact = 1;

        if (n < 0) {
            System.out.println("Factorial not possible.");
            return;
        }

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial = " + fact);
    }

    public void percentage() {
        System.out.print("Enter Obtained Number: ");
        double obtained = sc.nextDouble();

        System.out.print("Enter Total Number: ");
        double total = sc.nextDouble();

        if (total == 0) {
            System.out.println("Total number cannot be zero.");
        } else {
            System.out.println("Percentage = " + (obtained * 100 / total) + "%");
        }
    }

    public void table() {
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public void average() {
        System.out.print("Enter First Number: ");
        double a = sc.nextDouble();

        System.out.print("Enter Second Number: ");
        double b = sc.nextDouble();

        System.out.print("Enter Third Number: ");
        double c = sc.nextDouble();

        System.out.println("Average = " + ((a + b + c) / 3));
    }
}
