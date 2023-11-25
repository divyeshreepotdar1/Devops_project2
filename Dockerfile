FROM --platform=linux/amd64 openjdk:latest
EXPOSE 8080 
# COPY env.properties env.properties
COPY target/*.jar test.jar
ENTRYPOINT ["java","-jar","/test.jar"]
