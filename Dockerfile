FROM eclipse-temurin:17-jdk
LABEL version="1.0"
WORKDIR /app
COPY ./build/libs/gruppuppgift-3-1.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

