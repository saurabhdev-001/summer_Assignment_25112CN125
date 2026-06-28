package salary;

import employee.Management;
import java.io.*;
import java.util.*;

public class management {

    HashMap<Integer, employeSalDet> record = new HashMap<>();
    Scanner sc;
    Management obj = new Management();

    void addEmployee(int id) {

        if (!obj.data.containsKey(id)) {
            System.out.println("Employee Not Found.");
            return;
        }
        if (record.containsKey(id)) {
            System.out.println("Salary Record Already Exists.");
            return;
        }

        employeSalDet sal = new employeSalDet();

        System.out.print("Enter Basic Salary : ");
        sal.basicSalary = sc.nextDouble();

        System.out.print("Enter HRA : ");
        sal.hra = sc.nextDouble();

        System.out.print("Enter DA : ");
        sal.da = sc.nextDouble();

        System.out.print("Enter TA : ");
        sal.ta = sc.nextDouble();

        System.out.print("Enter Bonus : ");
        sal.bonus = sc.nextDouble();

        System.out.print("Enter PF : ");
        sal.pf = sc.nextDouble();

        System.out.print("Enter Tax : ");
        sal.tax = sc.nextDouble();

        System.out.print("Enter Insurance : ");
        sal.insurance = sc.nextDouble();

        System.out.print("Enter Loan Deduction : ");
        sal.loanDeduction = sc.nextDouble();

        record.put(id, sal);

        System.out.println("Salary Record Added Successfully.");
    }

    void updateEmployee(int id) {
        if (!obj.data.containsKey(id)) {
            System.out.println("Employee Not Found.");
            return;
        }

        if (!record.containsKey(id)) {
            System.out.println("Salary Record Not Found.");
            return;
        }

        employeSalDet sal = record.get(id);

        int choice;

        do {

            System.out.println("\n===== UPDATE SALARY =====");
            System.out.println("1. Basic Salary");
            System.out.println("2. HRA");
            System.out.println("3. DA");
            System.out.println("4. TA");
            System.out.println("5. Bonus");
            System.out.println("6. PF");
            System.out.println("7. Tax");
            System.out.println("8. Insurance");
            System.out.println("9. Loan Deduction");
            System.out.println("10. Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Basic Salary : ");
                    sal.basicSalary = sc.nextDouble();
                    break;

                case 2:
                    System.out.print("Enter HRA : ");
                    sal.hra = sc.nextDouble();
                    break;

                case 3:
                    System.out.print("Enter DA : ");
                    sal.da = sc.nextDouble();
                    break;

                case 4:
                    System.out.print("Enter TA : ");
                    sal.ta = sc.nextDouble();
                    break;

                case 5:
                    System.out.print("Enter Bonus : ");
                    sal.bonus = sc.nextDouble();
                    break;

                case 6:
                    System.out.print("Enter PF : ");
                    sal.pf = sc.nextDouble();
                    break;

                case 7:
                    System.out.print("Enter Tax : ");
                    sal.tax = sc.nextDouble();
                    break;

                case 8:
                    System.out.print("Enter Insurance : ");
                    sal.insurance = sc.nextDouble();
                    break;

                case 9:
                    System.out.print("Enter Loan Deduction : ");
                    sal.loanDeduction = sc.nextDouble();
                    break;

                case 10:
                    System.out.println("Returning...");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 10);

        sc.nextLine();
    }

    void deleteEmployee(int id) {
        if (!obj.data.containsKey(id)) {
            System.out.println("Employee Not Found.");
            return;
        }

        if (!record.containsKey(id)) {
            System.out.println("Salary Record Not Found.");
            return;
        }

        record.remove(id);
        System.out.println("Salary Record Deleted Successfully.");
    }

    void calculateSalary(int id) {
        if (!obj.data.containsKey(id)) {
            System.out.println("Employee Not Found.");
            return;
        }

        if (!record.containsKey(id)) {
            System.out.println("Salary Record Not Found.");
            return;
        }

        employeSalDet sal = record.get(id);

        sal.grossSalary = sal.basicSalary
                + sal.hra
                + sal.da
                + sal.ta
                + sal.bonus;

        sal.netSalary = sal.grossSalary
                - (sal.pf + sal.tax + sal.insurance + sal.loanDeduction);

        System.out.println("Salary Calculated Successfully.");
    }

    void displaySalary(int id) {
        if (!obj.data.containsKey(id)) {
            System.out.println("Employee Not Found.");
            return;
        }

        if (!record.containsKey(id)) {
            System.out.println("Salary Record Not Found.");
            return;
        }

        employeSalDet sal = record.get(id);

        System.out.println("\n========== SALARY DETAILS ==========");

        System.out.println("Basic Salary  : " + sal.basicSalary);
        System.out.println("HRA           : " + sal.hra);
        System.out.println("DA            : " + sal.da);
        System.out.println("TA            : " + sal.ta);
        System.out.println("Bonus         : " + sal.bonus);

        System.out.println("------------------------------------");

        System.out.println("Gross Salary  : " + sal.grossSalary);

        System.out.println("PF            : " + sal.pf);
        System.out.println("Tax           : " + sal.tax);
        System.out.println("Insurance     : " + sal.insurance);
        System.out.println("Loan Deduction: " + sal.loanDeduction);

        System.out.println("------------------------------------");

        System.out.println("Net Salary    : " + sal.netSalary);
    }

    void generatePayslip(int id) {
        if (!obj.data.containsKey(id)) {
            System.out.println("Employee Not Found.");
            return;
        }

        if (!record.containsKey(id)) {
            System.out.println("Salary Record Not Found.");
            return;
        }

        employeSalDet sal = record.get(id);

        System.out.println("\n====================================");
        System.out.println("            PAY SLIP");
        System.out.println("====================================");

        System.out.println("Employee ID    : " + id);

        System.out.println("------------------------------------");

        System.out.println("Basic Salary   : " + sal.basicSalary);
        System.out.println("HRA            : " + sal.hra);
        System.out.println("DA             : " + sal.da);
        System.out.println("TA             : " + sal.ta);
        System.out.println("Bonus          : " + sal.bonus);

        System.out.println("------------------------------------");

        System.out.println("Gross Salary   : " + sal.grossSalary);

        System.out.println("PF             : " + sal.pf);
        System.out.println("Tax            : " + sal.tax);
        System.out.println("Insurance      : " + sal.insurance);
        System.out.println("Loan Deduction : " + sal.loanDeduction);

        System.out.println("------------------------------------");

        System.out.println("Net Salary     : " + sal.netSalary);

        System.out.println("====================================");
    }

    @SuppressWarnings("unchecked")

    void saveSalaryData() throws Exception {

        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("salary_database.dat"));

        out.writeObject(record);

        out.close();

        System.out.println("Salary Database Saved Successfully.");
    }

    @SuppressWarnings("unchecked")
    void loadSalaryData() throws Exception {

        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("salary_database.dat"));

        record = (HashMap<Integer, employeSalDet>) in.readObject();

        in.close();

        System.out.println("Salary Database Loaded Successfully.");
    }

}
