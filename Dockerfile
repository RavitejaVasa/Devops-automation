#define base docker image
FROM openjdk:17
LABEL maintainer="javaguides.net"
ADD target/springbootDocker.jar springDockerDemo.jar
ENTRYPOINT ["java", "-jar", "springDockerDemo.jar"]