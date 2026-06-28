package employee;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Management obj = new Management();
        obj.sc = sc;

        try {
            obj.loadData();
            System.out.println("Database Loaded Successfully.");
        } catch (Exception e) {
            System.out.println("No Previous Database Found.");
        }

        if (obj.checkPassword(0)) {
            obj.createPassword();
        }

        int choice;
        int id;
        int pass;

        do {

            System.out.println("\n================================================");
            System.out.println("         EMPLOYEE MANAGEMENT SYSTEM");
            System.out.println("================================================");
            System.out.println("1. Add Employee");
            System.out.println("2. Delete Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Display Employee");
            System.out.println("5. Check Leave Availability");
            System.out.println("6. Save Records");
            System.out.println("7. Load Records");
            System.out.println("8. Change Admin Password");
            System.out.println("9. Exit");
            System.out.println("================================================");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            if (choice != 9 && choice != 7) {

                System.out.print("Enter Admin Password : ");
                pass = sc.nextInt();
                sc.nextLine();

                if (!obj.checkPassword(pass)) {
                    System.out.println("Incorrect Password.");
                    continue;
                }
            }

            switch (choice) {

                case 1:
                    obj.add_employee();
                    break;

                case 2:
                    System.out.print("Enter Employee ID : ");
                    id = sc.nextInt();
                    obj.deleteEmployee(id);
                    break;

                case 3:
                    System.out.print("Enter Employee ID : ");
                    id = sc.nextInt();
                    sc.nextLine();
                    obj.updateEmployee(id);
                    break;

                case 4:
                    System.out.print("Enter Employee ID : ");
                    id = sc.nextInt();
                    obj.displayEmployee(id);
                    break;

                case 5:
                    System.out.print("Enter Employee ID : ");
                    id = sc.nextInt();

                    if (obj.leave_management(id)) {
                        System.out.println("Leave Available.");
                    } else {
                        System.out.println("No Leave Remaining.");
                    }

                    break;

                case 6:

                    try {
                        obj.saveData();
                        System.out.println("Database Saved Successfully.");
                    } catch (Exception e) {
                        System.out.println("Unable to Save Database.");
                    }

                    break;

                case 7:

                    try {
                        obj.loadData();
                        System.out.println("Database Loaded Successfully.");
                    } catch (Exception e) {
                        System.out.println("Unable to Load Database.");
                    }

                    break;

                case 8:
                    obj.changePassword();
                    break;

                case 9:

                    try {
                        obj.saveData();
                    } catch (Exception e) {
                    }

                    System.out.println("Thank You for Using Employee Management System.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 9);

        sc.close();
    }
}
