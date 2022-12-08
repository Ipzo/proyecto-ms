#!/bin/bash

mvn package

docker build -t ipzo/arquitectura-gateway-patterns:0.0.1-snapshot .

