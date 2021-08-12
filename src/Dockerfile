FROM maven:3.6.3-openjdk-8 AS build
WORKDIR /app
COPY ./pom.xml /app
COPY . /app/
RUN mvn -B -f /app/pom.xml clean package -DskipTests
RUN ls /app

FROM tomcat:latest
COPY --from=build /app/target/server5pay-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/server5pay.war
RUN sed -i 's/port="8080"/port="8075"/' /usr/local/tomcat/conf/server.xml
EXPOSE 8075
CMD ["catalina.sh", "run"]

