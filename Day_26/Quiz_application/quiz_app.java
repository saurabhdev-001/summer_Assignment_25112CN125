
import java.util.*;

public class quiz_app {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        quiz_logic obj = new quiz_logic(sc);

        int response;

        System.out.println("==================================================");
        System.out.println("         WELCOME TO THE QUIZ APPLICATION");
        System.out.println("==================================================");
        System.out.println("Select your role:");
        System.out.println("99 - Administrator");
        System.out.println("Any other number - User");
        System.out.print("\nEnter your choice: ");

        response = sc.nextInt();

        if (response == 99) {
            System.out.println("\n==================================================");
            System.out.println("               ADMINISTRATOR MENU");

            do {

                System.out.println("==================================================");
                System.out.println("1. Add New Questions");
                System.out.println("2. Test the Quiz");
                System.out.print("\nEnter your choice: ");

                response = sc.nextInt();

                if (response == 1) {
                    int generated = 1;
                    if (!obj.pin_created()) {

                        System.out.print("\nSet upp the quiz application");
                        do {
                            System.out.print("\nEnter Admin PIN: ");
                            int pin = sc.nextInt();
                            if (pin >= 1000 && pin <= 9999) {
                                try {
                                    obj.setter_pin(pin);
                                } catch (Exception e) {

                                }
                                generated = 0;

                            } else {
                                System.out.println("pin must be of 4 digits");
                                generated = 1;
                            }
                        } while (generated == 1);

                    }

                    System.out.print("\nEnter Admin PIN: ");
                    int pin = sc.nextInt();

                    obj.add_questions(pin);
                    obj.save_data();

                } else if (response == 2) {
                    try {
                        obj.read_data();
                    } catch (Exception e) {
                        System.out.println("No question available in the database");
                    }

                    System.out.print("\nHow many questions would you like to attempt? ");
                    int total = sc.nextInt();

                    obj.question_loader(total);

                } else {

                    System.out.println("Invalid Choice!");

                }

                System.out.println("\n-----------------------------------------------");
                System.out.println("Press 1 to return to the Admin Menu.");
                System.out.println("Press any other number to Exit.");
                System.out.print("Your choice: ");

                response = sc.nextInt();

            } while (response == 1);

        } else {

            System.out.println("\n==================================================");
            System.out.println("                  USER MODE");

            do {
                obj.read_data();

                System.out.println("==================================================");

                System.out.print("How many questions would you like to attempt? ");
                int total = sc.nextInt();

                obj.question_loader(total);

                System.out.println("\n-----------------------------------------------");
                System.out.println("Press 1 to attempt another quiz.");
                System.out.println("Press any other number to Exit.");
                System.out.print("Your choice: ");

                response = sc.nextInt();

            } while (response == 1);
        }

        System.out.println("\n==================================================");
        System.out.println("      Thank you for using Quiz Application!");
        System.out.println("==================================================");

        sc.close();
    }
}
