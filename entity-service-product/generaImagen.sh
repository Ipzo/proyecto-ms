#!/bin/bash

mvn package

docker build -t ipzo/entity-service-productos-patterns:0.1-snapshot .


# Crea imagen
# mvn spring-boot:build-image

# Ejecuta con spring
#mvn spring-boot:run
