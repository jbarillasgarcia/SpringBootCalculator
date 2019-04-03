FROM openjdk:8-jdk-alpine
EXPOSE 8086
ARG JAR_FILE=target/Calculator-1.0.jar
ADD ${JAR_FILE} calculator.jar
ENTRYPOINT ["java","-jar","calculator.jar"]
