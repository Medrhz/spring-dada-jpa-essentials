# Spring Data JPA Demo

This is a simple Spring Boot project demonstrating the essentials of Spring Data JPA with a test example.

## Prerequisites

Before running the project, ensure you have the following installed:

- Java 17 or later
- Maven 3.x
- A PostgreSQL or H2 database (configured in `application.properties`)

## Project Setup

1. Clone or download the project.
2. Navigate to the project root directory.
3. Run the following command to install dependencies:

   ```sh
   mvn clean install
   ```

4. To start the application, use:

   ```sh
   mvn spring-boot:run
   ```

## Project Structure

- `src/main/java` - Contains the main application code.
- `src/main/resources` - Configuration files like `application.properties`.
- `src/test/java` - Test cases for the application.
- `pom.xml` - Project dependencies and build configuration.

## Running Tests

To execute the tests, run:

```sh
mvn test
```

## Dependencies

The project uses the following dependencies (from `pom.xml`):

- Spring Boot Starter Web
- Spring Boot Starter Data JPA
- H2 Database (for testing)
- Spring Boot Starter Test

## License

This project is open-source and can be modified as needed.
