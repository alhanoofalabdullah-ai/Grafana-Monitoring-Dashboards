#!/bin/bash

echo "Starting APM Dashboard..."

docker-compose up -d

echo "Grafana: http://localhost:3000"

echo "Prometheus: http://localhost:9090"

echo "APM API: http://localhost:8080/api/apm"
