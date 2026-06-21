#!/bin/bash

echo "Starting Database Monitoring Dashboard..."

docker-compose up -d

echo "Grafana: http://localhost:3000"
echo "Prometheus: http://localhost:9090"
echo "Database API: http://localhost:8080/api/database-metrics"
