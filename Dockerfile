# Stage 1: build
FROM maven:3.9.6-eclipse-temurin-17-alpine AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: run
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app

RUN apk add --no-cache bash curl

COPY wait-for-it.sh .
COPY --from=build /app/target/JavaApp-0.0.1-SNAPSHOT.jar app.jar

RUN chmod +x wait-for-it.sh

EXPOSE 8080
ENTRYPOINT ["bash", "wait-for-it.sh", "mysql:3306", "--", "java", "-jar", "app.jar"]
