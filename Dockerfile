FROM tomcat :8.0.51-jre11-alpine
MAINTAINER cjwalunj09@gmail.com
COPY ./target/travelbooking-ms .war /usr/local/tomcat/webapps
EXPOSE 8080
USER travelbooking
WORKDIR /usr/local/tomcat/webapps
CMD ['catalina.sh"."run"]