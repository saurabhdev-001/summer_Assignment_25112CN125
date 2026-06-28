package salary;

import java.util.Scanner;

public class salMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        management obj = new management();

        obj.sc = sc;
        obj.obj.sc = sc;

        try {
            obj.obj.loadData();
            System.out.println("Employee Database Loaded Successfully.");
        } catch (Exception e) {
            System.out.println("Employee Database Not Found.");
        }

        try {
            obj.loadSalaryData();
        } catch (Exception e) {
            System.out.println("Salary Database Not Found.");
        }

        int choice;
        int id;

        do {

            System.out.println("\n==============================================");
            System.out.println("        SALARY MANAGEMENT SYSTEM");
            System.out.println("==============================================");
            System.out.println("1. Add Salary Record");
            System.out.println("2. Update Salary Record");
            System.out.println("3. Delete Salary Record");
            System.out.println("4. Calculate Salary");
            System.out.println("5. Display Salary");
            System.out.println("6. Generate Payslip");
            System.out.println("7. Display Employee Details");
            System.out.println("8. Update Employee Details");
            System.out.println("9. Save Salary Database");
            System.out.println("10. Load Salary Database");
            System.out.println("11. Exit");
            System.out.println("==============================================");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Employee ID : ");
                    id = sc.nextInt();
                    obj.addEmployee(id);
                    break;

                case 2:

                    System.out.print("Enter Employee ID : ");
                    id = sc.nextInt();
                    obj.updateEmployee(id);
                    break;

                case 3:

                    System.out.print("Enter Employee ID : ");
                    id = sc.nextInt();
                    obj.deleteEmployee(id);
                    break;

                case 4:

                    System.out.print("Enter Employee ID : ");
                    id = sc.nextInt();
                    obj.calculateSalary(id);
                    break;

                case 5:

                    System.out.print("Enter Employee ID : ");
                    id = sc.nextInt();
                    obj.displaySalary(id);
                    break;

                case 6:

                    System.out.print("Enter Employee ID : ");
                    id = sc.nextInt();
                    obj.generatePayslip(id);
                    break;

                case 7:

                    System.out.print("Enter Employee ID : ");
                    id = sc.nextInt();
                    obj.obj.displayEmployee(id);
                    break;

                case 8:

                    System.out.print("Enter Employee ID : ");
                    id = sc.nextInt();
                    sc.nextLine();
                    obj.obj.updateEmployee(id);
                    break;

                case 9:

                    try {
                        obj.saveSalaryData();
                    } catch (Exception e) {
                        System.out.println("Unable to Save Salary Database.");
                    }

                    break;

                case 10:

                    try {
                        obj.loadSalaryData();
                    } catch (Exception e) {
                        System.out.println("Unable to Load Salary Database.");
                    }

                    break;

                case 11:

                    try {
                        obj.saveSalaryData();
                    } catch (Exception e) {
                    }

                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 11);

        sc.close();
    }
}
