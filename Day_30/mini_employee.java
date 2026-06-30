
import java.util.Scanner;

class Employee {

    String empId;
    String name;
    String department;
    double salary;
}

public class mini_employee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee e = new Employee();
        boolean added = false;

        int choice;

        do {

            System.out.println("\n========== EMPLOYEE MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employee");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Exit");
            System.out.print("Enter Choice : ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Employee ID : ");
                    e.empId = sc.nextLine();

                    System.out.print("Enter Employee Name : ");
                    e.name = sc.nextLine();

                    System.out.print("Enter Department : ");
                    e.department = sc.nextLine();

                    System.out.print("Enter Salary : ");
                    e.salary = sc.nextDouble();
                    sc.nextLine();

                    added = true;

                    System.out.println("Employee Added Successfully.");
                    break;

                case 2:

                    if (!added) {
                        System.out.println("No Employee Record Found.");
                    } else {
                        System.out.println("\nEmployee ID : " + e.empId);
                        System.out.println("Name : " + e.name);
                        System.out.println("Department : " + e.department);
                        System.out.println("Salary : " + e.salary);
                    }

                    break;

                case 3:

                    if (!added) {
                        System.out.println("No Employee Record Found.");
                    } else {

                        System.out.print("Enter Employee ID : ");
                        String id = sc.nextLine();

                        if (e.empId.equals(id)) {
                            System.out.println("Employee Found");
                            System.out.println("Name : " + e.name);
                            System.out.println("Department : " + e.department);
                            System.out.println("Salary : " + e.salary);
                        } else {
                            System.out.println("Employee Not Found.");
                        }
                    }

                    break;

                case 4:

                    if (!added) {
                        System.out.println("No Employee Record Found.");
                    } else {

                        System.out.print("Enter Employee ID : ");
                        String id = sc.nextLine();

                        if (e.empId.equals(id)) {

                            System.out.print("Enter New Salary : ");
                            e.salary = sc.nextDouble();
                            sc.nextLine();

                            System.out.println("Salary Updated Successfully.");

                        } else {
                            System.out.println("Employee Not Found.");
                        }
                    }

                    break;

                case 5:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid Choice.");

            }

        } while (choice != 5);

        sc.close();
    }
}
