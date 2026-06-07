# Project 08 – Security Operations Dashboard

Enterprise Security Operations Center (SOC) Dashboard using Grafana, Prometheus, ELK Stack, and Security Event Monitoring.

---

# Overview

This project demonstrates enterprise-grade security monitoring and cybersecurity observability.

The dashboard provides real-time visibility into authentication events, failed login attempts, firewall activity, threat detection, security incidents, and security KPIs.

The solution is designed for SOC Analysts, Cybersecurity Engineers, Security Operations Teams, Incident Response Teams, and IT Security Managers.

---

# Business Scenario

Organizations face increasing cybersecurity threats every day.

Without centralized monitoring organizations may experience:

- Unauthorized Access
- Brute Force Attacks
- Privilege Abuse
- Firewall Violations
- Security Incidents
- Delayed Threat Detection

This dashboard provides centralized visibility for proactive security monitoring and incident response.

---

# Architecture

Servers

Applications

Firewalls

Authentication Systems

↓

Logstash

↓

Elasticsearch

↓

Prometheus

↓

Grafana

↓

Security Operations Center

---

# Components

## Authentication Monitoring

Monitors:

- Successful Logins
- Failed Logins
- Account Lockouts
- Privileged Access

---

## Firewall Monitoring

Monitors:

- Blocked Connections
- Allowed Connections
- Firewall Events
- Security Violations

---

## Threat Detection

Monitors:

- Brute Force Attempts
- Suspicious Activity
- Security Alerts
- Threat Indicators

---

## Security KPI Monitoring

Monitors:

- Security Events
- Incident Volume
- Threat Detection Rate
- Security Health Score

---

## Grafana

Provides:

- SOC Dashboards
- Security Reporting
- KPI Visualization

---

## Elasticsearch

Provides:

- Log Storage
- Security Event Search
- Threat Analytics

---

## Logstash

Provides:

- Log Collection
- Log Parsing
- Event Normalization

---

# Dashboard Panels

## Security Overview

Displays:

- Security Health Score
- Active Alerts
- Security Events
- Threat Indicators

---

## Authentication Monitoring

Displays:

- Login Attempts
- Failed Logins
- Successful Logins
- Account Lockouts

---

## Firewall Monitoring

Displays:

- Firewall Activity
- Blocked Connections
- Allowed Connections
- Security Violations

---

## Threat Detection

Displays:

- Threat Events
- Brute Force Attempts
- Suspicious Activity
- Critical Alerts

---

## Security KPIs

Displays:

- Security Incidents
- Threat Detection Rate
- Failed Login Rate
- Security Compliance

---

# Monitoring Metrics

## Authentication Metrics

- Successful Logins
- Failed Logins
- Locked Accounts
- Privileged Access

---

## Firewall Metrics

- Allowed Connections
- Blocked Connections
- Firewall Violations

---

## Threat Metrics

- Security Incidents
- Threat Alerts
- Threat Severity

---

## Security KPIs

- Incident Count
- Security Score
- Threat Detection Rate
- Mean Time To Detect

---

# Alert Rules

## Excessive Failed Logins

Threshold:

10 Failed Logins

Severity:

Critical

---

## Brute Force Attack

Threshold:

50 Failed Attempts

Severity:

Critical

---

## Unauthorized Access

Severity:

Critical

---

## Firewall Security Event

Severity:

Warning

---

## Security Incident Detected

Severity:

Critical

---

# Technologies Used

- Grafana
- Prometheus
- Elasticsearch
- Logstash
- Kibana
- Docker
- Linux

---

# Skills Demonstrated

- Security Monitoring
- SOC Operations
- Threat Detection
- Log Analytics
- Security Dashboards
- Cybersecurity Monitoring
- Incident Response
- Observability Engineering

---

# Author

Alhanoof Alabdullah
