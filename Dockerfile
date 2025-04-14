FROM openjdk:17-jdk-slim
EXPOSE 8181
add target/students.jar students.jar
ENTRYPOINT ["java", "-jar", "/students.jar"]