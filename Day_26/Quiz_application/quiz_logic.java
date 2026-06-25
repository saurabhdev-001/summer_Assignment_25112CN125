
import java.io.*;
import java.util.*;

public class quiz_logic {

    Scanner sc;
    int correct;
    int incorrect;
    private int pin;
    ArrayList<questions> list = new ArrayList<>();

    quiz_logic(Scanner sc) {
        this.sc = sc;
    }

    void setter_pin(int pin) throws Exception {

        this.pin = pin;
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Admin_pin.dat"));
        out.writeObject(pin);
        out.close();

    }

    boolean pinChecker(int input) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("Admin_pin.dat"));
        pin = (int) in.readObject();
        in.close();

        if (input == pin) {
            return true;
        }
        return false;
    }

    boolean pin_created() {
        File file = new File("Admin_pin.dat");
        return file.exists();
    }

    void add_questions(int input) throws Exception {
        sc.nextLine();
        int again = 0;

        do {

            questions obj = new questions();

            if (pinChecker(input)) {

                System.out.println("\n==================================================");
                System.out.println("         ADD NEW QUESTION TO QUIZ DATABASE");
                System.out.println("==================================================");

                System.out.print("Enter the question:\n> ");
                obj.question = sc.nextLine();

                System.out.println("\nEnter the four answer options:");

                System.out.print("Option 1: ");
                obj.option1.option = sc.nextLine();

                System.out.print("Option 2: ");
                obj.option2.option = sc.nextLine();

                System.out.print("Option 3: ");
                obj.option3.option = sc.nextLine();

                System.out.print("Option 4: ");
                obj.option4.option = sc.nextLine();

                System.out.print("\nEnter the correct option number (1-4): ");
                obj.correct = sc.nextInt();
                sc.nextLine();

                list.add(obj);

                System.out.println("\n✔ Question added successfully!");

                System.out.println("\n--------------------------------------------------");
                System.out.println("Enter any number to add another question.");
                System.out.println("Enter -999 to return to the main menu.");
                System.out.print("Your choice: ");

                again = sc.nextInt();
                sc.nextLine();

            } else {

                System.out.println("\n✘ Access Denied!");
                System.out.println("Incorrect Admin PIN.");

                break;
            }

        } while (again != -999);
    }

    void question_loader(int total) {
        if (total > list.size()) {
            System.out.println("Not enough Questions in database");
            return;
        }
        HashSet<Integer> set = new HashSet<>();
        correct = 0;
        incorrect = 0;
        Random r = new Random();
        boolean generated = false;
        int questionNumber = 1;
        int input;
        questions obj;
        for (int a = 1; a <= total; a++) {
            generated = false;
            while (!generated) {
                questionNumber = r.nextInt(list.size());
                if (!set.contains(questionNumber)) {
                    generated = true;
                    set.add(questionNumber);
                    break;
                }
            }
            System.out.println("\n==================================================");
            System.out.println("                 QUESTION " + a);
            obj = list.get(questionNumber);
            obj.display();
            input = sc.nextInt();
            if (input == obj.correct) {
                correct++;
            } else {
                incorrect++;
            }
        }
        show_result(total, correct, incorrect);

    }

    void save_data() throws Exception {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("quizQuestion_database.dat"));
        out.writeObject(list);
        out.close();
    }

    void read_data() throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("quizQuestion_database.dat"));
        list = (ArrayList<questions>) in.readObject();
        in.close();

    }

    private void show_result(int total, int correct, int incorret) {
        double percentage = (correct * 100.0) / total;
        System.out.println("\n==================================================");
        System.out.println("                 QUIZ RESULT");
        System.out.println("==================================================");

        System.out.println("Total Questions  : " + total);
        System.out.println("Correct Answers  : " + correct);
        System.out.println("Incorrect Answers: " + incorrect);
        System.out.printf("Percentage       : %.2f%%\n", percentage);
        System.out.println("Score            : " + correct + " / " + total);

        System.out.println("==================================================");
        System.out.println("\nPerformance:");

        if (percentage >= 90) {
            System.out.println("Outstanding! Excellent performance.");
        } else if (percentage >= 75) {
            System.out.println("Great Job! Keep it up.");
        } else if (percentage >= 50) {
            System.out.println("Good effort! There's room for improvement.");
        } else {
            System.out.println("Keep practicing. You'll improve with time.");
        }

        System.out.println("==================================================");
    }

}
