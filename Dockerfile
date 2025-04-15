FROM tomcat:9.0
RUN rm -rf /usr/local/tomcat/webapps/*
COPY target/students.war /usr/local/tomcat/webapps/students.war
EXPOSE 8181
ENTRYPOINT ["catalina.sh", "run"]
#ENTRYPOINT ["java", "-jar", "students.war"]

