FROM openjdk:8
EXPOSE 8081
ADD target/webdockerspringboot-0.0.1-SNAPSHOT.war webdockerspringboot-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-jar","/webdockerspringboot-0.0.1-SNAPSHOT.war"]