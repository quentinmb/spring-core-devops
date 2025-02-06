FROM maven:3.9.9-amazoncorretto-8

COPY ./ ./

RUN mvn clean package

CMD ["java", "-jar", "target/spring-core-devops-0.0.1-SNAPSHOT.jar"]