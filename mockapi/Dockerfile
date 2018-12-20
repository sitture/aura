FROM openjdk:8-jre-alpine

MAINTAINER Haroon Sheikh <haroon.sheikh@outlook.com>

# set working directory
WORKDIR /home/wiremock

ENV WIREMOCK_VERSION 2.18.0

# update openssl && get wiremicj
RUN apk add --update openssl \
  && mkdir -p /var/wiremock/lib/ \
  && wget https://repo1.maven.org/maven2/com/github/tomakehurst/wiremock-standalone/$WIREMOCK_VERSION/wiremock-standalone-$WIREMOCK_VERSION.jar \
    -O /var/wiremock/lib/wiremock-standalone.jar

# export required ports
EXPOSE 8080 8443

COPY entrypoint.sh /
ENTRYPOINT ["/entrypoint.sh"]
CMD ["java", "-cp", "/var/wiremock/lib/*:/var/wiremock/extensions/*", "com.github.tomakehurst.wiremock.standalone.WireMockServerRunner"]