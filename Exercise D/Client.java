public class Client {
    private int clientId;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public Client(int clientId, String name, String address, String phoneNumber, String email) {
        this.clientId = clientId;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getters and Setters
    public int getClientId() { return clientId; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }

    public void updateClientDetails(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void createReservation() {
        // Logic to create a new reservation
    }
}
