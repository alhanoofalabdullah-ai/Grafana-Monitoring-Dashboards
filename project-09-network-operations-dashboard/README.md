# Project 09 – Network Operations Dashboard

Enterprise Network Operations Dashboard using Grafana, Prometheus, SNMP Exporter, Blackbox Exporter, and Node Exporter.

---

# Overview

This project demonstrates enterprise-grade network monitoring and operational visibility.

The dashboard provides real-time monitoring of routers, switches, firewalls, WAN links, bandwidth utilization, latency, packet loss, device health, and network availability.

The solution is designed for Network Engineers, NOC Teams, Infrastructure Engineers, and Operations Centers.

---

# Business Scenario

Enterprise networks support critical business operations and services.

Without network monitoring organizations may face:

- Network Outages
- High Latency
- Packet Loss
- Device Failures
- WAN Connectivity Issues
- Service Interruptions

This dashboard provides centralized monitoring for enterprise network operations.

---

# Architecture

Routers

↓

Switches

↓

Firewalls

↓

SNMP Exporter

↓

Blackbox Exporter

↓

Prometheus

↓

Grafana

↓

Network Operations Center

---

# Components

## Routers

Monitor:

- Interface Utilization
- Routing Status
- Traffic Flow
- Network Availability

---

## Switches

Monitor:

- Port Utilization
- Interface Errors
- Switch Availability
- Network Throughput

---

## Firewalls

Monitor:

- Security Events
- Active Sessions
- Firewall Health
- Traffic Statistics

---

## SNMP Exporter

Collects:

- Device Metrics
- Interface Statistics
- Hardware Health
- Traffic Counters

---

## Blackbox Exporter

Collects:

- Ping Response
- Latency
- Availability
- Connectivity Status

---

## Prometheus

Responsible for:

- Metrics Collection
- Alert Evaluation
- Time-Series Storage

---

## Grafana

Responsible for:

- Dashboard Visualization
- Reporting
- Network Analytics

---

# Dashboard Panels

## Network Overview

Displays:

- Network Availability
- Active Devices
- Device Health
- Network Status

---

## Bandwidth Monitoring

Displays:

- Bandwidth Utilization
- Incoming Traffic
- Outgoing Traffic
- Throughput Analysis

---

## Latency Monitoring

Displays:

- Response Times
- Latency Trends
- WAN Performance
- Network Delays

---

## Device Monitoring

Displays:

- Router Health
- Switch Health
- Firewall Status
- Device Availability

---

## Interface Monitoring

Displays:

- Interface Errors
- Packet Drops
- Interface Utilization
- Link Status

---

# Monitoring Metrics

## Device Metrics

- Device Availability
- CPU Utilization
- Memory Utilization
- Hardware Status

---

## Network Metrics

- Latency
- Packet Loss
- Bandwidth Usage
- Throughput

---

## Interface Metrics

- Interface Traffic
- Interface Errors
- Link Availability

---

## Security Metrics

- Firewall Events
- Blocked Connections
- Security Alerts

---

# Alert Rules

## Device Down

Severity:

Critical

---

## High Latency

Threshold:

100ms

Severity:

Warning

---

## Packet Loss Detected

Threshold:

5%

Severity:

Critical

---

## High Bandwidth Utilization

Threshold:

80%

Severity:

Warning

---

## Interface Errors

Threshold:

100 Errors

Severity:

Warning

---

# Technologies Used

- Grafana
- Prometheus
- SNMP Exporter
- Blackbox Exporter
- Node Exporter
- Docker
- Linux

---

# Skills Demonstrated

- Network Monitoring
- NOC Operations
- Grafana Dashboard Design
- Infrastructure Monitoring
- SNMP Monitoring
- Network Analytics
- Alert Engineering
- Observability Engineering

---

# Author

Alhanoof Alabdullah
