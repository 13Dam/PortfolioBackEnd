FROM amazoncorretto:11-alpine-jdk
MAINTAINER mgb
COPY target/mgb-0.0.1-SNAPSHOT.jar fuentes-app.jar
ENTRYPOINT ["java","-jar","/fuentes-app.jar"]
