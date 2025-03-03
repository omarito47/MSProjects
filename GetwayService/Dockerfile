FROM openjdk:17-jdk-alpine
LABEL authors="Taamallah"
EXPOSE 9090
ADD target/GetwayService-0.0.1.jar GetwayService-0.0.1.jar
ENTRYPOINT ["java","-jar","/GetwayService-0.0.1.jar"]