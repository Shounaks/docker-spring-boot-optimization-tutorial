#!/bin/sh
set -e
exec java ${JAVA_OPTS} ${JAVA_CONTAINER} -jar app.jar
