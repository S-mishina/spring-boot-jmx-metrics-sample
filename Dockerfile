FROM eclipse-temurin:25.0.3_9-jdk as builder
COPY . .
RUN ./mvnw clean package
FROM eclipse-temurin:25.0.3_9-jre as executor
COPY --from=builder /target/app.jar /app.jar
COPY --from=builder dd-java-agent-1.47.0.jar dd-java-agent-1.47.0.jar
