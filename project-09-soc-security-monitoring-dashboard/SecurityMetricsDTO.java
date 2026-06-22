package com.alhanoof.socmonitor.dto;

public class SecurityMetricsDTO {

    private int securityEvents;
    private int failedLogins;
    private int activeThreats;
    private int criticalAlerts;
    private String status;

    public SecurityMetricsDTO(
            int securityEvents,
            int failedLogins,
            int activeThreats,
            int criticalAlerts,
            String status) {

        this.securityEvents = securityEvents;
        this.failedLogins = failedLogins;
        this.activeThreats = activeThreats;
        this.criticalAlerts = criticalAlerts;
        this.status = status;
    }

    public int getSecurityEvents() {
        return securityEvents;
    }

    public int getFailedLogins() {
        return failedLogins;
    }

    public int getActiveThreats() {
        return activeThreats;
    }

    public int getCriticalAlerts() {
        return criticalAlerts;
    }

    public String getStatus() {
        return status;
    }
}
