
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        management obj = new management();
        obj.sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n========================================");
            System.out.println("      CONTACT MANAGEMENT SYSTEM");
            System.out.println("========================================");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Update Contact");
            System.out.println("4. Exit");
            System.out.println("========================================");
            System.out.print("Enter Your Choice: ");

            choice = obj.sc.nextInt();
            obj.sc.nextLine(); // Consume newline

            switch (choice) {

                case 1:
                    obj.addcontacts();
                    break;

                case 2:
                    obj.checkContact();
                    break;

                case 3:
                    obj.update();
                    break;

                case 4:
                    System.out.println("\nThank You for Using Contact Management System!");
                    break;

                default:
                    System.out.println("\nInvalid Choice! Please Try Again.");
            }

        } while (choice != 4);

        obj.sc.close();
    }
}
