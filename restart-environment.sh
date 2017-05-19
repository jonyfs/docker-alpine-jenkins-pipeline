#!/bin/bash
./stop.sh
./remove-containers.sh
./remove-images.sh
./rebuild.sh
./start.sh
