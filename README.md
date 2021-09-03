Client Service
------------------
This is a  **Spring Boot** Application that exposes a REST endpoint which serves **Client details** as a resource.
The capability consists of two deployable components/microservices.

Components
------------------
1) **client-service** - REST API enabled by Spring Boot
2) **h2database** - h2 database enabled by Spring Boot

Build
------------------
* Both components are built using Gradle and can be independently deployed.
* The docker-compose.yml in this parent directory builds and deploys each component as a container.

Deployment
------------------
* client-service API is Stateless and can be scaled horizontally by deploying multiple containers.
* h2database persists data to the file system in order retain data between deployments.

Further Details
------------------
1) Please see **Non-Functional Requirements.md** for additional non-functional requirements/enhancements to the app.
2) Please see component's README for details about individual components.

