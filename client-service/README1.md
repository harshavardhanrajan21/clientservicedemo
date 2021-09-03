Client Service - RESTFul API
------------------
This is a  **Spring Boot** Application that exposes a REST endpoint which serves **Client details** as a resource.

Endpoint
------------------
* The application expose a RESTFul single endpoint - "/api/v1/client".
* The endpoint supports  the HTTP methods - GET, POST, PUT and DELETE
* The endpoint performs CRUD operations on CLIENT Entity
* Application Port : 8080

Swagger
------------------
The API is enabled with Swagger which can be accessed at - *"localhost:8080/swagger-ui"* to view the API documentation.

Requirements
------------------
* Gradle version 6.9.1
* JDK 11

Libraries
------------------
* Spring Boot
* Spring JPA - Spring-boot-starter-data-jpa
* h2database
* openapi
* Junit Juniper 

Please refer **build.gradle**  for library versions and other dependencies.

Properties 
------------------
Please refer application.properties for application variables in the path ../client-service/src/main/resources.

***Note:*** 
* Database is accessed in localhost using jdbc:h2:tcp://**localhost**:9090/file:./data/clientDB
* Database is accessed in Docker using jdbc:h2:tcp://**h2database**:9090/file:./data/clientDB

Build & Run
------------------
* ```./gradlew build```
* Build Artifact: ../client-service/build/libs/client-service-0.0.1-SNAPSHOT.jar
* ```java -jar client-service-0.0.1-SNAPSHOT.jar```
* access at localhost:8080/api/v1/client

Docker Build & Run
------------------
* refer Dockerfile for image build instructions
* ``` docker build -t anyappimage/name . ```
* ``` docker image ls ```
* ``` docker run -p 8080:8080 anyappimage/name ```
* ``` docker ps ```

TODO
------------------
* Implement Contract First development by implementing OpenAPI 3.0 Generator.
* Use PACT for implementing contract testing.
* Spring Boot Junit fails due to h2 database dependency where the Application context fails to load.
* Environment config to be externalised in Docker.
* Use Redis for caching data
* Improve Exception handling
* Secrets handling using GitHub Encrypted secrets or Docker Secrets or any other Secrets manager