package com.alhanoof.incident.dto;

public class IncidentMetricsDTO {

    private int openIncidents;
    private int closedIncidents;
    private int criticalIncidents;
    private double averageResolutionTime;
    private String status;

    public IncidentMetricsDTO(
            int openIncidents,
            int closedIncidents,
            int criticalIncidents,
            double averageResolutionTime,
            String status) {

        this.openIncidents = openIncidents;
        this.closedIncidents = closedIncidents;
        this.criticalIncidents = criticalIncidents;
        this.averageResolutionTime = averageResolutionTime;
        this.status = status;
    }

    public int getOpenIncidents() {
        return openIncidents;
    }

    public int getClosedIncidents() {
        return closedIncidents;
    }

    public int getCriticalIncidents() {
        return criticalIncidents;
    }

    public double getAverageResolutionTime() {
        return averageResolutionTime;
    }

    public String getStatus() {
        return status;
    }
}
