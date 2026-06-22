package com.alhanoof.sla.dto;

public class SlaMetricsDTO {

    private double slaCompliance;
    private double serviceAvailability;
    private int breachedTickets;
    private double averageResponseTime;
    private double averageResolutionTime;
    private String status;

    public SlaMetricsDTO(
            double slaCompliance,
            double serviceAvailability,
            int breachedTickets,
            double averageResponseTime,
            double averageResolutionTime,
            String status) {

        this.slaCompliance = slaCompliance;
        this.serviceAvailability = serviceAvailability;
        this.breachedTickets = breachedTickets;
        this.averageResponseTime = averageResponseTime;
        this.averageResolutionTime = averageResolutionTime;
        this.status = status;
    }

    public double getSlaCompliance() {
        return slaCompliance;
    }

    public double getServiceAvailability() {
        return serviceAvailability;
    }

    public int getBreachedTickets() {
        return breachedTickets;
    }

    public double getAverageResponseTime() {
        return averageResponseTime;
    }

    public double getAverageResolutionTime() {
        return averageResolutionTime;
    }

    public String getStatus() {
        return status;
    }
}
