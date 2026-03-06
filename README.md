# Execution Restrictions

This project has the following requirements and restrictions for successful execution:

- **Java Version:** Requires Java 21 or newer. Older Java versions will not work due to use of records and modern
  language features.
- **Maven Version:** Maven 3.8+ is recommended for building the project.
- **Spring Boot:** Both `spring-boot-starter-web` and `spring-boot-starter-webflux` must be present in the dependencies.
  Removing either will cause context initialization errors.
- **OpenAPI:** Both `springdoc-openapi-starter-webmvc-ui` and `springdoc-openapi-starter-webflux-api` are required for
  full OpenAPI support. Removing either may break API documentation endpoints.
- **Configuration:** The `src/main/resources/application.yml` file must exist, even if empty, for Spring Boot to start
  cleanly.
- **Port Usage:** The application starts on port 9090 by default. Ensure this port is available and not blocked by
  firewalls or other services. The port can also be change via the application.yml
- **Build Artifacts:** The JAR file is named `nullable-checker-0.0.1-SNAPSHOT.jar` and can be run with `java -jar`.
- **Lombok:** Lombok is used for code generation. Ensure your IDE and build tools support Lombok annotations.

## Known Issues

- Removing required starters or OpenAPI dependencies will cause startup failures.
- Using an unsupported Java version will cause compilation or runtime errors.
- Port conflicts will prevent the application from starting.

## Quick Start

1. Install Java 21+ and Maven 3.8+.
2. Build with `mvn clean install`.
3. Run via IDE (Spring Boot project) or via with `java -jar target/nullable-checker-0.0.1-SNAPSHOT.jar`.


