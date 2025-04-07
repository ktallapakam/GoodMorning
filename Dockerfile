FROM openjdk:17-jdk-slim
EXPOSE 8585
add target/student-details.jar student-details.jar
ENTRYPOINT ["java", "-jar", "/student-details.jar"]