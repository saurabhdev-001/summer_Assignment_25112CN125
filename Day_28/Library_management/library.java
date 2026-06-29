
import java.util.*;

public class library {

    HashMap<String, ArrayList<book>> map = new HashMap<>();
    HashMap<String, String> issue = new HashMap<>();
    HashMap<String, book> books = new HashMap<>();
    Scanner sc;
    HashMap<String, student> students = new HashMap<>();

    void AddBook() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n==================================================");
        System.out.println("                ADD NEW BOOK");
        System.out.println("==================================================");

        System.out.print("Book Title        : ");
        String title = sc.nextLine();

        System.out.print("Author Name       : ");
        String author = sc.nextLine();

        System.out.print("Publisher Name    : ");
        String publisher = sc.nextLine();

        System.out.print("Category          : ");
        String category = sc.nextLine();

        System.out.print("Edition           : ");
        int edition = sc.nextInt();

        System.out.print("Publication Year  : ");
        int publishYear = sc.nextInt();

        System.out.print("Price (₹)         : ");
        double price = sc.nextDouble();

        System.out.print("Number of Copies  : ");
        int copies = sc.nextInt();

        if (!map.containsKey(category)) {
            map.put(category, new ArrayList<>());
        }

        System.out.println("\nGenerating Book IDs...");
        System.out.println("---------------------------------------");

        for (int i = 1; i <= copies; i++) {

            book b = new book();

            b.bookId = gen_id();
            books.put(b.bookId, b);

            b.title = title;
            b.author = author;
            b.publisher = publisher;
            b.category = category;
            b.edition = edition;
            b.publishYear = publishYear;
            b.price = price;

            // Since this object represents one physical copy
            b.totalCopies = 1;
            b.availableCopies = 1;

            map.get(category).add(b);

            System.out.printf("Copy %-2d : %s%n", i, b.bookId);
        }

        System.out.println("---------------------------------------");
        System.out.println("Book Added Successfully!");
        System.out.println("Title            : " + title);
        System.out.println("Category         : " + category);
        System.out.println("Copies Added     : " + copies);
        System.out.println("==================================================");
    }

    private String gen_id() {
        boolean generated = false;
        Random r = new Random();
        String id = "";
        while (!generated) {
            id = "BK" + r.nextInt(100000);
            if (!books.containsKey(id)) {
                generated = true;
            }
        }
        return id;
    }

    private String genst_id() {
        boolean generated = false;
        Random r = new Random();
        String id = "";
        while (!generated) {
            id = "ST" + r.nextInt(100000);
            if (!students.containsKey(id)) {
                generated = true;
            }
        }
        return id;
    }

    void delete_book() {

        System.out.println("\n==================================================");
        System.out.println("                DELETE BOOK");
        System.out.println("==================================================");

        System.out.print("Enter Book ID : ");
        String bookId = sc.nextLine();
        String cat;
        if (books.containsKey(bookId)) {
            book b = books.get(bookId);
            cat = b.category;
            System.out.println("\n----------------------------------------");
            System.out.println("Book Found");
            System.out.println("----------------------------------------");

            System.out.println("Book ID     : " + b.bookId);
            System.out.println("Title       : " + b.title);
            System.out.println("Author      : " + b.author);
            System.out.println("Publisher   : " + b.publisher);
            System.out.println("Category    : " + b.category);
            System.out.println("Edition     : " + b.edition);
            System.out.println("Year        : " + b.publishYear);
            System.out.printf("Price       : ₹%.2f%n", b.price);

            System.out.println("\nAre you sure you want to delete this book?");
            System.out.print("Enter (Y/N) : ");
            String choice = sc.nextLine();
            if (choice.charAt(0) == 'y' || choice.charAt(0) == 'Y') {
                books.remove(bookId);
                map.get(cat).remove(b);
                if (map.get(cat).isEmpty()) {
                    map.remove(cat);
                }

                System.out.println("\n----------------------------------------");
                System.out.println("Book Deleted Successfully!");
                System.out.println("----------------------------------------");
                System.out.println("Deleted Book ID : " + b.bookId);
                System.out.println("Title           : " + b.title);
                System.out.println("----------------------------------------");

            } else {
                System.out.println("\nOperation Cancelled.");
            }

        } else {
            System.out.println("\n----------------------------------------");
            System.out.println("Book Not Found!");
            System.out.println("Please enter a valid Book ID.");
            System.out.println("----------------------------------------");
        }

    }

    void showall() {

        if (map.isEmpty()) {
            System.out.println("\nNo books available in the library.");
            return;
        }

        System.out.println("\n========================================================================================================================");
        System.out.println("                                                LIBRARY BOOKS");
        System.out.println("========================================================================================================================");

        for (String category : map.keySet()) {

            System.out.println("\nCategory : " + category);
            System.out.println("------------------------------------------------------------------------------------------------------------------------");

            System.out.printf("%-10s %-22s %-18s %-18s %-8s %-8s %-10s%n",
                    "Book ID",
                    "Title",
                    "Author",
                    "Publisher",
                    "Edition",
                    "Year",
                    "Price");

            System.out.println("------------------------------------------------------------------------------------------------------------------------");

            for (book b : map.get(category)) {

                System.out.printf("%-10s %-22s %-18s %-18s %-8d %-8d ₹%-9.2f%n",
                        b.bookId,
                        b.title,
                        b.author,
                        b.publisher,
                        b.edition,
                        b.publishYear,
                        b.price);
            }
        }

        System.out.println("========================================================================================================================");

    }

    void issue() {

        System.out.println(
                "\n==================================================");
        System.out.println(
                "                 ISSUE BOOK");
        System.out.println(
                "==================================================");
        System.out.print(
                "Enter Student ID : ");
        String studentId = sc.nextLine();

        System.out.print(
                "Enter Book ID    : ");
        String bookId = sc.nextLine();

        System.out.println(
                "\n----------------------------------------");
        System.out.println(
                "Verifying Details...");
        System.out.println(
                "----------------------------------------");
        student s;
        if (students.containsKey(studentId)) {
            s = students.get(studentId);

            System.out.println("\nStudent Found");
            System.out.println("----------------------------------------");
            System.out.println("Student ID   : " + s.memberId);
            System.out.println("Name         : " + s.name);
            System.out.println("Course       : " + s.course);
            System.out.println("Branch       : " + s.branch);
            System.out.println("Semester     : " + s.semester);
            if (s.totIssued >= s.maxIssue) {
                System.out.println("\nStudent has reached the maximum issue limit.");
                return;
            }

        } else {
            System.out.println("No such Student");
            return;
        }
        book b;
        if (books.containsKey(bookId)) {
            b = books.get(bookId);
            if (b.isIssued) {
                System.out.println("\nThis book is already issued.");
                return;

            }

            System.out.println("\nBook Found");
            System.out.println("----------------------------------------");
            System.out.println("Book ID      : " + b.bookId);
            System.out.println("Title        : " + b.title);
            System.out.println("Author       : " + b.author);
            System.out.println("Category     : " + b.category);
            System.out.println("Edition      : " + b.edition);

        } else {
            System.out.println("No such Book");
            return;
        }
        System.out.println("\n----------------------------------------");
        System.out.println("Issue this book to the above student?");
        System.out.print("Enter (Y/N) : ");
        String choice = sc.nextLine();
        if (choice.charAt(0) == 'y' || choice.charAt(0) == 'Y') {
            b.isIssued = true;
            b.availableCopies--;
            b.issueHistory.add("Book is issued to " + s.name + " ");

            System.out.println("\n========================================");
            System.out.println("Book Issued Successfully!");
            System.out.println("========================================");
            System.out.println("Book ID      : " + b.bookId);
            System.out.println("Book Title   : " + b.title);
            System.out.println("Student ID   : " + s.memberId);
            System.out.println("Student Name : " + s.name);
            System.out.println("========================================");
            s.totIssued++;
            issue.put(bookId, studentId);
            s.book_id.add(bookId);
        }

    }

    void addStudent() {

        System.out.println("\n==================================================");
        System.out.println("                ADD STUDENT");
        System.out.println("==================================================");

        student s = new student();

        s.memberId = genst_id();

        System.out.println("Student ID        : " + s.memberId);

        System.out.print("Student Name      : ");
        s.name = sc.nextLine();

        System.out.print("Course            : ");
        s.course = sc.nextLine();

        System.out.print("Branch            : ");
        s.branch = sc.nextLine();

        System.out.print("Semester          : ");
        s.semester = Integer.parseInt(sc.nextLine());

        System.out.print("Phone Number      : ");
        s.phone = sc.nextLine();

        System.out.print("Email ID          : ");
        s.email = sc.nextLine();

        s.totIssued = 0;

        students.put(s.memberId, s);

        System.out.println("----------------------------------------");
        System.out.println("Student Added Successfully!");
        System.out.println("----------------------------------------");
        System.out.println("Student ID : " + s.memberId);
        System.out.println("Name       : " + s.name);
        System.out.println("Course     : " + s.course);
        System.out.println("Branch     : " + s.branch);
        System.out.println("----------------------------------------");
    }

    void returnBook() {

        System.out.println(
                "\n==================================================");
        System.out.println(
                "                 RETURN BOOK");
        System.out.println(
                "==================================================");
        System.out.print(
                "Enter Student ID : ");
        String studentId = sc.nextLine();

        System.out.print(
                "Enter Book ID    : ");
        String bookId = sc.nextLine();

        System.out.println(
                "\n----------------------------------------");
        System.out.println(
                "Verifying Details...");
        System.out.println(
                "----------------------------------------");
        student s;
        if (students.containsKey(studentId)) {
            s = students.get(studentId);

            System.out.println("\nStudent Found");
            System.out.println("----------------------------------------");
            System.out.println("Student ID   : " + s.memberId);
            System.out.println("Name         : " + s.name);
            System.out.println("Course       : " + s.course);
            System.out.println("Branch       : " + s.branch);
            System.out.println("Semester     : " + s.semester);

        } else {
            System.out.println("No such Student");
            return;
        }
        book b;
        if (books.containsKey(bookId)) {
            b = books.get(bookId);

            System.out.println("\nBook Found");
            System.out.println("----------------------------------------");
            System.out.println("Book ID      : " + b.bookId);
            System.out.println("Title        : " + b.title);
            System.out.println("Author       : " + b.author);
            System.out.println("Category     : " + b.category);
            System.out.println("Edition      : " + b.edition);

        } else {
            System.out.println("No such Book");
            return;
        }
        if (!s.book_id.contains(bookId)) {
            System.out.println("\nThis book was not issued to this student.");
            return;
        }
        if (!b.isIssued) {
            System.out.println("\nThis book is not currently issued.");
            return;
        }
        System.out.println("\n----------------------------------------");
        System.out.println("Return this book?");
        System.out.print("Enter (Y/N) : ");
        String choice = sc.nextLine();
        if (choice.charAt(0) == 'y' || choice.charAt(0) == 'Y') {
            System.out.println("\n========================================");
            System.out.println("Book Returned Successfully!");
            System.out.println("========================================");
            System.out.println("Book ID      : " + b.bookId);
            System.out.println("Book Title   : " + b.title);
            System.out.println("Student ID   : " + s.memberId);
            System.out.println("Student Name : " + s.name);
            System.out.println("========================================");
            s.totIssued--;
            b.isIssued = false;
            b.availableCopies++;
            s.book_id.remove(bookId);
            issue.remove(studentId);
            b.issueHistory.add("Book returned by " + s.name);
        }

    }

}
