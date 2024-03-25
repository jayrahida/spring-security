FROM amazoncorretto:11-alpine
EXPOSE 8080
ADD target/ .
ENTRYPOINT ["java","-jar","/spring-security-0.0.1-SNAPSHOT.jar"]