#!/bin/bash

echo "$(date) WARNING Failed Login" >> logs/security-events.log

echo "$(date) ERROR Unauthorized Access" >> logs/security-events.log

echo "$(date) CRITICAL Malware Detected" >> logs/security-events.log

echo "Security Events Generated"
