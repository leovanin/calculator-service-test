#!/bin/bash

if ! which nmap
then
    echo "NMAP not detected. Please install it before continue."
    exit 1
fi

for min in $(seq 1 15)
do 
  if nmap -sS -p 8200 localhost|grep "^8200/tcp open"&>.tmp
  then 
    echo "Port 8200: OK"
    break
  else
    sleep 60
    echo "Already passed $min minute(s) and the port is still closed."
  fi
done