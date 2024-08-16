import java.util.Date;

public class Billing {
    private int invoiceId;
    private double amount;
    private Date dateIssued;
    private Date dueDate;

    public Billing(int invoiceId, double amount, Date dateIssued, Date dueDate) {
        this.invoiceId = invoiceId;
        this.amount = amount;
        this.dateIssued = dateIssued;
        this.dueDate = dueDate;
    }

    // Getters and Setters
    public int getInvoiceId() { return invoiceId; }
    public double getAmount() { return amount; }
    public Date getDateIssued() { return dateIssued; }
    public Date getDueDate() { return dueDate; }

    public void processPayment() {
        // Logic to process payment
    }

    public void issueRefund() {
        // Logic to issue refund
    }
}
