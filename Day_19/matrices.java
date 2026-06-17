
import java.util.Scanner;

public class matrices {

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
            arr1 = add(arr1, arr2);
            System.out.println("sum is ");
            for (int a = 0; a < n; a++) {
                for (int b = 0; b < n; b++) {
                    System.out.print(arr1[a][b] + " ");
                }
                System.out.println();
            }

        }
    }

    static int[][] add(int[][] arr1, int arr2[][]) {
        int sum[][] = new int[arr1.length][arr1.length];
        for (int a = 0; a < arr1.length; a++) {
            for (int b = 0; b < arr1.length; b++) {
                sum[a][b] = arr1[a][b] + arr2[a][b];
            }
        }
        return sum;

    }
}
