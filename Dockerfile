FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src
RUN ./mvnw package -DskipTests
CMD ["java", "-jar", "target/fraud-dashboard-0.0.1-SNAPSHOT.jar"]
