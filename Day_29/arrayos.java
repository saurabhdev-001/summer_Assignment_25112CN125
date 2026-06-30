
import java.util.*;

public class arrayos {

    static Scanner sc = new Scanner(System.in);
    static int[] arr = new int[100];
    static int size = 0;

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n======================================");
            System.out.println("      MENU DRIVEN ARRAY SYSTEM");
            System.out.println("======================================");
            System.out.println("1. Create Array");
            System.out.println("2. Display Array");
            System.out.println("3. Insert Element");
            System.out.println("4. Delete Element");
            System.out.println("5. Search Element");
            System.out.println("6. Update Element");
            System.out.println("7. Find Maximum");
            System.out.println("8. Find Minimum");
            System.out.println("9. Calculate Sum");
            System.out.println("10. Calculate Average");
            System.out.println("11. Sort Array");
            System.out.println("12. Reverse Array");
            System.out.println("13. Exit");
            System.out.println("======================================");
            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    createArray();
                    break;
                case 2:
                    displayArray();
                    break;
                case 3:
                    insertElement();
                    break;
                case 4:
                    deleteElement();
                    break;
                case 5:
                    searchElement();
                    break;
                case 6:
                    updateElement();
                    break;
                case 7:
                    findMaximum();
                    break;
                case 8:
                    findMinimum();
                    break;
                case 9:
                    calculateSum();
                    break;
                case 10:
                    calculateAverage();
                    break;
                case 11:
                    sortArray();
                    break;
                case 12:
                    reverseArray();
                    break;
                case 13:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 13);
    }

    static void createArray() {
        System.out.print("Enter Number of Elements: ");
        size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.print("Enter Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Created Successfully!");
    }

    static void displayArray() {
        if (size == 0) {
            System.out.println("Array is Empty!");
            return;
        }

        System.out.print("Array Elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void insertElement() {
        if (size == 100) {
            System.out.println("Array is Full!");
            return;
        }

        System.out.print("Enter Position (1-" + (size + 1) + "): ");
        int pos = sc.nextInt();

        if (pos < 1 || pos > size + 1) {
            System.out.println("Invalid Position!");
            return;
        }

        System.out.print("Enter Element: ");
        int value = sc.nextInt();

        for (int i = size; i >= pos; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos - 1] = value;
        size++;

        System.out.println("Element Inserted Successfully!");
    }

    static void deleteElement() {
        if (size == 0) {
            System.out.println("Array is Empty!");
            return;
        }

        System.out.print("Enter Position to Delete: ");
        int pos = sc.nextInt();

        if (pos < 1 || pos > size) {
            System.out.println("Invalid Position!");
            return;
        }

        for (int i = pos - 1; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;

        System.out.println("Element Deleted Successfully!");
    }

    static void searchElement() {
        if (size == 0) {
            System.out.println("Array is Empty!");
            return;
        }

        System.out.print("Enter Element to Search: ");
        int key = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                System.out.println("Element Found at Position: " + (i + 1));
                return;
            }
        }

        System.out.println("Element Not Found!");
    }

    static void updateElement() {
        if (size == 0) {
            System.out.println("Array is Empty!");
            return;
        }

        System.out.print("Enter Position to Update: ");
        int pos = sc.nextInt();

        if (pos < 1 || pos > size) {
            System.out.println("Invalid Position!");
            return;
        }

        System.out.print("Enter New Value: ");
        arr[pos - 1] = sc.nextInt();

        System.out.println("Element Updated Successfully!");
    }

    static void findMaximum() {
        if (size == 0) {
            System.out.println("Array is Empty!");
            return;
        }

        int max = arr[0];

        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum Element = " + max);
    }

    static void findMinimum() {
        if (size == 0) {
            System.out.println("Array is Empty!");
            return;
        }

        int min = arr[0];

        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum Element = " + min);
    }

    static void calculateSum() {
        if (size == 0) {
            System.out.println("Array is Empty!");
            return;
        }

        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);
    }

    static void calculateAverage() {
        if (size == 0) {
            System.out.println("Array is Empty!");
            return;
        }

        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        double average = (double) sum / size;

        System.out.println("Average = " + average);
    }

    static void sortArray() {
        if (size == 0) {
            System.out.println("Array is Empty!");
            return;
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Array Sorted Successfully!");
    }

    static void reverseArray() {
        if (size == 0) {
            System.out.println("Array is Empty!");
            return;
        }

        int start = 0;
        int end = size - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("Array Reversed Successfully!");
    }
}
