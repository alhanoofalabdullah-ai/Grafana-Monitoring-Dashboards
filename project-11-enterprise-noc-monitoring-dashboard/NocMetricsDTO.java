package com.alhanoof.noc.dto;

public class NocMetricsDTO {

    private int activeIncidents;
    private int criticalAlerts;
    private double serviceAvailability;
    private double slaCompliance;
    private String nocStatus;

    public NocMetricsDTO(
            int activeIncidents,
            int criticalAlerts,
            double serviceAvailability,
            double slaCompliance,
            String nocStatus) {

        this.activeIncidents = activeIncidents;
        this.criticalAlerts = criticalAlerts;
        this.serviceAvailability = serviceAvailability;
        this.slaCompliance = slaCompliance;
        this.nocStatus = nocStatus;
    }

    public int getActiveIncidents() {
        return activeIncidents;
    }

    public int getCriticalAlerts() {
        return criticalAlerts;
    }

    public double getServiceAvailability() {
        return serviceAvailability;
    }

    public double getSlaCompliance() {
        return slaCompliance;
    }

    public String getNocStatus() {
        return nocStatus;
    }
}
