
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        management obj = new management();
        obj.sc = new Scanner(System.in);

        int choice;

        System.out.println("========================================");
        System.out.println("      TICKET BOOKING MANAGEMENT");
        System.out.println("========================================");

        do {

            System.out.println("\n============== MENU ==============");
            System.out.println("1. Add Ticket");
            System.out.println("2. Print Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Exit");
            System.out.println("==================================");
            System.out.print("Enter your choice : ");

            choice = obj.sc.nextInt();
            obj.sc.nextLine(); // Consume newline

            switch (choice) {

                case 1:
                    obj.addTicket();
                    break;

                case 2:
                    obj.printTicket();
                    break;

                case 3:
                    obj.cancel_Ticket();
                    break;

                case 4:
                    System.out.println("\nThank you for using the Ticket Booking System.");
                    break;

                default:
                    System.out.println("\nInvalid choice! Please try again.");
            }

        } while (choice != 4);

        obj.sc.close();
    }
}
