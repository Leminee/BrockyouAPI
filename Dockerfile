FROM openjdk:latest
EXPOSE 8080
ADD target/brockyouapi.jar brockyouapi.jar
ENTRYPOINT ["java", "-jar","/brockyouapi.jar"]