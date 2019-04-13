#!/bin/sh
mvn clean package && docker build -t co.edu.utp.microservicios/hola-mundo .
docker rm -f hola-mundo || true && docker run -d -p 8080:8080 -p 4848:4848 --name hola-mundo co.edu.utp.microservicios/hola-mundo 
