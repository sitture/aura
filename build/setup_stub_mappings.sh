#!/usr/bin/env bash

stub_directory="stub"
stub_api="http://localhost:8080/__admin/mappings/new"

# check if stub Directory exists
if [ ! -d "$stub_directory" ]; then
  echo "$stub_directory directory not found!" ;
  exit 1 ;
fi

mappings=$(find $stub_directory -name "*.json" -type f)

for mapping in $mappings ; do
    echo "$mapping"
    curl -i -X POST --data @$mapping $stub_api
done