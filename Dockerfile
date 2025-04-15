FROM tomcat:9.0
RUN rm -rf /usr/local/tomcat/webapps/*
COPY target/students.war /usr/local/tomcat/webapps/students.war
RUN sed -i 's/port="8080"/port="8181"/' /usr/local/tomcat/conf/server.xml
EXPOSE 8181
ENTRYPOINT ["catalina.sh", "run"]
#FROM tomcat:9.0
#RUN rm -rf /usr/local/tomcat/webapps/*
#COPY target/students.war /usr/local/tomcat/webapps/students.war
#EXPOSE 8181
#ENTRYPOINT ["catalina.sh", "run"]
#ENTRYPOINT ["java", "-jar", "students.war"]

