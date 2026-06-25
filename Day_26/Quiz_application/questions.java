
import java.io.*;

class option implements Serializable {

    String option;
    int no;

    option(int no) {
        this.no = no;
    }
}

public class questions implements Serializable {

    String question;
    option option1 = new option(1);
    option option2 = new option(2);
    option option3 = new option(3);
    option option4 = new option(4);
    int correct;

    void display() {
        System.out.println("==================================================");
        System.out.println(question);
        System.out.println("\nOptions:");
        System.out.println("1. " + option1.option);
        System.out.println("2. " + option2.option);
        System.out.println("3. " + option3.option);
        System.out.println("4. " + option4.option);
        System.out.print("\nEnter your answer (1-4): ");
    }
}
