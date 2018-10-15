FROM tomcat:8 
RUN rm -rf /usr/local/tomcat/webapps/
COPY ./src/pipeline/target/*.war /usr/local/tomcat/webapps/ROOT.war
