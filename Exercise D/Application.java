import java.util.Scanner;
import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        // Sample data for testing
        Client client = new Client(1, "John Doe", "123 Maple St", "555-1234", "john@example.com");
        Pet pet = new Pet(1, "Buddy", "Dog", "Golden Retriever", 5, "Twice a day", "None");
        Reservation reservation = new Reservation(1, new Date(), new Date(), "Confirmed");
        Billing billing = new Billing(1, 100.0, new Date(), new Date());
        Staff staff = new Staff(1, "Jane Smith", "Manager", "555-5678");
        Admin admin = new Admin(1, "admin", "password");
        Notification notification = new Notification(1, "Reminder: Reservation Tomorrow", new Date());
        Report report = new Report(1, "Daily Care Report", new Date(), "All pets are healthy.");

        while (!exit) {
            System.out.println("Welcome to YYC Pet Resort Management System");
            System.out.println("1. Manage Client Information");
            System.out.println("2. Manage Pet Information");
            System.out.println("3. Manage Reservations");
            System.out.println("4. Manage Billing and Payments");
            System.out.println("5. Manage Notifications");
            System.out.println("6. Manage Reports");
            System.out.println("7. Admin Functions");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Logic for managing client information
                    System.out.println("Client Name: " + client.getName());
                    System.out.println("Client Address: " + client.getAddress());
                    System.out.println("Client Phone: " + client.getPhoneNumber());
                    System.out.println("Client Email: " + client.getEmail());
                    // More options like updating client details can be added here
                    break;
                case 2:
                    // Logic for managing pet information
                    System.out.println("Pet Name: " + pet.getName());
                    System.out.println("Pet Species: " + pet.getSpecies());
                    System.out.println("Pet Breed: " + pet.getBreed());
                    System.out.println("Pet Age: " + pet.getAge());
                    System.out.println("Feeding Instructions: " + pet.getFeedingInstructions());
                    System.out.println("Medication Instructions: " + pet.getMedicationInstructions());
                    // More options like updating pet details can be added here
                    break;
                case 3:
                    // Logic for managing reservations
                    System.out.println("Reservation ID: " + reservation.getReservationId());
                    System.out.println("Start Date: " + reservation.getStartDate());
                    System.out.println("End Date: " + reservation.getEndDate());
                    System.out.println("Status: " + reservation.getStatus());
                    // More options like updating or canceling reservations can be added here
                    break;
                case 4:
                    // Logic for managing billing and payments
                    System.out.println("Invoice ID: " + billing.getInvoiceId());
                    System.out.println("Amount: " + billing.getAmount());
                    System.out.println("Date Issued: " + billing.getDateIssued());
                    System.out.println("Due Date: " + billing.getDueDate());
                    // More options like processing payments or issuing refunds can be added here
                    break;
                case 5:
                    // Logic for managing notifications
                    System.out.println("Notification Message: " + notification.getMessage());
                    System.out.println("Date Sent: " + notification.getDateSent());
                    // More options like sending or scheduling notifications can be added here
                    break;
                case 6:
                    // Logic for managing reports
                    System.out.println("Report Type: " + report.getReportType());
                    System.out.println("Date Generated: " + report.getDateGenerated());
                    System.out.println("Content: " + report.getContent());
                    // More options like generating new reports can be added here
                    break;
                case 7:
                    // Admin functions
                    System.out.println("Admin Username: " + admin.getUsername());
                    // More admin functions like adding/removing staff can be added here
                    break;
                case 0:
                    exit = true;
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println(); // Blank line for better readability
        }

        scanner.close();
    }
}
