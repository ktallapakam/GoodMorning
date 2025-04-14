FROM tomcat:9.0
RUN rm -rf /usr/local/tomcat/webapps/*
COPY student-details.war /usr/local/tomcat/webapps/student-details.war
EXPOSE 8181
CMD ["catalina.sh", "run"]
