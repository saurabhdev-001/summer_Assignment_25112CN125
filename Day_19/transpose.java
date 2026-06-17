
import java.util.Scanner;

public class transpose {

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

            arr1 = transpose(arr1);
            System.out.println("transpose is ");
            for (int a = 0; a < n; a++) {
                for (int b = 0; b < n; b++) {
                    System.out.print(arr1[a][b] + " ");
                }
                System.out.println();
            }

        }
    }

    static int[][] transpose(int[][] arr1) {
        int trans[][] = new int[arr1.length][arr1.length];
        for (int a = 0; a < arr1.length; a++) {
            for (int b = 0; b < arr1.length; b++) {
                trans[b][a] = arr1[a][b];
            }
        }
        return trans;

    }
}
