FROM openjdk:19-jdk
MAINTAINER Joran Van Belle
COPY /target/SOA-webshop-0.0.1-SNAPSHOT.jar SOA-webshop-0.0.1.jar
ENTRYPOINT ["java","-jar","/SOA-webshop-0.0.1.jar"]