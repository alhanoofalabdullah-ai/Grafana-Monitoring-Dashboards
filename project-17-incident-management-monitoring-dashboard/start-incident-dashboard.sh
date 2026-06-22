#!/bin/bash

echo "Starting Incident Management Monitoring Dashboard..."

docker-compose up -d

echo "Grafana: http://localhost:3000"
echo "Prometheus: http://localhost:9090"
echo "Incident API: http://localhost:8080/api/incidents"
