FROM lwieske/java-8:jdk-8u191-slim

ADD spring-fluentd-0.0.1-SNAPSHOT.jar app.jar
RUN touch /app.jar

EXPOSE 80
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-Dspring.profiles.active=bmt", "-jar","/app.jar"]