
import java.io.*;
import java.util.*;

public class Student_management {

    HashMap<String, Student> map = new HashMap<>();
    Scanner sc;
    private int admin_pass;

    void addStudent() {
        int arr[], marks;
        int sem;
        Student student = new Student();
        String Roll_no;

        System.out.println("\n========== ADD NEW STUDENT ==========\n");

        System.out.print("Enter Student Name        : ");
        student.name = sc.nextLine();

        System.out.print(
                "Enter Age                 : ");
        student.age = sc.nextInt();

        sc.nextLine();

        System.out.print(
                "Enter Branch              : ");
        student.branch = sc.nextLine();

        Roll_no = genrate_roll_no();
        System.out.println(student.name + "'s authoried roll no is " + Roll_no);
        student.rollNo = Roll_no;

        System.out.print(
                "Enter Semester            : ");
        student.semester = sc.nextLine();
        sem = conv(student.semester);
        if (!(sem > 0)) {
            return;
        }

        System.out.print(
                "Enter Mobile Number       : ");
        student.mobNo = sc.nextLine();

        System.out.print(
                "Enter Email Address       : ");
        student.email = sc.nextLine();

        System.out.print(
                "Enter Residential Address : ");
        student.address = sc.nextLine();

        System.out.print(
                "Enter Total Fee           : ");
        student.totalFee = sc.nextInt();
        sc.nextLine();

        System.out.print(
                "Enter Fee Paid            : ");
        student.feepaid = sc.nextInt();
        sc.nextLine();

        System.out.print(
                "Enter Attendance (%)      : ");
        student.attendence = sc.nextDouble();
        sc.nextLine();

        System.out.print(
                "Enter CGPA                : ");
        student.cgpa = sc.nextDouble();
        sc.nextLine();

        System.out.println(
                "\n----- Enter Marks -----");
        for (int a = 1; a <= conv(student.semester); a++) {
            System.out.println("Marks for " + a + " Semestser");
            arr = new int[5];
            student.marks.put(a, arr);
            for (int i = 1; i <= 5; i++) {
                System.out.print("Subject " + i + " Marks : ");
                arr[i - 1] = sc.nextInt();

            }
            student.marks.put(a, arr);
        }
        sc.nextLine();

        System.out.println(
                "\nStudent record added successfully!");
        map.put(Roll_no, student);

    }

    private String genrate_roll_no() {

        Random r = new Random();
        boolean generated;

        StringBuilder acc = new StringBuilder(10);
        do {

            for (int a = 1; a <= 10; a++) {
                acc.append(r.nextInt(9) + 1);
            }
            if (map.containsKey(acc.toString())) {
                generated = false;
                acc.delete(0, acc.length());
            } else {
                generated = true;
            }

        } while (!generated);
        return acc.toString();
    }

    private int conv(String s) {

        char ch = s.charAt(0);

        if (Character.isDigit(ch)) {
            int a = Integer.parseInt(s);
            return a;
        }
        HashMap<String, Integer> romanToInt = new HashMap<>();

        romanToInt.put("I", 1);
        romanToInt.put("II", 2);
        romanToInt.put("III", 3);
        romanToInt.put("IV", 4);
        romanToInt.put("V", 5);
        romanToInt.put("VI", 6);
        romanToInt.put("VII", 7);
        romanToInt.put("VIII", 8);
        if (romanToInt.containsKey(s)) {
            return romanToInt.get(s);
        } else {
            System.out.println("Invalid Roman numeral");
        }
        return 0;

    }

    void delete_student(String roll_no) {
        if (map.containsKey(roll_no)) {
            map.remove(roll_no);
            System.out.println("Student profile deleted sucessfully");
        } else {
            System.out.println("No such profile found");
        }
    }

    void update(String RollNo) {
        int choice;
        int another;
        if (map.containsKey(RollNo)) {
            Student student = map.get(RollNo);
            do {
                another = -1;

                System.out.println("\n========== UPDATE STUDENT DETAILS ==========\n");

                System.out.println("Select the field you want to update:");
                System.out.println("1. Student Name");
                System.out.println("2. Age");
                System.out.println("3. Branch");
                System.out.println("4. Semester");
                System.out.println("5. Mobile Number");
                System.out.println("6. Email Address");
                System.out.println("7. Residential Address");
                System.out.println("8. Subject Marks");
                System.out.println("9. CGPA");
                System.out.println("10. Attendance");
                System.out.println("11. Fee Paid");
                System.out.println("12. Total Fee");
                System.out.println("Press 13 to update another record");
                System.out.println("14. Back to Main Menu");

                System.out.print("\nEnter your choice: ");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1: {
                        System.out.print("Enter Student Name        : ");
                        student.name = sc.nextLine();
                        System.out.println("Name Updated Successfully.");
                        break;
                    }
                    case 2: {
                        System.out.print("Enter Age                 : ");
                        student.age = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Age Updated Successfully.");
                        break;
                    }

                    case 3: {
                        System.out.println("Select Branch:");
                        System.out.println("1. CSE");
                        System.out.println("2. CSE-AI");
                        System.out.println("3. CSE-DS");
                        System.out.println("4. IT");
                        System.out.println("5. ECE");
                        System.out.println("6. ME");
                        System.out.print("Enter Branch Choice       : ");
                        student.branch = sc.nextLine();
                        System.out.println("Branch Updated Successfully.");
                        break;
                    }

                    case 4: {
                        System.out.print("Enter Semester            : ");
                        student.semester = sc.nextLine();
                        System.out.println("Semester Updated Successfully.");
                        break;
                    }

                    case 5: {
                        System.out.print("Enter Mobile Number       : ");
                        student.mobNo = sc.nextLine();
                        System.out.println("Mobile Number Updated Successfully.");
                        break;
                    }

                    case 6: {
                        System.out.print("Enter Email Address       : ");
                        student.email = sc.nextLine();
                        System.out.println("Email Address Updated Successfully.");
                        break;
                    }

                    case 7: {
                        System.out.print("Enter Residential Address : ");
                        student.address = sc.nextLine();
                        System.out.println("Address Updated Successfully.");
                        break;
                    }

                    case 8: {
                        int arr[];
                        System.out.println("\n----- UPDATE SUBJECT MARKS -----");
                        for (int i = 1; i <= student.marks.size(); i++) {
                            System.out.println("updating marks for " + i + " semster");
                            arr = student.marks.get(i);

                            for (int a = 0; a < 5; a++) {

                                System.out.print("Enter New Marks for Subject " + (i + 1) + " : ");
                                arr[a] = sc.nextInt();

                            }
                            student.marks.put(i, arr);
                        }
                        System.out.println("Marks Updated Successfully.");
                        sc.nextLine();
                        break;
                    }

                    case 9: {
                        System.out.print("Enter CGPA                : ");
                        student.cgpa = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("CGPA Updated Successfully.");
                        break;
                    }

                    case 10: {
                        System.out.print("Enter Attendance (%)      : ");
                        student.attendence = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Attendance Updated Successfully.");
                        break;
                    }

                    case 11: {
                        System.out.print("Enter Fee Paid            : ");
                        student.feepaid = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Fee Paid Updated Successfully.");
                        break;
                    }

                    case 12: {
                        System.out.print("Enter Total Fee           : ");
                        student.totalFee = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Total Fee Updated Successfully.");
                        break;
                    }
                    case 13: {
                        another = 1;
                        break;
                    }

                    case 14: {
                        System.out.println("Returning to Main Menu...");
                        break;
                    }
                }
            } while (another != -1);

        } else {
            System.out.println("No such record exists");

        }

    }

    void display(String Roll_No) {

        Student student = new Student();
        if (map.containsKey(Roll_No)) {
            student = map.get(Roll_No);

            System.out.println("\n==============================================");
            System.out.println("          STUDENT DETAILS");
            System.out.println("==============================================");

            System.out.println("Student Name         : " + student.name);
            System.out.println("Roll Number          : " + student.rollNo);
            System.out.println("Age                  : " + student.age);
            System.out.println("Branch               : " + student.branch);
            System.out.println("Semester             : " + student.semester);
            System.out.println("Mobile Number        : " + student.mobNo);
            System.out.println("Email Address        : " + student.email);
            System.out.println("Residential Address  : " + student.address);

            System.out.println("\n--------------- Marks ---------------");

            for (Map.Entry<Integer, int[]> entry : student.marks.entrySet()) {

                System.out.print("Semester " + entry.getKey() + " : ");

                int[] arr = entry.getValue();

                for (int i = 0; i < arr.length; i++) {
                    System.out.print("Subject " + (i + 1) + " = " + arr[i] + "  ");
                }

                System.out.println();
            }

            System.out.println("\nCGPA                 : " + student.cgpa);
            System.out.println("Attendance           : " + student.attendence + "%");
            System.out.println("Fee Paid             : ₹" + student.feepaid);
            System.out.println("Total Fee            : ₹" + student.totalFee);
            System.out.println("Remaining Fee        : ₹" + (student.totalFee - student.feepaid));

            System.out.println("==============================================");
        } else {
            System.out.println("No such record exists");
        }
    }

    void save_data() throws Exception {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Student_database.dat"));
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("password.dat"));
        out.writeObject(map);
        o.writeObject(admin_pass);
        out.close();
        o.close();
    }

    void read_account() throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("Student_database.dat"));
        ObjectInputStream i = new ObjectInputStream(new FileInputStream("password.dat"));

        map = (HashMap<String, Student>) in.readObject();
        admin_pass = (Integer) i.readObject();

        in.close();
        i.close();

    }

    void set_pass(int a) {
        if (admin_pass == 0) {
            admin_pass = a;
        } else {
            System.out.println("Enetr the previous password");
            int b = sc.nextInt();
            if (b == admin_pass) {
                admin_pass = a;
                System.out.println("password updated succesfully");

            } else {
                System.out.println("wrong password");
                System.out.println("password didn't updated");
            }
        }
    }

    boolean check_pass(int a) {
        if (a == admin_pass) {
            return true;
        } else {
            return false;
        }
    }
}
