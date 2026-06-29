
import java.util.*;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        library lib = new library();
        lib.sc = sc;

        int choice;

        do {

            System.out.println("\n==================================================");
            System.out.println("          LIBRARY MANAGEMENT SYSTEM");
            System.out.println("==================================================");
            System.out.println("1. Add Book");
            System.out.println("2. Delete Book");
            System.out.println("3. Show All Books");
            System.out.println("4. Add Student");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");
            System.out.println("==================================================");
            System.out.print("Enter your choice : ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    lib.AddBook();
                    break;

                case 2:
                    lib.delete_book();
                    break;

                case 3:
                    lib.showall();
                    break;

                case 4:
                    lib.addStudent();
                    break;

                case 5:
                    lib.issue();
                    break;

                case 6:
                    lib.returnBook();
                    break;

                case 7:
                    System.out.println("\n========================================");
                    System.out.println("Thank You For Using Library System");
                    System.out.println("========================================");
                    break;

                default:
                    System.out.println("\nInvalid Choice! Please Try Again.");
            }

        } while (choice != 7);

        sc.close();
    }
}
