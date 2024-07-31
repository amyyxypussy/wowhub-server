FROM eclipse-temurin:17.0.12_7-jre-alpine
LABEL authors="ashen"

ENTRYPOINT ["top", "-b"]