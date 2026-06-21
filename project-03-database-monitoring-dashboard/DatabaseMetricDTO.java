package com.alhanoof.databasemonitor.dto;

public class DatabaseMetricDTO {

    private Integer activeConnections;
    private Integer totalQueries;
    private Double storageUsage;
    private String databaseStatus;

    public DatabaseMetricDTO(
            Integer activeConnections,
            Integer totalQueries,
            Double storageUsage,
            String databaseStatus
    ) {
        this.activeConnections = activeConnections;
        this.totalQueries = totalQueries;
        this.storageUsage = storageUsage;
        this.databaseStatus = databaseStatus;
    }

    public Integer getActiveConnections() {
        return activeConnections;
    }

    public Integer getTotalQueries() {
        return totalQueries;
    }

    public Double getStorageUsage() {
        return storageUsage;
    }

    public String getDatabaseStatus() {
        return databaseStatus;
    }
}
