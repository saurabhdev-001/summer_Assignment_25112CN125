
import java.util.Scanner; // Admin password is 857792

public class main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choice;
        String rollNo;
        int pass;
        Student_management sm = new Student_management();
        sm.sc = sc;
        try {
            sm.read_account();
            System.out.println("Database Loaded Successfully.");

        } catch (Exception e) {
            System.out.println("Data doesnot Saved.");

        }

        System.out.println("====================================");
        System.out.println(" STUDENT MANAGEMENT SYSTEM ");
        System.out.println("====================================");

        if (sm.check_pass(0)) {
            System.out.print("Create Admin Password : ");
            pass = sc.nextInt();
            sc.nextLine();
            sm.set_pass(pass);
            System.out.println("Password Created Successfully.\n");
        }

        do {

            System.out.println("\n==================================================");
            System.out.println("      STUDENT RECORD MANAGEMENT SYSTEM");
            System.out.println("==================================================");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Update Student");
            System.out.println("4. Display Student");
            System.out.println("5. Save Records");
            System.out.println("6. Load Records");
            System.out.println("7. Change Admin Password");
            System.out.println("8. Exit");
            System.out.println("==================================================");
            System.out.print("Enter your choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            if (choice != 8 && choice != 6) {
                System.out.print("Enter Admin Password : ");
                pass = sc.nextInt();
                sc.nextLine();

                if (!sm.check_pass(pass)) {
                    System.out.println("Incorrect Password!");
                    continue;
                }
            }

            switch (choice) {

                case 1:
                    sm.addStudent();
                    break;

                case 2:
                    System.out.print("Enter Roll Number : ");
                    rollNo = sc.nextLine();
                    sm.delete_student(rollNo);
                    break;

                case 3:
                    System.out.print("Enter Roll Number : ");
                    rollNo = sc.nextLine();
                    sm.update(rollNo);
                    break;

                case 4:
                    System.out.print("Enter Roll Number : ");
                    rollNo = sc.nextLine();
                    sm.display(rollNo);
                    break;

                case 5:
                    try {
                        sm.save_data();
                    } catch (Exception e) {
                        System.out.println("Data doesnot Saved.");
                        break;

                    }
                    System.out.println("Database Saved Successfully.");
                    break;

                case 6:
                    try {
                        sm.read_account();
                    } catch (Exception e) {
                        System.out.println("Data doesnot Saved.");
                        break;

                    }
                    System.out.println("Database Loaded Successfully.");
                    break;

                case 7:
                    System.out.print("Enter New Password : ");
                    pass = sc.nextInt();
                    sm.set_pass(pass);
                    break;

                case 8:
                    System.out.println("Thank You for Using Student Management System.");
                    try {
                        sm.save_data();
                        System.out.println("Database Saved Successfully.");
                    } catch (Exception e) {
                        System.out.println("Data doesnot Saved.");

                    }

                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 8);

    }
}
