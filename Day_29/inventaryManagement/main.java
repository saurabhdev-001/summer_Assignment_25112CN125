
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        management obj = new management();
        obj.sc = sc;

        int choice;

        do {

            System.out.println("\n========================================");
            System.out.println("      INVENTORY MANAGEMENT SYSTEM");
            System.out.println("========================================");
            System.out.println("1. Add Product");
            System.out.println("2. View All Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Product");
            System.out.println("5. Delete Product");
            System.out.println("6. Check Stock");
            System.out.println("7. Exit");
            System.out.println("========================================");
            System.out.print("Enter Your Choice : ");

            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {

                case 1:
                    obj.addProduct();
                    break;

                case 2:
                    obj.viewProducts();
                    break;

                case 3:
                    obj.searchProduct();
                    break;

                case 4:
                    obj.updateProduct();
                    break;

                case 5:
                    obj.deleteProduct();
                    break;

                case 6:
                    obj.check_stock();
                    break;

                case 7:
                    System.out.println("\nThank You for using Inventory Management System!");
                    break;

                default:
                    System.out.println("\nInvalid Choice! Please try again.");
            }

        } while (choice != 7);

        sc.close();
    }
}
