
import java.util.Scanner;

public class multiplication {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the matrix ");
        int n = sc.nextInt();

        int arr1[][] = new int[n][n];
        if (n <= 0) {
            System.out.println("Invalid array size");
        } else {
            System.out.println("input elements of matrix 1");
            for (int a = 0; a < n; a++) {
                for (int b = 0; b < n; b++) {
                    arr1[a][b] = sc.nextInt();
                }
            }
            int arr2[][] = new int[n][n];

            System.out.println("input elements of matrix2 ");
            for (int a = 0; a < n; a++) {
                for (int b = 0; b < n; b++) {
                    arr2[a][b] = sc.nextInt();
                }
            }
            arr1 = multiply(arr1, arr2);
            System.out.println("multiply is ");
            for (int a = 0; a < n; a++) {
                for (int b = 0; b < n; b++) {
                    System.out.print(arr1[a][b] + " ");
                }
                System.out.println();
            }
        }
    }

    static int[][] multiply(int[][] arr1, int[][] arr2) {
        int ans[][] = new int[arr1.length][arr1.length];
        int sum = 0;
        for (int a = 0; a < arr1.length; a++) {
            for (int b = 0; b < arr2.length; b++) {
                for (int c = 0; c < arr1.length; c++) {
                    sum = sum + arr1[a][c] * arr2[c][b];
                }
                ans[a][b] = sum;
                sum = 0;
            }

        }
        return ans;
    }
}
