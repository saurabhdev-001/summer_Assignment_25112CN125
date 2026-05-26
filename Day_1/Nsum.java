
import java.util.Scanner;


      
public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of N ");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }

    static int sum(int n) {
        int sum = 0;
        for (int a = 0; a <= n; a++) {
            sum = sum + a;
        }
        return sum;
    }
