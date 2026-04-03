#!/bin/bash

TEMP_LIMIT=75   

TEMP=$(sensors | grep -Eo '[0-9]+(?=\.0°C)' | head -1)

echo "Current Temp: ${TEMP}°C"

if [ "$TEMP" -gt "$TEMP_LIMIT" ]; then
    echo "Temperature too high! Killing top CPU process..."

    PID=$(ps -eo pid,%cpu --sort=-%cpu | sed -n '2p' | awk '{print $1}')

    kill -9 "$PID"
    echo "Killed process PID: $PID"
else
    echo "Temperature normal."
fi
