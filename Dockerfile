# Use an official OpenJDK image
FROM openjdk:17-jdk-slim

# Set working directory
#WORKDIR /app

# Copy your WAR file into the container
COPY target/students.war students.war

# Expose the port your app runs on (typically 8080)
EXPOSE 8181

# Run the WAR file
ENTRYPOINT ["java", "-jar", "students.war"]
