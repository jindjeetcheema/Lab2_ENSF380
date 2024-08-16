import java.util.Date;

public class Reservation {
    private int reservationId;
    private Date startDate;
    private Date endDate;
    private String status;

    public Reservation(int reservationId, Date startDate, Date endDate, String status) {
        this.reservationId = reservationId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    // Getters and Setters
    public int getReservationId() { return reservationId; }
    public Date getStartDate() { return startDate; }
    public Date getEndDate() { return endDate; }
    public String getStatus() { return status; }

    public void updateReservation(Date startDate, Date endDate, String status) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    public void cancelReservation() {
        this.status = "Cancelled";
    }
}
