
import java.util.Scanner;

public class count_didgit {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no you wanted to count the digits");
        int num = sc.nextInt();

        System.out.println(dig_counter(num));
    }

    static int dig_counter(int num) {
        int count = 0;
        if (num == 0) {
            return 1;
        }
        while (num > 0) {
            num = num / 10;
            count++;
        }

        return count;

    }
}
