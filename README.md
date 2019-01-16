# aura (WIP)
*__Description of the project.__*

[![CircleCI](https://circleci.com/gh/sitture/aura.svg?style=shield)](https://circleci.com/gh/sitture/aura) [![Maintainability](https://api.codeclimate.com/v1/badges/b5cc25a0c4b0722a6c60/maintainability)](https://codeclimate.com/github/sitture/aura/maintainability) [![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?maxAge=2592000)](https://opensource.org/licenses/MIT) [![contributions welcome](https://img.shields.io/badge/contributions-welcome-brightgreen.svg?style=flat)](../../issues)

[![Gauge Badge](https://gauge.org/Gauge_Badge.svg)](https://gauge.org)

All notable changes to this project are documented in [CHANGELOG.md](CHANGELOG.md).
The format is based on [Keep a Changelog](http://keepachangelog.com/en/1.0.0/)
and adheres to [Semantic Versioning](http://semver.org/spec/v2.0.0.html).

## Standout Features

* TODO

## Usage

* TODO

## Running Locally

### Project Structure

```sh
gauge-requests/
├── .cirlceci
│   ├── config.yml 				# CI Build script for project.
│   ├── update_versions.sh 		# Updates project/dependency versions.
│   └── set_stub_mappings.sh
├── docs
├── quickstart 					# A maven archetype project.
├── reference 					# An examples project using requests module.
├── requests 					# Main gauge-requests module.
├── stubapi
│   └── mappings/ 				# contains all the stubbed mappings.
├── checkstyle.xml
└── pom.xml 					# parent pom to build the modules.
```

### Stub API

The project uses a stub api for testing the specifications. Bring up the container using `docker-compose`:

```bash
docker-compose -f docker-compose-stubapi.yml up -d
```

The stub api will then be accessible at `http://127.0.0.1:8080`

## Running the Tests

## Issues & Contributions

Please [open an issue here](../../issues) on GitHub if you have a problem, suggestion, or other comment.

Pull requests are welcome and encouraged! Any contributions should include new or updated unit tests as necessary to maintain thorough test coverage.

Read [CONTRIBUTING.md](CONTRIBUTING.md) for contribution guidelines.

## Code of Conduct

This project follows the [Contributor Covenant][homepage] [CODE_OF_CONDUCT.md](CODE_OF_CONDUCT.md).

[homepage]: https://www.contributor-covenant.org

## License

This would is licensed under a [MIT](https://mit-license.org/) License.

