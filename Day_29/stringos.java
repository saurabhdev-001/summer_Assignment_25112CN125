
import java.util.Scanner;

public class stringos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String s = sc.nextLine();

        int ch;

        do {

            System.out.println("\n----------- MENU -----------");
            System.out.println("1. Find Length");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Convert to Lowercase");
            System.out.println("4. Reverse String");
            System.out.println("5. Compare Strings");
            System.out.println("6. Concatenate String");
            System.out.println("7. Check Palindrome");
            System.out.println("8. Exit");
            System.out.print("Enter Choice : ");
            ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {

                case 1:
                    System.out.println("Length = " + s.length());
                    break;

                case 2:
                    System.out.println("Uppercase = " + s.toUpperCase());
                    break;

                case 3:
                    System.out.println("Lowercase = " + s.toLowerCase());
                    break;

                case 4:
                    String rev = "";

                    for (int i = s.length() - 1; i >= 0; i--) {
                        rev = rev + s.charAt(i);
                    }

                    System.out.println("Reverse = " + rev);
                    break;

                case 5:
                    System.out.print("Enter another String : ");
                    String s2 = sc.nextLine();

                    if (s.equals(s2)) {
                        System.out.println("Strings are Equal");
                    } else {
                        System.out.println("Strings are Not Equal");
                    }

                    break;

                case 6:
                    System.out.print("Enter String to Add : ");
                    String add = sc.nextLine();

                    s = s + add;

                    System.out.println("New String = " + s);
                    break;

                case 7:
                    String temp = "";

                    for (int i = s.length() - 1; i >= 0; i--) {
                        temp = temp + s.charAt(i);
                    }

                    if (s.equals(temp)) {
                        System.out.println("Palindrome");
                    } else {
                        System.out.println("Not Palindrome");
                    }

                    break;

                case 8:
                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Wrong Choice");

            }

        } while (ch != 8);

        sc.close();
    }
}
