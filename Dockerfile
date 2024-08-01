FROM eclipse-temurin:17.0.12_7-jre-alpine
LABEL authors="ashen"

COPY target/*.jar /app.jar

ENTRYPOINT ["java","-jar","/app.jar"]