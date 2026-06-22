package com.alhanoof.kpi.dto;

public class BusinessKpiDTO {

    private double revenue;

    private double projectCompletionRate;

    private double slaCompliance;

    private double customerSatisfaction;

    private String status;

    public BusinessKpiDTO(
            double revenue,
            double projectCompletionRate,
            double slaCompliance,
            double customerSatisfaction,
            String status) {

        this.revenue = revenue;
        this.projectCompletionRate = projectCompletionRate;
        this.slaCompliance = slaCompliance;
        this.customerSatisfaction = customerSatisfaction;
        this.status = status;
    }

    public double getRevenue() {
        return revenue;
    }

    public double getProjectCompletionRate() {
        return projectCompletionRate;
    }

    public double getSlaCompliance() {
        return slaCompliance;
    }

    public double getCustomerSatisfaction() {
        return customerSatisfaction;
    }

    public String getStatus() {
        return status;
    }
}
