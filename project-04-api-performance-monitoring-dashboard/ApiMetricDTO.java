package com.alhanoof.apimonitor.dto;

public class ApiMetricDTO {

    private Integer totalRequests;
    private Integer successfulRequests;
    private Integer failedRequests;
    private Double averageResponseTime;
    private String apiStatus;

    public ApiMetricDTO(
            Integer totalRequests,
            Integer successfulRequests,
            Integer failedRequests,
            Double averageResponseTime,
            String apiStatus
    ) {
        this.totalRequests = totalRequests;
        this.successfulRequests = successfulRequests;
        this.failedRequests = failedRequests;
        this.averageResponseTime = averageResponseTime;
        this.apiStatus = apiStatus;
    }

    public Integer getTotalRequests() {
        return totalRequests;
    }

    public Integer getSuccessfulRequests() {
        return successfulRequests;
    }

    public Integer getFailedRequests() {
        return failedRequests;
    }

    public Double getAverageResponseTime() {
        return averageResponseTime;
    }

    public String getApiStatus() {
        return apiStatus;
    }
}
