#Non-Functional Requirements

The following are some additional non-functional requirements that may be considered for this Client Service API:-

1) **Performance**-Improve api response times by using caching services deployed as an external service such as Redis.
2) **Resiliency**-Implement application resiliency patterns to handle latency/failures to backend Services. For example, Timeout, Retries, Circuit Breakers, Exponential Back Off, Gracleful Shutdown
3) **Scaling**- Consider moving to more scalable database such as a NoSQL database like Mongo DB in order to serve a growing base of Clients.
4) **Security**- Make the API secure to access by implementing OAuth.
5) **Scaling**- Consider using an API gateway if there are multiple other APIs services operated by the team.
6) **Operations**- Logging: Push log streams to log aggregation and monitoring services such as Prometheus.
7) **Security**- Data encryption: Encrypt the data in transit using SSL and at rest in the file system.
8) **Security**-Use Secrets manager to store sensitive data referred in source code.
9) **Twelve-Factor APP** Improve the overall APP build & deployment by implementing the principles of Twelve Factor App




#The Twelve-Factor APP Implementation
1) **Codebase:** Implemented using Git Hub 
2) **Dependencies:** Application dependencies managed using Gradle
3) **Config:**: Configuration maintained in application.properties and injected in DockerCompose per environment.
4) **Backing Services:** Database is attached as resource using host/container service endpoint.
5) **Build, Release, Run:** To be incorporated in the CICD tool. This code base has two branches namely the 'develop' and 'main'.
6) **Process:** The API is stateless and scalable horizontally 
7) **Port Binding:** The services are bind to host port using Docker.
8) **Concurrency:** The API is stateless and scalable horizontally by deploying multiple containers.
9) **Disposability:** The API and Database are containerized using Docker and the underlying app is based on Spring Boot assembly that can be started and stopped quickly.
10) **Dev/Prod Parity:** The same code base can be deployed without change to different environments. The environment config in Dockers can be used to alter application config variables.
11) **Log Streams:** The applications requires to be integrated with Log Aggregator in order to push logs as streams in an isolated process.
12) **Admin Process:** TBD