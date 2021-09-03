#H2 Database - In-memory/File Based storage
This is a dedicated **H2 Database** Application that serves the Client Microservice API.

Endpoint
------------------
* Listens to client service request on port 9090
* Database is accessed in localhost using jdbc:h2:tcp://localhost:9090/file:./data/clientDB 
* Database is accessed in Docker using jdbc:h2:tcp://h2database:9090/file:./data/clientDB
* H2 Console accessed at - http://localhost:8081/h2-console

Requirements
------------------
* Gradle version 6.9.1
* JDK 11

Libraries
------------------
* Spring Boot
* Spring JPA - Spring-boot-starter-data-jpa
* h2database
* Junit Juniper

Please refer **build.gradle**  for library versions and other dependencies.

Properties
------------------
Please refer application.properties for application variables in the path ../h2database/src/main/resources.

***Note:***
* Database is accessed in localhost using jdbc:h2:tcp://**localhost**:9090/file:./data/clientDB
* Database is accessed in Docker using jdbc:h2:tcp://**h2database**:9090/file:./data/clientDB


Build & Run
------------------
* ```./gradlew build```
* Build Artifact: ../h2database/build/libs/h2database-0.0.1-SNAPSHOT.jar
* ```java -jar h2database-0.0.1-SNAPSHOT.jar```


Docker Build & Run
------------------
* refer Dockerfile for image build instructions
* ``` docker build -t anydbimage/name . ```
* ``` docker image ls ```
* ``` docker run -p 8081:8081 -p 9090:9090 anydbimage/name ```
* ``` docker ps ```

TODO
------------------
* Environment config to be externalised in Docker.
* Improve Exception handling
* Secrets handling using GitHub Encrypted secrets or Docker Secrets or any other Secrets manager