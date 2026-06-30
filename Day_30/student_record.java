
import java.util.Scanner;

public class student_record {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] roll = new int[100];
        String[] name = new String[100];
        String[] course = new String[100];
        double[] marks = new double[100];

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Input Student Records
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter Details of Student " + (i + 1));

            System.out.print("Roll Number : ");
            roll[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Name : ");
            name[i] = sc.nextLine();

            System.out.print("Course : ");
            course[i] = sc.nextLine();

            System.out.print("Marks : ");
            marks[i] = sc.nextDouble();
            sc.nextLine();
        }

        // Display Student Records
        System.out.println("\n==============================================");
        System.out.println("           STUDENT RECORD SYSTEM");
        System.out.println("==============================================");

        System.out.printf("%-10s %-20s %-15s %-10s\n",
                "Roll", "Name", "Course", "Marks");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-20s %-15s %-10.2f\n",
                    roll[i], name[i], course[i], marks[i]);
        }

        sc.close();
    }
}
