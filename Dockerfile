FROM openjdk:8
EXPOSE 8000
ADD target/mmtspl-cloud-config-server-1.0.0-SNAPSHOT.jar mmtspl-cloud-config-server-1.0.0-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","/mmtspl-cloud-config-server-1.0.0-SNAPSHOT.jar"]