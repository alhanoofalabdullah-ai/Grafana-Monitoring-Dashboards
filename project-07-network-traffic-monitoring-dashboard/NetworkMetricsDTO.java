package com.alhanoof.networkmonitor.dto;

public class NetworkMetricsDTO {

    private double inboundTraffic;
    private double outboundTraffic;
    private double latency;
    private int activeConnections;
    private String status;

    public NetworkMetricsDTO(
            double inboundTraffic,
            double outboundTraffic,
            double latency,
            int activeConnections,
            String status) {

        this.inboundTraffic = inboundTraffic;
        this.outboundTraffic = outboundTraffic;
        this.latency = latency;
        this.activeConnections = activeConnections;
        this.status = status;
    }

    public double getInboundTraffic() {
        return inboundTraffic;
    }

    public double getOutboundTraffic() {
        return outboundTraffic;
    }

    public double getLatency() {
        return latency;
    }

    public int getActiveConnections() {
        return activeConnections;
    }

    public String getStatus() {
        return status;
    }
}
