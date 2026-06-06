# Project 02 – Server Health Dashboard

Enterprise Server Health Monitoring Dashboard using Grafana, Prometheus, Node Exporter, and Hardware Metrics.

---

# Overview

This project demonstrates a professional Grafana dashboard for monitoring server health, hardware status, resource utilization, and operational availability.

The dashboard is designed for Infrastructure Teams, NOC Teams, SRE Engineers, DevOps Engineers, and IT Operations teams.

---

# Business Scenario

Enterprise servers host critical business applications, databases, APIs, internal systems, and infrastructure services.

Without server health monitoring, organizations may face:

- Hardware Failures
- CPU Overheating
- Disk Failures
- Memory Exhaustion
- Server Downtime
- Performance Degradation

This dashboard provides centralized visibility into server health and operational readiness.

---

# Architecture

Servers

↓

Node Exporter

↓

Hardware Metrics Exporter

↓

Prometheus

↓

Grafana

↓

Infrastructure Operations Team

---

# Dashboard Panels

## Server Availability

Displays:

- Server Up/Down Status
- Uptime
- Availability Percentage
- Health Score

---

## CPU Health

Displays:

- CPU Usage
- CPU Load
- CPU Temperature
- CPU Core Status

---

## Memory Health

Displays:

- Used Memory
- Available Memory
- Swap Usage
- Memory Pressure

---

## Disk Health

Displays:

- Disk Usage
- Disk Free Space
- Disk Read/Write Activity
- Disk Failure Indicators

---

## Hardware Health

Displays:

- Fan Status
- Temperature Status
- Power Supply Status
- Hardware Alerts

---

# Monitoring Metrics

- Server Availability
- CPU Utilization
- CPU Temperature
- Memory Usage
- Disk Utilization
- Disk I/O
- Network Activity
- Hardware Status

---

# Alert Rules

## Server Down

Severity:

Critical

---

## High CPU Temperature

Threshold:

75°C

Severity:

Critical

---

## Disk Space Critical

Threshold:

90%

Severity:

Critical

---

## High Memory Usage

Threshold:

85%

Severity:

Warning

---

## Hardware Failure Detected

Severity:

Critical

---

# Technologies Used

- Grafana
- Prometheus
- Node Exporter
- Docker
- Linux
- Hardware Metrics

---

# Skills Demonstrated

- Grafana Dashboard Design
- Server Health Monitoring
- Infrastructure Operations
- Hardware Monitoring
- Alert Engineering
- Prometheus Metrics
- Enterprise Observability

---

# Author

Alhanoof Alabdullah
