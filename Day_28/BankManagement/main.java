
import java.util.Scanner;

public class main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        bank obj = new bank(sc);
        boolean sign_in = true;
        try {
            obj.read_account();
        } catch (Exception e) {
            System.out.println("No data retrieved from account centre");
        }
        while (sign_in) {

            System.out.println("\n========================================");
            System.out.println("         BANK MANAGEMENT SYSTEM");
            System.out.println("========================================");
            System.out.println("1. Create New Account");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. View Account Details");
            System.out.println("5. View Transaction History");
            System.out.println("0. Exit");
            System.out.println("========================================");
            System.out.print("Enter Your Choice : ");

            int ca = sc.nextInt();

            switch (ca) {

                case 1:
                    System.out.println("\n========== CREATE ACCOUNT ==========");
                    sc.nextLine();
                    obj.create_acc();
                    break;

                case 2:
                    System.out.println("\n========== WITHDRAW MONEY ==========");
                    System.out.print("Enter Account Number  : ");
                    System.out.print("\nEnter Withdrawal Amount : ");
                    obj.withdraw(sc.nextLong(), sc.nextInt());
                    break;

                case 3:
                    System.out.println("\n========== DEPOSIT MONEY ==========");
                    System.out.print("Enter Account Number : ");
                    System.out.print("\nEnter Deposit Amount : ");
                    obj.deposit(sc.nextLong(), sc.nextInt());
                    break;

                case 4:
                    System.out.println("\n========== ACCOUNT DETAILS ==========");
                    System.out.print("Enter Account Number : ");
                    obj.print_details(sc.nextLong());
                    break;

                case 5:
                    System.out.println("\n========== TRANSACTION HISTORY ==========");
                    System.out.print("Enter Account Number : ");
                    obj.print_transactions(sc.nextLong());
                    break;

                case 0:
                    sign_in = false;

                    try {
                        obj.save_data();
                        System.out.println("\nData Saved Successfully.");
                    } catch (Exception e) {
                        System.out.println("\nFailed To Save Data.");
                    }

                    System.out.println("\nThank You For Using BANK Management System.");
                    break;

                default:
                    System.out.println("\nInvalid Choice. Please Try Again.");
            }
        }
    }

}
