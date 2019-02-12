#!/usr/bin/env bash

# check to make sure 2 parms are passed
if [ "$#" -ne 2 ]; then
    echo "Illegal number of parameters!"
    echo "Usage: update_property.sh gauge-java.version 1.0.0"
    exit 1 ;
fi

echo "Setting '$1' to '$2' ..."
mvn versions:set-property \
    -Dproperty=$1 \
    -DgenerateBackupPoms=false \
    -DnewVersion=$2
echo "Setting archetype property '$1' to '$2' ..."
mvn -f ./quickstart/src/main/resources/archetype-resources/ \
    versions:set-property \
    -Dproperty=$1 \
    -DnewVersion=$2 \
    -DgenerateBackupPoms=false \
    -DgroupId=com.sitture.github \
    -DartifactId=gauge-requests-archetype \
    -Dversion=$2
mvn -f ./quickstart/src/test/resources/projects/quickstart/gauge-requests-archetype/ \
    versions:set-property \
    -Dproperty=$1 \
    -DnewVersion=$2 \
    -DgenerateBackupPoms=false