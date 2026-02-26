FROM eclipse-temurin:17-jdk
EXPOSE 9090
COPY target/*.jar docker-integration.jar
ENTRYPOINT ["java", "-jar", "/docker-integration.jar"]