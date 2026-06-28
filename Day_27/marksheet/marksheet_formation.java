
import java.io.*;
import java.util.*;

public class marksheet_formation {

    HashMap<String, student> map = new HashMap<>();

    Scanner sc;
    private int admin_pass;
    String[] subjects = {
        "Java",
        "Data Structures",
        "DBMS",
        "Operating System",
        "Computer Networks",
        "Mathematics"
    };

    void addStudent() {
        int arr[], marks;
        int sem;
        student student = new student();

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

        System.out.println("enter the roll no ");
        student.rollNo = sc.nextLine();

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
                "Enter Residential Address : ");
        student.address = sc.nextLine();

        System.out.print(
                "Enter CGPA                : ");
        student.cgpa = sc.nextDouble();
        sc.nextLine();

        System.out.println(
                "\n----- Enter Marks -----");
        sem = conv(student.semester);
        for (int a = 1; a <= sem; a++) {
            System.out.println("Marks for " + a + " Semestser");
            arr = new int[6];
            student.marks.put(a, arr);

            for (int i = 1; i <= 6; i++) {
                System.out.print(subjects[i - 1] + " Marks : ");

                arr[i - 1] = sc.nextInt();

            }
            student.marks.put(a, arr);
        }
        sc.nextLine();

        System.out.println(
                "\nStudent record added successfully!");
        map.put(student.rollNo, student);

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

    void save_data() throws Exception {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Student_database.dat"));

        out.writeObject(map);

        out.close();

    }

    void read_account() throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("Student_database.dat"));

        map = (HashMap<String, student>) in.readObject();

        in.close();

    }

    void gen_marksheet(String roll_no) {
        student stu = map.get(roll_no);

        System.out.println("\n============================================================");
        System.out.println("                 STUDENT MARKSHEET");
        System.out.println("============================================================");

        System.out.println("Name       : " + stu.name);
        System.out.println("Roll No.   : " + stu.rollNo);
        System.out.println("Age        : " + stu.age);
        System.out.println("Branch     : " + stu.branch);
        System.out.println("Semester   : " + stu.semester);
        System.out.println("Mobile No. : " + stu.mobNo);
        System.out.println("Address    : " + stu.address);

        System.out.println("------------------------------------------------------------");
        System.out.printf("%-5s %-20s %-10s %-10s%n",
                "S.No", "Subject", "Marks", "Max");
        System.out.println("------------------------------------------------------------");

        int total = 0;
        int maxTotal = 0;

        int sem = conv(stu.semester);
        int[] m = stu.marks.get(sem);

        if (m == null) {
            System.out.println("Marks not found.");
            return;
        }

        for (int i = 0; i < subjects.length; i++) {

            System.out.printf("%-5d %-20s %-10d %-10d%n",
                    i + 1,
                    subjects[i],
                    m[i],
                    100);

            total += m[i];
            maxTotal += 100;
        }

        double percentage = (double) total * 100 / maxTotal;

        String grade;

        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("Total Marks : " + total + " / " + maxTotal);
        System.out.printf("Percentage  : %.2f%%\n", percentage);
        System.out.println("Grade       : " + grade);
        System.out.println("CGPA        : " + stu.cgpa);

        if (grade.equals("F")) {
            System.out.println("Result      : FAIL");
        } else {
            System.out.println("Result      : PASS");
        }

        System.out.println("============================================================");
    }
}
