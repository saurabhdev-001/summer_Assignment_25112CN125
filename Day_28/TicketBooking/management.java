
import java.util.*;

public class management {

    HashMap<String, ticket> data = new HashMap<>();
    private int seatsrem = 100;
    Scanner sc;
    ArrayList<String> list = new ArrayList<>();

    public void addTicket() {
        if (!(seatsrem > 0)) {
            System.out.println("No seats are empty");
            return;
        }
        ticket t = new ticket();
        System.out.println("\n========================================");
        System.out.println("           ADD NEW TICKET");
        System.out.println("========================================");

        t.ticketId = generateTicketId();
        System.out.println("Generated Ticket ID : " + t.ticketId);

        System.out.print("Enter Customer Name      : ");
        t.customerName = sc.nextLine();

        System.out.print("Enter Source             : ");
        t.source = sc.nextLine();

        System.out.print("Enter Destination        : ");
        t.destination = sc.nextLine();

        System.out.print("Enter Travel Date (DD/MM/YYYY) : ");
        t.travelDate = sc.nextLine();

        System.out.print("Enter Seat Number        : ");

        t.seatNumber = sc.nextLine();
        if (list.contains(t.seatNumber)) {
            System.out.println("Unfortunately that seat is full");
        }
        list.add(t.seatNumber);

        System.out.print("Enter Ticket Fare (₹)    : ");
        t.fare = sc.nextDouble();

        t.isCancelled = false;

        data.put(t.ticketId, t);

        System.out.println("\n========================================");
        System.out.println("      TICKET BOOKED SUCCESSFULLY");
        System.out.println("========================================");
        System.out.println("Ticket ID   : " + t.ticketId);
        System.out.println("Customer    : " + t.customerName);
        System.out.println("Source      : " + t.source);
        System.out.println("Destination : " + t.destination);
        System.out.println("Travel Date : " + t.travelDate);
        System.out.println("Seat Number : " + t.seatNumber);
        System.out.println("Fare        : ₹" + t.fare);
        System.out.println("========================================\n");
        seatsrem--;

    }

    private String generateTicketId() {
        Random r = new Random();
        String id = "";
        int b;
        boolean gen = false;
        do {
            for (int a = 1; a <= 8; a++) {
                b = r.nextInt(1, 10);
                id = id + b + "";

            }
            id = "NR" + id;
            if (data.containsKey(id)) {
                gen = true;
                id = "";
            } else {
                gen = false;

            }
        } while (gen);
        return id;

    }

    public void printTicket() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n========================================");
        System.out.println("            PRINT TICKET");
        System.out.println("========================================");

        System.out.print("Enter Ticket ID : ");
        String ticketId = sc.nextLine();

        ticket t = data.get(ticketId);

        if (t == null) {
            System.out.println("\nTicket not found!");
            return;
        }

        System.out.println("\n========================================");
        System.out.println("             TICKET DETAILS");
        System.out.println("========================================");
        System.out.println("Ticket ID      : " + t.ticketId);
        System.out.println("Customer Name  : " + t.customerName);
        System.out.println("Source         : " + t.source);
        System.out.println("Destination    : " + t.destination);
        System.out.println("Travel Date    : " + t.travelDate);
        System.out.println("Seat Number    : " + t.seatNumber);
        System.out.println("Fare           : ₹" + t.fare);
        System.out.println("Status         : " + (t.isCancelled ? "Cancelled" : "Confirmed"));
        System.out.println("========================================");
    }

    void cancel_Ticket() {
        System.out.println("\n========================================");
        System.out.println("           CANCEL TICKET");
        System.out.println("========================================");
        System.out.print("Enter Ticket ID : ");
        String id = sc.nextLine();
        ticket t;
        System.out.println("\nSearching ticket...");
        if (data.containsKey(id)) {
            t = data.get(id);
            System.out.println("\nTicket Details");
            System.out.println("----------------------------------------");
            System.out.println("Ticket ID      : " + t.ticketId);
            System.out.println("Customer Name  : " + t.customerName);
            System.out.println("Source         : " + t.source);
            System.out.println("Destination    : " + t.destination);
            System.out.println("Travel Date    : " + t.travelDate);
            System.out.println("Seat Number    : " + t.seatNumber);
            System.out.println("Fare           : ₹" + t.fare);
            System.out.print("\nAre you sure you want to cancel this ticket? (Y/N): ");
            String choice = sc.nextLine();
            if (choice.charAt(0) == 'y' || choice.charAt(0) == 'Y') {
                data.remove(id);
                list.remove(t.seatNumber);
            } else {
                System.out.println("Cancellation aborted.");
            }
            System.out.println("\nCancelling ticket...");

            System.out.println("Ticket cancelled successfully!");

            System.out.println("========================================");

        } else {
            System.out.println("Ticket not found!");

        }
    }
}
