
import java.io.*;

public class account implements Serializable {

    private long account_no;
    private int pin;
    private double balance;
    private boolean freeze;

    void setter_pin(int pin) {
        this.pin = pin;
    }

    void setter_freeze(boolean freeze) {
        this.freeze = freeze;
    }

    boolean getter_freeze() {
        return freeze;
    }

    void setter_acc_no(long num) {
        if (account_no == 0) {
            this.account_no = num;
        }

    }

    long getter_account_no() {
        return account_no;
    }

    double getter_balance() {
        return balance;
    }

    boolean withdraw(int amt) {
        if (amt > balance) {
            System.out.println("INSUFFICIENT BALANCE");
            return false;
        }
        balance = balance - amt;
        return true;

    }

    double deposit(double amt) {
        balance = balance + amt;
        return balance;
    }

    boolean verify_pin(int pin) {
        if (this.pin == pin) {
            return true;
        } else {
            return false;
        }
    }

}
