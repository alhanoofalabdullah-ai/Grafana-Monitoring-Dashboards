#!/bin/bash

echo "Deploying Kubernetes Monitoring Stack..."

kubectl apply -f k8s/namespace.yaml

kubectl apply -f k8s/deployment.yaml

kubectl apply -f k8s/service.yaml

echo "Deployment Completed"
