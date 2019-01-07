#!/usr/bin/env bash

# check to make sure version parameter is provided
if [[ -z "$1" ]]; then
    echo "missing newVersion argument!" ;
    exit 1 ;
fi

echo "Setting newVersion to '$1' ..."
mvn versions:set \
    -DnewVersion=$1 \
    -DgenerateBackupPoms=false \
    -DprocessAllModules=true \
    -DprocessDependencies=true
echo "Setting archetype dependency newVersion to '$1' ..."
mvn versions:set-property \
    -Dproperty=gauge-requests.version \
    -DnewVersion=$1 \
    -DgenerateBackupPoms=false \
    -DgroupId=com.sitture.github \
    -DartifactId=gauge-requests-basic \
    -Dversion=0.3.0
mvn versions:set-property \
    -Dproperty=gauge-requests.version \
    -DnewVersion=$1 \
    -DgenerateBackupPoms=false