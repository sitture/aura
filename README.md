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

## Building Project

### Structure

```bash
gauge-requests/
├── .cirlceci # CI Build scripts for project.
├── build
│   ├── update_versions.sh # Updates project/dependency versions.
│   ├── set_stub_mappings.sh
│   ├── local.yml # docker-compose file for build full project.
│   └── stub.yml # docker-compose file for stub api.
├── docs
├── quickstart # A maven archetype project.
├── reference # An examples project using requests module.
├── requests # Main gauge-requests module.
├── stub # A wiremock stubbed api for testing.
│   └── mappings/ # contains all the stubbed mappings.
├── checkstyle.xml
└── pom.xml # parent pom to build the modules.
```

### Stub API

The project uses a stub api for testing the specifications. Bring up the container using `docker-compose`:

```bash
docker-compose -f build/stub.yml up -d
```

The stub api will then be accessible at `http://127.0.0.1:8080`

### Running the Tests

The project can be built using any of the standard Maven life-cycles. Jar files can be found in the `target` directory of the module.

```bash
mvn clean # cleans your current environment.
mvn compile # compiles all modules.
mvn test # compiles all source, runs unit tests for all modules.
mvn verify # same as `mvn test` but will also run integration tests from quickstart module.
```

To test a specific module of the project:

```bash
cd requests # change into the module's directory
mvn clean test
```

The __recommended__ option to build the complete project is using docker containers:

```bash
docker-compose -f build/local.yml up # brings up the stub and gauge containers to build the project.
```

### Documentation

The docs are written using [Hugo](https://gohugo.io) and deployed to Github pages from the `docs` directory. Run the following to bring up the docs server using docker:

```bash
docker-compose -f build/docs.yml up -d
```

The docs should then be available at `http://127.0.0.1:1313`.

## Issues & Contributions

Please [open an issue here](../../issues) on GitHub if you have a problem, suggestion, or other comments.

Pull requests are welcome and encouraged! Any contributions should include new or updated unit/integration tests as necessary to maintain thorough test coverage.

Read [CONTRIBUTING.md](CONTRIBUTING.md) for contribution guidelines.

## Code of Conduct

This project follows the Contributor Covenant [Code of Conduct](CODE_OF_CONDUCT.md).

## License

This work is licensed under a [__MIT__](https://mit-license.org/) License.

