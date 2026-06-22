#!/bin/bash

echo "Starting Enterprise NOC Monitoring Dashboard..."

docker-compose up -d

echo "Grafana: http://localhost:3000"
echo "Prometheus: http://localhost:9090"
echo "NOC API: http://localhost:8080/api/noc"
