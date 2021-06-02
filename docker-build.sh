#!/usr/bin/env bash

./gradlew :store-api:clean :store-api:build
./gradlew :store-streams:clean :store-streams:build

docker build -t store-api:1.0.0 store-api
docker build -t store-streams:1.0.0 store-streams
