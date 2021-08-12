#!/bin/sh

# ATTENTION, CETTE INSTRUCTION VA STOPPER TOUS LES CONTAINERS
# sudo docker kill $(sudo docker ps -q)

#cd ./custom-images/activemq
#sudo docker build -t dimsoft/activemq:latest .
#sudo docker run -d -p 8161:8161 -p 61616:61616 -p 61613:61613 -p 5672:5672 -p 1883:1883 -p 61614:61614 dimsoft/activemq:latest

#cd ../..
sudo docker-compose up -d --build
