package com.alhanoof.elk.dto;

public class ElkMetricsDTO {

    private int indexedDocuments;
    private int errorLogs;
    private int warningLogs;
    private double ingestionRate;
    private String status;

    public ElkMetricsDTO(
            int indexedDocuments,
            int errorLogs,
            int warningLogs,
            double ingestionRate,
            String status) {

        this.indexedDocuments = indexedDocuments;
        this.errorLogs = errorLogs;
        this.warningLogs = warningLogs;
        this.ingestionRate = ingestionRate;
        this.status = status;
    }

    public int getIndexedDocuments() {
        return indexedDocuments;
    }

    public int getErrorLogs() {
        return errorLogs;
    }

    public int getWarningLogs() {
        return warningLogs;
    }

    public double getIngestionRate() {
        return ingestionRate;
    }

    public String getStatus() {
        return status;
    }
}
