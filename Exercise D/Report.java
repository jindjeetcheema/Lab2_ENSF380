import java.util.Date;

public class Report {
    private int reportId;
    private String reportType;
    private Date dateGenerated;
    private String content;

    public Report(int reportId, String reportType, Date dateGenerated, String content) {
        this.reportId = reportId;
        this.reportType = reportType;
        this.dateGenerated = dateGenerated;
        this.content = content;
    }

    // Getters and Setters
    public int getReportId() { return reportId; }
    public String getReportType() { return reportType; }
    public Date getDateGenerated() { return dateGenerated; }
    public String getContent() { return content; }

    public String generateReport() {
        // Logic to generate report
        return content;
    }

    public String viewReport() {
        return content;
    }
}
