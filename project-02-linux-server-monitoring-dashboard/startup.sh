#!/bin/bash

echo "Starting Linux Monitoring Center..."

docker-compose up -d

echo "Grafana Started"
echo "Prometheus Started"
echo "Monitoring API Started"
