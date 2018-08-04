# Contribution Guidelines

* To map a request, add a json file with request: to api/mappings
```json
{
	  "request": {
	  "method": "GET",
	  "url": "/mock/api"
	  }
}
```
* To map a response, add a json file with response: api/mappings
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
