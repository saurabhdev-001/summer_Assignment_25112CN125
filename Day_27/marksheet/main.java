
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        marksheet_formation obj = new marksheet_formation();
        obj.sc = sc;

        try {
            obj.read_account();
            System.out.println("Database Loaded Successfully.");
        } catch (Exception e) {
            System.out.println("No Previous Database Found.");
        }

        int choice;
        String rollNo;

        do {

            System.out.println("\n================================================");
            System.out.println("          MARKSHEET GENERATION SYSTEM");
            System.out.println("================================================");
            System.out.println("1. Add Student");
            System.out.println("2. Generate Marksheet");
            System.out.println("3. Save Database");
            System.out.println("4. Load Database");
            System.out.println("5. Exit");
            System.out.println("================================================");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    obj.addStudent();
                    break;

                case 2:

                    System.out.print("Enter Roll Number : ");
                    rollNo = sc.nextLine();
                    obj.gen_marksheet(rollNo);
                    break;

                case 3:

                    try {
                        obj.save_data();
                        System.out.println("Database Saved Successfully.");
                    } catch (Exception e) {
                        System.out.println("Unable to Save Database.");
                    }

                    break;

                case 4:

                    try {
                        obj.read_account();
                        System.out.println("Database Loaded Successfully.");
                    } catch (Exception e) {
                        System.out.println("Unable to Load Database.");
                    }

                    break;

                case 5:

                    try {
                        obj.save_data();
                    } catch (Exception e) {
                    }

                    System.out.println("Thank You for Using Marksheet Generation System.");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
