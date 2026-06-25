
import java.util.*;

public class logic {

    private Random r = new Random();

    int correct;
    int total;
    int incorrect;

    int gen(int a, int b) {

        return r.nextInt(a, b + 1);
    }

    void check(int num, int a, int b) {
        int n = gen(a, b);
        if (n == num) {
            System.out.println("Guessed no is right");
            correct++;
        } else {
            incorrect++;
            System.out.println("Guessed no is not right ");
            System.out.println("correct no is " + n);
        }
        total++;

    }

    void result() {
        double percentage = (correct * 100.0) / total;
        System.out.println("\n==================================================");
        System.out.println("                 GAME RESULT");
        System.out.println("==================================================");

        System.out.println("Total Questions  : " + total);
        System.out.println("Correct Answers  : " + correct);
        System.out.println("Incorrect Answers: " + incorrect);
        System.out.printf("Percentage       : %.2f%%\n", percentage);
        System.out.println("Score            : " + correct + " / " + total);

        System.out.println("==================================================");
        System.out.println("\nPerformance:");

    }
}
