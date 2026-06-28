package employee;

import java.io.*;
import java.util.*;

public class Management {

    public HashMap<Integer, employee> data = new HashMap<>();
    public Scanner sc;
    private int adminPass;

    void add_employee() {

        employee emp = new employee();

        System.out.println("\n========== ADD NEW EMPLOYEE ==========\n");

        emp.empId = gen_emp_id();
        System.out.println("Generated Employee ID : " + emp.empId);

        System.out.print("Enter Employee Name       : ");
        emp.name = sc.nextLine();

        System.out.print("Enter Age                 : ");
        emp.age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Gender              : ");
        emp.gender = sc.nextLine();

        System.out.print("Enter Department          : ");
        emp.department = sc.nextLine();

        System.out.print("Enter Designation         : ");
        emp.designation = sc.nextLine();

        System.out.print("Enter Salary              : ");
        emp.salary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Mobile Number       : ");
        emp.mobileNo = sc.nextLine();

        System.out.print("Enter Email Address       : ");
        emp.email = sc.nextLine();

        System.out.print("Enter Residential Address : ");
        emp.address = sc.nextLine();

        System.out.print("Enter Joining Date        : ");
        emp.joiningDate = sc.nextLine();

        System.out.print("Enter Experience (Years)  : ");
        emp.experience = sc.nextDouble();

        System.out.print("Enter Bonus               : ");
        emp.bonus = sc.nextDouble();

        System.out.print("Enter Total Leaves        : ");
        emp.totalLeaves = sc.nextInt();

        System.out.print("Enter Leaves Taken        : ");
        emp.leavesTaken = sc.nextInt();
        sc.nextLine();

        data.put(emp.empId, emp);

        System.out.println("\nEmployee Added Successfully!");
        System.out.println("Employee ID : " + emp.empId);
    }

    private int gen_emp_id() {
        Random r = new Random();
        int a;
        boolean gen = false;
        do {
            a = r.nextInt(1000);
            if (!data.containsKey(a)) {
                gen = true;
            }

        } while (gen == false);
        return a;

    }

    public void deleteEmployee(int id) {

        if (data.containsKey(id)) {
            data.remove(id);
            System.out.println("Employee Deleted Successfully.");
        } else {
            System.out.println("Employee Not Found.");
        }

    }

    public void updateEmployee(int id) {

        if (!data.containsKey(id)) {
            System.out.println("Employee Not Found.");
            return;
        }

        employee emp = data.get(id);

        int choice;

        do {

            System.out.println("\n========== UPDATE EMPLOYEE ==========");
            System.out.println("1. Name");
            System.out.println("2. Age");
            System.out.println("3. Gender");
            System.out.println("4. Department");
            System.out.println("5. Designation");
            System.out.println("6. Salary");
            System.out.println("7. Mobile Number");
            System.out.println("8. Email");
            System.out.println("9. Address");
            System.out.println("10. Joining Date");
            System.out.println("11. Experience");
            System.out.println("12. Bonus");
            System.out.println("13. Total Leaves");
            System.out.println("14. Leaves Taken");
            System.out.println("15. Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter New Name : ");
                    emp.name = sc.nextLine();
                    break;

                case 2:
                    System.out.print("Enter New Age : ");
                    emp.age = sc.nextInt();
                    sc.nextLine();
                    break;

                case 3:
                    System.out.print("Enter Gender : ");
                    emp.gender = sc.nextLine();
                    break;

                case 4:
                    System.out.print("Enter Department : ");
                    emp.department = sc.nextLine();
                    break;

                case 5:
                    System.out.print("Enter Designation : ");
                    emp.designation = sc.nextLine();
                    break;

                case 6:
                    System.out.print("Enter Salary : ");
                    emp.salary = sc.nextDouble();
                    sc.nextLine();
                    break;

                case 7:
                    System.out.print("Enter Mobile Number : ");
                    emp.mobileNo = sc.nextLine();
                    break;

                case 8:
                    System.out.print("Enter Email : ");
                    emp.email = sc.nextLine();
                    break;

                case 9:
                    System.out.print("Enter Address : ");
                    emp.address = sc.nextLine();
                    break;

                case 10:
                    System.out.print("Enter Joining Date : ");
                    emp.joiningDate = sc.nextLine();
                    break;

                case 11:
                    System.out.print("Enter Experience : ");
                    emp.experience = sc.nextDouble();
                    sc.nextLine();
                    break;

                case 12:
                    System.out.print("Enter Bonus : ");
                    emp.bonus = sc.nextDouble();
                    sc.nextLine();
                    break;

                case 13:
                    System.out.print("Enter Total Leaves : ");
                    emp.totalLeaves = sc.nextInt();
                    sc.nextLine();
                    break;

                case 14:
                    System.out.print("Enter Leaves Taken : ");
                    emp.leavesTaken = sc.nextInt();
                    sc.nextLine();
                    break;

                case 15:
                    System.out.println("Returning...");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 15);

    }

    public void displayEmployee(int id) {

        if (!data.containsKey(id)) {
            System.out.println("Employee Not Found.");
            return;
        }

        employee emp = data.get(id);

        System.out.println("\n========================================");
        System.out.println("         EMPLOYEE DETAILS");
        System.out.println("========================================");

        System.out.println("Employee ID      : " + emp.empId);
        System.out.println("Name             : " + emp.name);
        System.out.println("Age              : " + emp.age);
        System.out.println("Gender           : " + emp.gender);
        System.out.println("Department       : " + emp.department);
        System.out.println("Designation      : " + emp.designation);
        System.out.println("Salary           : " + emp.salary);
        System.out.println("Bonus            : " + emp.bonus);
        System.out.println("Experience       : " + emp.experience + " Years");
        System.out.println("Joining Date     : " + emp.joiningDate);
        System.out.println("Mobile Number    : " + emp.mobileNo);
        System.out.println("Email            : " + emp.email);
        System.out.println("Address          : " + emp.address);
        System.out.println("Leaves Taken     : " + emp.leavesTaken);
        System.out.println("Leaves Remaining : " + (emp.totalLeaves - emp.leavesTaken));
        System.out.println("========================================");

    }

    public void saveData() throws Exception {

        ObjectOutputStream out
                = new ObjectOutputStream(new FileOutputStream("employee_database.dat"));

        out.writeObject(data);
        out.writeInt(adminPass);

        out.close();

    }

    public void loadData() throws Exception {

        ObjectInputStream in
                = new ObjectInputStream(new FileInputStream("employee_database.dat"));

        data = (HashMap<Integer, employee>) in.readObject();
        adminPass = in.readInt();

        in.close();

    }

    boolean leave_management(int id) {
        employee emp = data.get(id);
        if (emp.totalLeaves <= emp.leavesTaken) {
            return false;
        } else {
            return true;
        }
    }

    void changePassword() {

        System.out.print("Enter Current Password : ");
        int oldPass = sc.nextInt();

        if (!checkPassword(oldPass)) {
            System.out.println("Incorrect Password.");
            return;
        }

        System.out.print("Enter New Password : ");
        int newPass = sc.nextInt();

        System.out.print("Confirm New Password : ");
        int confirmPass = sc.nextInt();

        if (newPass != confirmPass) {
            System.out.println("Passwords do not match.");
            return;
        }

        adminPass = newPass;
        System.out.println("Password Changed Successfully.");
    }

    boolean checkPassword(int pass) {
        return pass == adminPass;
    }

    void createPassword() {

        if (adminPass != 0) {
            System.out.println("Password Already Exists.");
            return;
        }

        System.out.print("Create Admin Password : ");
        adminPass = sc.nextInt();

        System.out.println("Password Created Successfully.");
    }
}
