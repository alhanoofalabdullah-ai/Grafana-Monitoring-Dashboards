# 🚀 Project 17 – Enterprise Incident Management Monitoring Dashboard

## Overview

The Enterprise Incident Management Monitoring Dashboard is a centralized monitoring platform designed to provide real-time visibility into incident management operations.

The solution integrates Grafana, Prometheus, Spring Boot, and Docker to monitor operational incidents, service disruptions, critical events, resolution performance, and service management KPIs.

This dashboard helps Operations Teams, Service Management Teams, NOC Engineers, and IT Leadership track incident lifecycle performance and improve operational stability.

---

# Business Objectives

Organizations often struggle with:

- High incident volumes
- Slow resolution times
- SLA breaches
- Lack of operational visibility
- Delayed escalation processes

This project provides:

- Real-Time Incident Monitoring
- Operational Performance Visibility
- MTTR Tracking
- Incident Trend Analysis
- SLA Monitoring
- Executive Reporting Dashboard

---

# Key Features

## Incident Monitoring

Monitor:

- Open Incidents
- Closed Incidents
- Critical Incidents
- Escalated Incidents
- Major Incidents

---

## Service Desk KPIs

Track:

- Mean Time To Resolve (MTTR)
- Mean Time To Acknowledge (MTTA)
- Incident Backlog
- Resolution Rate
- Escalation Rate

---

## Operational Dashboards

Grafana dashboards provide:

- Real-Time Incident Overview
- Incident Trends
- Incident Distribution
- Service Impact Analysis
- Resolution Performance

---

## Alert Management

Prometheus alerts for:

- High Incident Volume
- Critical Incident Threshold
- SLA Breach Risk
- Service Outages
- API Availability

---

## REST Monitoring API

Expose monitoring data through:

```http
GET /api/incidents
```

Sample Response:

```json
{
  "openIncidents": 12,
  "closedIncidents": 185,
  "criticalIncidents": 3,
  "averageResolutionTime": 4.5,
  "status": "Stable"
}
```

---

# Architecture

```text
Service Desk Platform
        │
        ▼
 Spring Boot API
        │
        ▼
   Prometheus
        │
        ▼
    Grafana
        │
        ▼
 Operations Team
        │
        ▼
 IT Leadership
```

---

# Technology Stack

| Component | Technology |
|------------|------------|
| Backend | Spring Boot 3 |
| Language | Java 21 |
| Monitoring | Prometheus |
| Visualization | Grafana |
| Containers | Docker |
| Build Tool | Maven |
| APIs | REST API |

---

# Project Structure

```text
project-17-incident-management-monitoring-dashboard/

├── incident-monitor-api
│   ├── controller
│   ├── service
│   └── dto
│
├── prometheus
│   ├── prometheus.yml
│   └── alert-rules.yml
│
├── grafana
│   ├── dashboards
│   └── provisioning
│
├── scripts
│
├── docker-compose.yml
│
└── README.md
```

---

# Incident Metrics

The dashboard monitors:

| Metric | Description |
|----------|-------------|
| Open Incidents | Active unresolved incidents |
| Closed Incidents | Resolved incidents |
| Critical Incidents | High severity incidents |
| MTTR | Mean Time To Resolve |
| Escalation Rate | Escalated incidents percentage |
| Resolution Rate | Incident closure performance |
| SLA Compliance | Service level achievement |

---

# Prometheus Alert Rules

## Incident API Down

```yaml
up{job="incident-api"} == 0
```

Severity:

```text
Critical
```

---

## High Incident Volume

```yaml
incident_count > 100
```

Severity:

```text
Warning
```

---

## Critical Incident Threshold

```yaml
critical_incidents > 10
```

Severity:

```text
Critical
```

---

# Docker Deployment

Build services:

```bash
docker-compose build
```

Start environment:

```bash
docker-compose up -d
```

Check containers:

```bash
docker ps
```

Stop environment:

```bash
docker-compose down
```

---

# Access URLs

## Grafana

```text
http://localhost:3000
```

## Prometheus

```text
http://localhost:9090
```

## Incident API

```text
http://localhost:8080/api/incidents
```

---

# Monitoring Use Cases

### NOC Teams

Monitor operational incidents in real time.

### Service Desk Managers

Track resolution performance.

### IT Operations

Identify recurring issues.

### Executive Management

Review service stability KPIs.

### SRE Teams

Analyze incident trends and service reliability.

---

# Future Enhancements

- ServiceNow Integration
- Jira Service Management Integration
- Incident Prediction
- Machine Learning Analytics
- Root Cause Analysis Dashboard
- Automated Escalation Workflows
- Email Notifications
- Microsoft Teams Alerts
- Slack Integration

---

# Skills Demonstrated

- Java Development
- Spring Boot
- REST APIs
- Docker
- Prometheus
- Grafana
- Monitoring Engineering
- Observability
- IT Operations
- Incident Management
- DevOps Fundamentals
- SRE Concepts

---

# Author

Alhanoof Alabdullah

Enterprise Monitoring & Observability Portfolio Project
