
import java.util.Scanner;

class Book {

    String bookId;
    String title;
    String author;
    boolean issued;
}

public class mini_library {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Book b = new Book();
        boolean added = false;

        int choice;

        do {

            System.out.println("\n========== MINI LIBRARY SYSTEM ==========");
            System.out.println("1. Add Book");
            System.out.println("2. Display Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search Book");
            System.out.println("6. Exit");
            System.out.print("Enter Choice : ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Book ID : ");
                    b.bookId = sc.nextLine();

                    System.out.print("Enter Book Title : ");
                    b.title = sc.nextLine();

                    System.out.print("Enter Author Name : ");
                    b.author = sc.nextLine();

                    b.issued = false;
                    added = true;

                    System.out.println("Book Added Successfully.");
                    break;

                case 2:

                    if (!added) {
                        System.out.println("No Book Available.");
                    } else {
                        System.out.println("\nBook ID : " + b.bookId);
                        System.out.println("Title : " + b.title);
                        System.out.println("Author : " + b.author);

                        if (b.issued) {
                            System.out.println("Status : Issued");
                        } else {
                            System.out.println("Status : Available");
                        }
                    }

                    break;

                case 3:

                    if (!added) {
                        System.out.println("No Book Available.");
                    } else if (b.issued) {
                        System.out.println("Book Already Issued.");
                    } else {
                        b.issued = true;
                        System.out.println("Book Issued Successfully.");
                    }

                    break;

                case 4:

                    if (!added) {
                        System.out.println("No Book Available.");
                    } else if (!b.issued) {
                        System.out.println("Book is Already Available.");
                    } else {
                        b.issued = false;
                        System.out.println("Book Returned Successfully.");
                    }

                    break;

                case 5:

                    if (!added) {
                        System.out.println("No Book Available.");
                    } else {

                        System.out.print("Enter Book ID : ");
                        String id = sc.nextLine();

                        if (b.bookId.equals(id)) {
                            System.out.println("Book Found");
                            System.out.println("Title : " + b.title);
                            System.out.println("Author : " + b.author);

                            if (b.issued) {
                                System.out.println("Status : Issued");
                            } else {
                                System.out.println("Status : Available");
                            }

                        } else {
                            System.out.println("Book Not Found.");
                        }
                    }

                    break;

                case 6:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}
