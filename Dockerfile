FROM openjdk:latest
EXPOSE 8443
ADD target/brockyouapi.jar brockyouapi.jar
ENTRYPOINT ["java", "-jar", "/brockyouapi.jar"]