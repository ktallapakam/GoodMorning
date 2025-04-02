FROM openjdk:17-jdk-slim
EXPOSE 8585
add target/goodmorning.jar goodmorning.jar
ENTRYPOINT ["java", "-jar", "/goodmorning.jar"]