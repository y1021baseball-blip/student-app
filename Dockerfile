FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

RUN chmod +x mvnw && sed -i 's/\r$//' mvnw

RUN ./mvnw clean package -DskipTests

CMD ["java", "-jar", "target/studentapp-0.0.1-SNAPSHOT.jar"]