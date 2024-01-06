FROM tomcat:9.0.52-jre11-openjdk-slim
COPY ./target/travelbooking-ms-v1.1*.jar /usr/local/tomcat/webapps
EXPOSE  9000 8080
USER travelbooking-ms
WORKDIR /usr/local/tomcat/webapps
CMD ["catalina.sh", "run"]