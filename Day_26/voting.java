
import java.util.Scanner;

public class voting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        String nationality;
        int choice;

        int candidateA = 0;
        int candidateB = 0;
        int candidateC = 0;

        System.out.println("      VOTING ELIGIBILITY SYSTEM");

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your nationality: ");
        nationality = sc.nextLine();

        System.out.println("\nChecking Eligibility...\n");

        if (age >= 18 && nationality.equalsIgnoreCase("Indian")) {

            System.out.println("Congratulations " + name + "!");
            System.out.println("You are eligible to vote.\n");

            System.out.println("Candidates");
            System.out.println("1. Candidate A");
            System.out.println("2. Candidate B");
            System.out.println("3. Candidate C");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    candidateA++;
                    System.out.println("Vote cast successfully for Candidate A.");
                    break;

                case 2:
                    candidateB++;
                    System.out.println("Vote cast successfully for Candidate B.");
                    break;

                case 3:
                    candidateC++;
                    System.out.println("Vote cast successfully for Candidate C.");
                    break;

                default:
                    System.out.println("Invalid candidate.");
            }

            System.out.println("\nElection Result");
            System.out.println("Candidate A : " + candidateA + " vote(s)");
            System.out.println("Candidate B : " + candidateB + " vote(s)");
            System.out.println("Candidate C : " + candidateC + " vote(s)");

        } else {

            System.out.println("Sorry " + name + ", you are not eligible to vote.");

            if (age < 18) {
                System.out.println("- You must be at least 18 years old.");
            }
            nationality = sc.nextLine().trim();

            if (!nationality.equalsIgnoreCase("Indian")) {
                System.out.println("- Only Indian citizens can vote.");
            }
        }

    }

}
