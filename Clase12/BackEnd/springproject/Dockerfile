FROM maven:3-eclipse-temurin-22-alpine AS builder
WORKDIR /app
ADD pom.xml .
RUN mvn verify clean --fail-never
COPY . .
RUN mvn clean install -DskipTests

FROM alpine/java:22-jdk

EXPOSE 8081
COPY --from=builder /app/target/springproject-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]