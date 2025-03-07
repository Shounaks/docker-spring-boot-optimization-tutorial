#!/bin/sh
set -e
exec java ${JAVA_OPTS} ${JAVA_CONTAINER} -cp 'dependencies/:spring-boot-loader/:snapshot-dependencies/:application/' org.springframework.boot.loader.JarLauncher