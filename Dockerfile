FROM openjdk:1.8-oracle
VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar","/app.jar", "--spring.profiles.active=docker"]
