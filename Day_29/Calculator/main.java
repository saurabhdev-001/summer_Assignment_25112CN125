
import java.util.*;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        operations op = new operations();
        op.sc = sc;

        int choice;

        do {
            System.out.println("\n======================================");
            System.out.println("          MENU DRIVEN CALCULATOR");
            System.out.println("======================================");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("7. Square");
            System.out.println("8. Cube");
            System.out.println("9. Square Root");
            System.out.println("10. Factorial");
            System.out.println("11. Percentage");
            System.out.println("12. Multiplication Table");
            System.out.println("13. Average");
            System.out.println("14. Exit");
            System.out.println("======================================");
            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    op.addition();
                    break;

                case 2:
                    op.subtraction();
                    break;

                case 3:
                    op.multiplication();
                    break;

                case 4:
                    op.division();
                    break;

                case 5:
                    op.modulus();
                    break;

                case 6:
                    op.power();
                    break;

                case 7:
                    op.square();
                    break;

                case 8:
                    op.cube();
                    break;

                case 9:
                    op.squareRoot();
                    break;

                case 10:
                    op.factorial();
                    break;

                case 11:
                    op.percentage();
                    break;

                case 12:
                    op.table();
                    break;

                case 13:
                    op.average();
                    break;

                case 14:
                    System.out.println("Thank You for using the Calculator!");
                    break;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }

        } while (choice != 14);

        sc.close();
    }
}
