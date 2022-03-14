FROM clojure:openjdk-8-lein-slim-buster AS build-jar
WORKDIR /usr/src
COPY . .

RUN lein uberjar

FROM openjdk:8-jre-alpine
WORKDIR /usr/app

COPY --from=build-jar /usr/src/target/release.jar .
CMD ["java", "-jar", "release.jar"]
