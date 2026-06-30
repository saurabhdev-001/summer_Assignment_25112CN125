
import java.util.*;

public class management {

    Scanner sc;
    HashMap<String, product> data = new HashMap<>();

    public void addProduct() {

        product p = new product();

        p.productId = "PID" + (100 + product.tot);

        System.out.println("\n========================================");
        System.out.println("            ADD PRODUCT");
        System.out.println("========================================");

        System.out.print("Enter Product Name : ");
        p.productName = sc.nextLine();

        System.out.print("Enter Category : ");
        p.category = sc.nextLine();

        System.out.print("Enter Price : ");
        p.price = sc.nextDouble();

        System.out.print("Enter Quantity : ");
        p.quantity = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Supplier : ");
        p.supplier = sc.nextLine();

        data.put(p.productId, p);

        System.out.println("\nProduct Added Successfully!");
        System.out.println("Generated Product ID : " + p.productId);

    }
    // View All Products

    public void viewProducts() {

        if (data.isEmpty()) {
            System.out.println("\nNo Products Available!");
            return;
        }

        System.out.println("\n========================================================================================================");
        System.out.printf("%-10s %-20s %-15s %-10s %-10s %-20s%n",
                "ID", "Name", "Category", "Price", "Quantity", "Supplier");
        System.out.println("========================================================================================================");

        for (product p : data.values()) {
            System.out.printf("%-10s %-20s %-15s %-10.2f %-10d %-20s%n",
                    p.productId,
                    p.productName,
                    p.category,
                    p.price,
                    p.quantity,
                    p.supplier);
        }
    }

// Search Product
    public void searchProduct() {

        System.out.print("Enter Product ID : ");
        String id = sc.nextLine();

        product p = data.get(id);

        if (p == null) {
            System.out.println("Product Not Found!");
            return;
        }

        System.out.println("\n========== PRODUCT DETAILS ==========");
        System.out.println("Product ID   : " + p.productId);
        System.out.println("Name         : " + p.productName);
        System.out.println("Category     : " + p.category);
        System.out.println("Price        : " + p.price);
        System.out.println("Quantity     : " + p.quantity);
        System.out.println("Supplier     : " + p.supplier);
    }

// Update Product
    public void updateProduct() {

        System.out.print("Enter Product ID : ");
        String id = sc.nextLine();

        product p = data.get(id);

        if (p == null) {
            System.out.println("Product Not Found!");
            return;
        }

        System.out.print("Enter New Product Name : ");
        p.productName = sc.nextLine();

        System.out.print("Enter New Category : ");
        p.category = sc.nextLine();

        System.out.print("Enter New Price : ");
        p.price = sc.nextDouble();

        System.out.print("Enter New Quantity : ");
        p.quantity = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter New Supplier : ");
        p.supplier = sc.nextLine();

        System.out.println("Product Updated Successfully!");
    }

// Delete Product
    public void deleteProduct() {

        System.out.print("Enter Product ID : ");
        String id = sc.nextLine();

        if (data.remove(id) != null) {
            System.out.println("Product Deleted Successfully!");
        } else {
            System.out.println("Product Not Found!");
        }
    }

    public void check_stock() {

        System.out.print("Enter Product ID : ");
        String id = sc.nextLine();

        product p = data.get(id);

        if (p == null) {
            System.out.println("Product Not Found!");
            return;
        }

        System.out.println("\n========== STOCK DETAILS ==========");
        System.out.println("Product ID   : " + p.productId);
        System.out.println("Product Name : " + p.productName);
        System.out.println("Quantity     : " + p.quantity);

        if (p.quantity == 0) {
            System.out.println("Status       : Out of Stock");
        } else if (p.quantity <= 10) {
            System.out.println("Status       : Low Stock");
        } else {
            System.out.println("Status       : In Stock");
        }
    }
}
