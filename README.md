# Boilerplate for REST Microservice in Java
[![Build Status](https://travis-ci.org/javaboilerplates/micro-rest.svg?branch=master)](https://travis-ci.org/javaboilerplates/micro-rest)
[![codecov](https://codecov.io/gh/javaboilerplates/micro-rest/branch/master/graph/badge.svg)](https://codecov.io/gh/javaboilerplates/micro-rest)
[![](https://sonarcloud.io/api/project_badges/measure?project=net.aikaka.javaboilerplates%3Amicro-rest&metric=alert_status)](https://sonarcloud.io/dashboard?id=net.aikaka.javaboilerplates%3Amicro-rest)
[![](https://sonarcloud.io/api/project_badges/measure?project=net.aikaka.javaboilerplates%3Amicro-rest&metric=sqale_rating)](https://sonarcloud.io/dashboard?id=net.aikaka.javaboilerplates%3Amicro-rest)
[![](https://images.microbadger.com/badges/image/javaboilerplates/micro-rest.svg)](https://microbadger.com/images/javaboilerplates/micro-rest)
[![JavaDoc](https://img.shields.io/badge/javadoc-API-blue.svg)](https://javaboilerplates-micro-rest.aikaka.net/apidocs/)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](https://github.com/javaboilerplates/micro-rest/blob/master/LICENSE)
## Features
- REST API and Swagger UI
- Metrics and health check
- CI with Travis
- Docker Build

## Installation
Install dependencies

```
./mvnw clean install

```

## Running the tests

Run all tests

```
./mvnw test
```

## Build

Build package
``` bash
./mvnw package
```

## Docker support 

Build docker image

```
bash script/Dockerbuild.sh
```

Run docker container

```

docker run -d --name micro-rest -p 8000:8000 javaboilerplates/micro-rest
```
## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/micro-rest/tags). 

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details

