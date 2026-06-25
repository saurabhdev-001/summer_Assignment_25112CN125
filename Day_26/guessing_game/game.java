
import java.util.*;



      public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int s;
        int e;
        int num;
        int temp;
        logic obj = new logic();
        for (int a = 0; a < 10; a++) {
            System.out.println("\nEnter the range of number in which u want to guess");
            try {
                s = sc.nextInt();
                e = sc.nextInt();

            } catch (Exception r) {
                System.out.println("\nenter the integer value");
                sc.nextLine();
                a--;
                continue;
            }
            if (s > e) {
                temp = s;
                s = e;
                e = temp;
            }
            System.out.println("Guess the no ");
            try {
                num = sc.nextInt();
            } catch (Exception m) {
                System.out.println("\nenter an integer");
                sc.nextLine();
                a--;
                continue;

            }
            obj.check(num, s, e);
        }

    }
