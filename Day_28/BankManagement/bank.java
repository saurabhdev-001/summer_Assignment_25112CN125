
import java.io.*;
import java.util.*;

public class bank {

    Scanner sc;

    bank(Scanner sc) {
        this.sc = sc;
    }

    HashMap<Long, account> account_details = new HashMap<>();
    HashMap<Long, holder_details> holder_det = new HashMap<>();

    void create_acc() {

        account obj = new account();
        boolean created = false;

        holder_details o = new holder_details();

        long acc = private_genrate_acc();
        obj.setter_acc_no(acc);

        System.out.println("\n========================================");
        System.out.println("          CREATE NEW ACCOUNT");
        System.out.println("========================================");
        System.out.println("Allocated Account Number : " + acc);
        System.out.println("----------------------------------------");
        System.out.println("Enter Account Holder Details");
        System.out.println("----------------------------------------");

        System.out.print("Full Name      : ");
        o.name = sc.nextLine();

        System.out.print("Father's Name  : ");
        o.father_name = sc.nextLine();

        System.out.print("Mother's Name  : ");
        o.mother_name = sc.nextLine();

        System.out.print("Address        : ");
        o.address = sc.nextLine();

        System.out.print("Mobile Number  : ");
        o.mob_no = sc.nextLong();
        sc.nextLine();

        System.out.print("Branch Name    : ");
        o.branch = sc.nextLine();

        int pin;

        do {

            System.out.println("\n----------------------------------------");
            System.out.println("Set Account PIN");
            System.out.println("----------------------------------------");

            System.out.print("Enter 4-Digit PIN      : ");
            pin = sc.nextInt();

            if (pin < 1000 || pin > 9999) {
                System.out.println("Invalid PIN! PIN must contain exactly 4 digits.");
                continue;
            }

            obj.setter_pin(pin);

            System.out.print("Re-enter PIN           : ");
            pin = sc.nextInt();

            if (obj.verify_pin(pin)) {
                System.out.println("\nAccount Created Successfully.");
                created = true;
            } else {
                System.out.println("\nPIN Mismatch. Please try again.");
                created = false;
            }

        } while (!created);

        o.list.add("Account created successfully\n");

        holder_det.put(acc, o);
        account_details.put(acc, obj);

        try {
            save_data();
            System.out.println("Data Saved Successfully.");
        } catch (Exception e) {
            System.out.println("No data has been saved");
        }

        System.out.println("========================================\n");
    }

    private long private_genrate_acc() {

        Random r = new Random();
        boolean generated = true;
        Long ac;
        do {
            StringBuilder acc = new StringBuilder(10);
            for (int a = 1; a <= 10; a++) {
                acc.append(r.nextInt(9) + 1);
            }
            ac = Long.parseLong(acc.toString());
            if (account_details.containsKey(ac)) {
                generated = false;
                acc.delete(0, acc.length());
            } else {
                generated = true;
            }

        } while (!generated);
        return ac;
    }

    void withdraw(long no, int amt) {

        account object;
        holder_details obj;

        if (account_details.containsKey(no)) {
            object = account_details.get(no);
            obj = holder_det.get(no);
        } else {
            System.out.println("\nAccount Not Found.");
            return;
        }

        if (amt <= 0) {
            System.out.println("\nInvalid Amount. Please enter a positive amount.");
            obj.list.add("Transaction of " + amt + " is failed \n");
            return;
        }

        if (object.getter_freeze()) {
            System.out.println("\nAccount is Frozen.");
            System.out.println("Withdrawal cannot be processed.");
            obj.list.add("Transaction of " + amt + " is failed \n");
            return;
        }

        int attempt_remaining = 3;

        while (attempt_remaining > 0) {

            System.out.println("\n----------------------------------------");
            System.out.println("Enter Account PIN");
            System.out.println("Attempts Remaining : " + attempt_remaining);
            System.out.print("PIN : ");

            if (object.verify_pin(sc.nextInt())) {

                if (object.withdraw(amt)) {

                    obj.list.add("Transaction of " + amt
                            + " is Succesfull \n");
                    obj.list.add("Your remaining balnace is "
                            + object.getter_balance() + "\n");

                    System.out.println("\n========================================");
                    System.out.println("       WITHDRAWAL SUCCESSFUL");
                    System.out.println("========================================");
                    System.out.println("Account Number    : " + no);
                    System.out.println("Amount Withdrawn  : ₹" + amt);
                    System.out.println("Remaining Balance : ₹" + object.getter_balance());
                    System.out.println("========================================");

                } else {

                    obj.list.add("Transaction of " + amt
                            + " is failed due to unsufficent funds \n");

                    System.out.println("\n========================================");
                    System.out.println("      TRANSACTION DECLINED");
                    System.out.println("========================================");
                    System.out.println("Reason : Insufficient Balance");
                    System.out.println("Available Balance : ₹" + object.getter_balance());
                    System.out.println("========================================");
                }

                break;

            } else {
                attempt_remaining--;
            }
        }

        if (attempt_remaining == 0) {

            object.setter_freeze(true);

            System.out.println("\n========================================");
            System.out.println("         ACCOUNT FROZEN");
            System.out.println("========================================");
            System.out.println("Account Number : " + no);
            System.out.println("Reason         : 3 Incorrect PIN Attempts");
            System.out.println("========================================");

            obj.list.add("Account was frozen due to 3 continous incorrect pin inputs");
        }

        try {
            save_data();
        } catch (Exception e) {
            System.out.println("No data has been saved");
        }
    }

    void deposit(long no, int amt) {

        account object;
        holder_details obj;

        if (account_details.containsKey(no)) {
            object = account_details.get(no);
            obj = holder_det.get(no);
        } else {
            System.out.println("\nAccount Not Found.");
            return;
        }

        if (amt <= 0) {
            System.out.println("\nInvalid Amount. Please enter a positive amount.");
            obj.list.add("Transaction of " + amt + " is failed \n");
            return;
        }

        object.deposit(amt);

        obj.list.add("Transaction of " + amt + " is Successful \n");
        obj.list.add("Your balance is " + object.getter_balance() + "\n");

        System.out.println("\n========================================");
        System.out.println("         DEPOSIT SUCCESSFUL");
        System.out.println("========================================");
        System.out.println("Account Number : " + no);
        System.out.println("Amount Deposited : ₹" + amt);
        System.out.println("Current Balance  : ₹" + object.getter_balance());
        System.out.println("========================================");

        try {
            save_data();
        } catch (Exception e) {
            System.out.println("No data has been saved");
        }
    }

    void print_details(long ac) {
        account object;

        if (account_details.containsKey(ac)) {
            object = account_details.get(ac);
        } else {
            System.out.println("\nAccount Not Found.");
            return;
        }

        double bal = object.getter_balance();
        boolean status = object.getter_freeze();

        System.out.println("\n========================================");
        System.out.println("            ACCOUNT DETAILS");
        System.out.println("========================================");
        System.out.println("Account Number : " + ac);
        System.out.println("Current Balance: ₹" + bal);

        if (status) {
            System.out.println("Status         : Frozen");
        } else {
            System.out.println("Status         : Active");
        }

        System.out.println("----------------------------------------");
        holder_det.get(ac).display();
        System.out.println("========================================");
    }

    void print_transactions(long ac) {

        if (!account_details.containsKey(ac)) {
            System.out.println("No such account");
            return;
        }

        for (String s : holder_det.get(ac).list) {
            System.out.print(s);
        }

    }

    void save_data() throws Exception {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Atm_database.dat"));
        out.writeObject(account_details);
        out.writeObject(holder_det);
        out.close();
    }

    void read_account() throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("Atm_database.dat"));

        account_details = (HashMap<Long, account>) in.readObject();
        holder_det = (HashMap<Long, holder_details>) in.readObject();
        in.close();

    }
}

class holder_details implements Serializable {

    String name;
    String address;
    String father_name;
    String mother_name;
    String branch;
    long mob_no;
    ArrayList<String> list = new ArrayList<>();

    holder_details(String name, String address, String father_name, String mother_name, String branch, long mob_no) {
        this.name = name;
        this.address = address;
        this.father_name = father_name;
        this.mother_name = mother_name;
        this.branch = branch;
        this.mob_no = mob_no;
    }

    holder_details() {
        name = "";
        address = "";
        father_name = "";
        mother_name = "";
        branch = "";
        mob_no = 0;
    }

    void display() {
        System.out.println("Name          : " + name);
        System.out.println("Address       : " + address);
        System.out.println("Father Name   : " + father_name);
        System.out.println("Mother Name   : " + mother_name);
        System.out.println("Branch        : " + branch);
        System.out.println("Mobile Number : " + mob_no);
    }
}
