
import java.util.*;

public class management {

    HashMap<String, contacts> Allcont = new HashMap<>();
    Scanner sc;

    void addcontacts() {

        contacts c = new contacts();

        System.out.print("Enter First Name : ");
        c.firstName = sc.nextLine();
        System.out.print("Enter Last Name : ");
        c.lastName = sc.nextLine();

        System.out.print("Enter Phone Number : ");
        c.phoneNumber = sc.nextLine();

        // Check if phone number already exists
        if (Allcont.containsKey(c.firstName)) {
            System.out.println("Contact already exists!");
            return;
        }

        System.out.print("Enter Email : ");
        c.email = sc.nextLine();

        System.out.print("Enter Address : ");
        c.address = sc.nextLine();

        System.out.print("Enter City : ");
        c.city = sc.nextLine();

        System.out.print("Enter State : ");
        c.state = sc.nextLine();

        System.out.print("Enter Country : ");
        c.country = sc.nextLine();

        System.out.print("Enter Pincode : ");
        c.pincode = sc.nextLine();

        System.out.print("Enter Company : ");
        c.company = sc.nextLine();

        Allcont.put(c.firstName, c);

        System.out.println("\nContact Added Successfully!");
    }

    void checkContact() {
        System.out.print("Enter First Name to Search: ");
        String name = sc.nextLine();
        contacts c;
        if (Allcont.containsKey(name)) {
            c = Allcont.get(name);
            System.out.println("\n========== CONTACT FOUND ==========");
            System.out.println("First Name  : " + c.firstName);
            System.out.println("Last Name   : " + c.lastName);
            System.out.println("Phone No.   : " + c.phoneNumber);
            System.out.println("Email       : " + c.email);
            System.out.println("Address     : " + c.address);
            System.out.println("City        : " + c.city);
            System.out.println("State       : " + c.state);
            System.out.println("Country     : " + c.country);
            System.out.println("Pincode     : " + c.pincode);
            System.out.println("Company     : " + c.company);
            System.out.println("===================================\n");
        } else {
            System.out.println("No contact found with the name \"" + name + "\".");
        }

    }

    void update() {
        System.out.println("\n========== UPDATE CONTACT ==========");
        System.out.print("Enter First Name: ");
        String name = sc.nextLine();
        contacts c;

        if (Allcont.containsKey(name)) {
            c = Allcont.get(name);
            System.out.println("\n========== CONTACT FOUND ==========");
            System.out.println("First Name  : " + c.firstName);
            System.out.println("Last Name   : " + c.lastName);
            System.out.println("Phone No.   : " + c.phoneNumber);
            System.out.println("Email       : " + c.email);
            System.out.println("Address     : " + c.address);
            System.out.println("City        : " + c.city);
            System.out.println("State       : " + c.state);
            System.out.println("Country     : " + c.country);
            System.out.println("Pincode     : " + c.pincode);
            System.out.println("Company     : " + c.company);
            System.out.println("===================================\n");
            System.out.println("\nWhat do you want to update?");
            System.out.println("1. First Name");
            System.out.println("2. Last Name");
            System.out.println("3. Phone Number");
            System.out.println("4. Email");
            System.out.println("5. Address");
            System.out.println("6. City");
            System.out.println("7. State");
            System.out.println("8. Country");
            System.out.println("9. Pincode");
            System.out.println("10. Company");
            System.out.println("11. Update All Details");
            System.out.println("12. Cancel");
            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {

                case 1:
                    Allcont.remove(c.firstName);
                    System.out.print("Enter New First Name: ");
                    c.firstName = sc.nextLine();

                    Allcont.put(c.firstName, c);
                    break;

                case 2:
                    System.out.print("Enter New Last Name: ");
                    c.lastName = sc.nextLine();
                    break;

                case 3:
                    System.out.print("Enter New Phone Number: ");
                    c.phoneNumber = sc.nextLine();
                    break;

                case 4:
                    System.out.print("Enter New Email: ");
                    c.email = sc.nextLine();
                    break;

                case 5:
                    System.out.print("Enter New Address: ");
                    c.address = sc.nextLine();
                    break;

                case 6:
                    System.out.print("Enter New City: ");
                    c.city = sc.nextLine();
                    break;

                case 7:
                    System.out.print("Enter New State: ");
                    c.state = sc.nextLine();
                    break;

                case 8:
                    System.out.print("Enter New Country: ");
                    c.country = sc.nextLine();
                    break;

                case 9:
                    System.out.print("Enter New Pincode: ");
                    c.pincode = sc.nextLine();
                    break;

                case 10:
                    System.out.print("Enter New Company: ");
                    c.company = sc.nextLine();
                    break;

                case 11:
                    Allcont.remove(c.firstName);
                    System.out.print("Enter First Name: ");
                    c.firstName = sc.nextLine();
                    Allcont.put(c.firstName, c);

                    System.out.print("Enter Last Name: ");
                    c.lastName = sc.nextLine();

                    System.out.print("Enter Phone Number: ");
                    c.phoneNumber = sc.nextLine();

                    System.out.print("Enter Email: ");
                    c.email = sc.nextLine();

                    System.out.print("Enter Address: ");
                    c.address = sc.nextLine();

                    System.out.print("Enter City: ");
                    c.city = sc.nextLine();

                    System.out.print("Enter State: ");
                    c.state = sc.nextLine();

                    System.out.print("Enter Country: ");
                    c.country = sc.nextLine();

                    System.out.print("Enter Pincode: ");
                    c.pincode = sc.nextLine();

                    System.out.print("Enter Company: ");
                    c.company = sc.nextLine();
                    break;

                case 12:
                    System.out.println("Update Cancelled.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } else {
            System.out.println("No contact found with the name \"" + name + "\".");
        }

    }
}
