
import java.util.Scanner;

public class symmetric {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the matrix ");
        int n = sc.nextInt();

        int arr1[][] = new int[n][n];
        if (n <= 0) {
            System.out.println("Invalid array size");
        } else {
            System.out.println("input elements of matrix ");
            for (int a = 0; a < n; a++) {
                for (int b = 0; b < n; b++) {
                    arr1[a][b] = sc.nextInt();
                }
            }
            if (symm(arr1)) {
                System.out.println("matrix is symmetric");

            } else {
                System.out.println("matrix is not symmetric");

            }

        }
    }

    static boolean symm(int[][] arr1) {
        for (int a = 0; a < arr1.length; a++) {
            for (int b = 0; b < arr1.length; b++) {
                if (arr1[a][b] == arr1[b][a]) {
                    continue;
                }
                return false;

            }
        }
        return true;

    }
}
