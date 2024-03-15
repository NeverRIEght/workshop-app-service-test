FROM openjdk:17-slim
WORKDIR /app
COPY target/appservice-0.0.1-SNAPSHOT.jar /app/app.jar
CMD ["java", "-jar", "app.jar"]