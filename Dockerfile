FROM openjdk:8-jdk-alpine
COPY /build/libs/spring-example-1.0-SNAPSHOT.jar spring-example.jar
ENTRYPOINT ["java", "-jar", "spring-example.jar"]