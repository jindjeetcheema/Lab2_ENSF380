import java.util.Date;

public class Notification {
    private int notificationId;
    private String message;
    private Date dateSent;

    public Notification(int notificationId, String message, Date dateSent) {
        this.notificationId = notificationId;
        this.message = message;
        this.dateSent = dateSent;
    }

    // Getters and Setters
    public int getNotificationId() { return notificationId; }
    public String getMessage() { return message; }
    public Date getDateSent() { return dateSent; }

    public void sendNotification() {
        // Logic to send notification
    }

    public void scheduleNotification(Date date) {
        // Logic to schedule notification
    }
}
