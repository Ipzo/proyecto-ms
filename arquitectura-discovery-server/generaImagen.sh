#!/bin/bash

mvn package

docker build -t ipzo/arquitectura-discovery-server-patterns:0.0.1-snapshot .

