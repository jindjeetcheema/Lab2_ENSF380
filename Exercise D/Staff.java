public class Staff {
    private int staffId;
    private String name;
    private String position;
    private String contactInfo;

    public Staff(int staffId, String name, String position, String contactInfo) {
        this.staffId = staffId;
        this.name = name;
        this.position = position;
        this.contactInfo = contactInfo;
    }

    // Getters and Setters
    public int getStaffId() { return staffId; }
    public String getName() { return name; }
    public String getPosition() { return position; }
    public String getContactInfo() { return contactInfo; }

    public void managePetProfile(Pet pet) {
        // Logic to manage pet profile
    }

    public void manageClientProfile(Client client) {
        // Logic to manage client profile
    }

    public void handleReservations(Reservation reservation) {
        // Logic to handle reservations
    }
}
