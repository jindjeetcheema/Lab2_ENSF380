public class Admin {
    private int adminId;
    private String username;
    private String password;

    public Admin(int adminId, String username, String password) {
        this.adminId = adminId;
        this.username = username;
        this.password = password;
    }

    // Getters and Setters
    public int getAdminId() { return adminId; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }

    public void addStaff(Staff staff) {
        // Logic to add staff
    }

    public void removeStaff(Staff staff) {
        // Logic to remove staff
    }

    public void manageLoyaltyPrograms() {
        // Logic to manage loyalty programs
    }

    public void generateReports() {
        // Logic to generate reports
    }
}
