# Stage 1: build
FROM maven:3.9.6-eclipse-temurin-17-alpine AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: run
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app

# 🔧 Kopiraj slike iz lokalnog direktorija
COPY public /app/public

COPY --from=build /app/target/JavaApp-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
