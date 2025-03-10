FROM openjdk:11 as builder
COPY . .
RUN ./mvnw clean package
FROM adoptopenjdk/openjdk11:jre-11.0.19_7-debianslim as executor
COPY --from=builder /target/app.jar /app.jar
COPY --from=builder dd-java-agent-1.47.0.jar dd-java-agent-1.47.0.jar
