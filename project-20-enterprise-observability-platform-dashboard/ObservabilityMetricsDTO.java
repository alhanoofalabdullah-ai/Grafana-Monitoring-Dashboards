package com.alhanoof.observability.dto;

public class ObservabilityMetricsDTO {

    private double availability;
    private double errorRate;
    private double responseTime;
    private int activeAlerts;
    private double errorBudgetRemaining;
    private String status;

    public ObservabilityMetricsDTO(
            double availability,
            double errorRate,
            double responseTime,
            int activeAlerts,
            double errorBudgetRemaining,
            String status) {

        this.availability = availability;
        this.errorRate = errorRate;
        this.responseTime = responseTime;
        this.activeAlerts = activeAlerts;
        this.errorBudgetRemaining = errorBudgetRemaining;
        this.status = status;
    }

    public double getAvailability() { return availability; }
    public double getErrorRate() { return errorRate; }
    public double getResponseTime() { return responseTime; }
    public int getActiveAlerts() { return activeAlerts; }
    public double getErrorBudgetRemaining() { return errorBudgetRemaining; }
    public String getStatus() { return status; }
}
