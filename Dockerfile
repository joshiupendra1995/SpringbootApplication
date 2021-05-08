FROM openjdk:8-jre-alpine

WORKDIR /app

COPY /target/app-0.0.1-SNAPSHOT.jar /app/

ENTRYPOINT ["java", "-jar", "app-0.0.1-SNAPSHOT.jar"]
