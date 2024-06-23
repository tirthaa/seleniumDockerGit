#!/usr/bin/env bash
# Environment Variables
# HUB_HOST
# BROWSER
# MODULE
sleep 10
echo "Checking if Hub is ready - $HUB_HOST"
echo $HUB_HOST
echo $BROWSER
echo $MODULE
#while [ "$( curl -s http://$HUB_HOST:4444/wd/hub/status  |  jq -r .value.ready | grep "true" )" != "true" ]
#while ! curl -s http://$HUB_HOST:4444/wd/hub/status | jq -r .value.ready | grep "true";
#do
##	echo "in loop"
#done

java -cp selenium-docker.jar:selenium-docker-tests.jar:libs/* -DHUB_HOST=$HUB_HOST -DBROWSER=$BROWSER org.testng.TestNG $MODULE