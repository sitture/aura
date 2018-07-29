# aura (WIP)
*__Description of the project.__*

[![CircleCI](https://circleci.com/gh/sitture/aura.svg?style=shield)](https://circleci.com/gh/sitture/aura) [![Maintainability](https://api.codeclimate.com/v1/badges/b5cc25a0c4b0722a6c60/maintainability)](https://codeclimate.com/github/sitture/aura/maintainability) [![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?maxAge=2592000)](https://opensource.org/licenses/MIT)

[![Gauge Badge](https://gauge.org/Gauge_Badge.svg)](https://gauge.org)

This project adheres to [Semantic Versioning](https://semver.org).

# Usage

# Setup

* Install [docker](https://www.docker.com/)
* Clone the repository : `git clone git@github.com:sitture/aura.git`
* `cd aura`
* `docker-compose build`
* `docker-compose up`
* Install the dependencies: `docker exec -it aura composer install`

## How do I browse the app?
```
http://localhost:8080
```

## How do I stop the container?
```
docker-compose down
```

## How do I see if my container is running?
```
docker ps -a
```

## How do I build the image without cache?
```
docker-compose build --no-cache
```

## How do I run the container in the background as a dev (mounts local dir as the app root)
```
docker-compose up -d
```

## How to add mappings?

* To map a request, add a json file with request:
```json
{
	  "request": {
	  "method": "GET",
	  "url": "/mock/api"
	  }
}
```
* To map a response, add a json file with response:
```json
{
	  "response": {
	  	"status": 200,
	  	"jsonBody": {
	    "project": "mock-api"
	    	},
	    "headers": {
	      "Content-Type": "application/json"
	  	  }
	  	 }
}
```

## Issues & Contributions

Please [open an issue here](../../issues) on GitHub if you have a problem, suggestion, or other comment.

Pull requests are welcome and encouraged! Any contributions should include new or updated unit tests as necessary to maintain thorough test coverage.

Read [CONTRIBUTING.md](CONTRIBUTING.md) for guidelines.
