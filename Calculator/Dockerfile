FROM openjdk:8-jdk-alpine
EXPOSE 8086
ADD target/Calculator-1.0.jar calculator.jar
ENTRYPOINT ["java","-jar","calculator.jar"]
