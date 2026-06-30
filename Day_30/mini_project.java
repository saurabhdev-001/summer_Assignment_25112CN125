
import java.util.Scanner;

public class mini_project {

    static Scanner sc = new Scanner(System.in);

    static String[] id = new String[20];
    static String[] name = new String[20];
    static int[] marks = new int[20];
    static int count = 0;

    public static void addStudent() {

        if (count == 20) {
            System.out.println("Storage Full");
            return;
        }

        System.out.print("Enter Student ID : ");
        id[count] = sc.nextLine();

        System.out.print("Enter Student Name : ");
        name[count] = sc.nextLine();

        System.out.print("Enter Marks : ");
        marks[count] = sc.nextInt();
        sc.nextLine();

        count++;

        System.out.println("Student Added Successfully.");
    }

    public static void displayStudents() {

        if (count == 0) {
            System.out.println("No Record Found.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("ID : " + id[i]);
            System.out.println("Name : " + name[i]);
            System.out.println("Marks : " + marks[i]);
        }
    }

    public static void searchStudent() {

        if (count == 0) {
            System.out.println("No Record Found.");
            return;
        }

        System.out.print("Enter Student ID : ");
        String s = sc.nextLine();

        for (int i = 0; i < count; i++) {

            if (id[i].equals(s)) {
                System.out.println("Student Found");
                System.out.println("Name : " + name[i]);
                System.out.println("Marks : " + marks[i]);
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    public static void updateMarks() {

        System.out.print("Enter Student ID : ");
        String s = sc.nextLine();

        for (int i = 0; i < count; i++) {

            if (id[i].equals(s)) {

                System.out.print("Enter New Marks : ");
                marks[i] = sc.nextInt();
                sc.nextLine();

                System.out.println("Marks Updated.");
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    public static void deleteStudent() {

        System.out.print("Enter Student ID : ");
        String s = sc.nextLine();

        for (int i = 0; i < count; i++) {

            if (id[i].equals(s)) {

                for (int j = i; j < count - 1; j++) {
                    id[j] = id[j + 1];
                    name[j] = name[j + 1];
                    marks[j] = marks[j + 1];
                }

                count--;

                System.out.println("Student Deleted.");
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n========== STUDENT MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateMarks();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}
