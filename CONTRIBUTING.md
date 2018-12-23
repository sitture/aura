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

## How can I contribute?

Contributions can be of many forms:

- Open an issue, or participate in an existing one
- Write some code, and send us a pull request
- Enhance the documentation

If you'd like to contribute, please be mindful of the following guidelines:

- All changes should include suitable Unit/Integration tests and adhere to [Semantic Versioning](http://semver.org/spec/v2.0.0.html)
- A single change per pull request
- Update the documentation if required
- Changes  