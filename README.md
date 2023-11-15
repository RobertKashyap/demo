# Student Management System

## Overview
This project is a Spring Boot 2 application for managing student information. It provides basic CRUD (Create, Read, Update, Delete) operations for handling student records.

## Project Structure
The project is organized into several files and packages:

- **DemoApplication.java**: The main class that runs the Spring Boot application.
- **application.properties**: Configuration file for database settings.
- **Student.java**: Entity class representing a student with JPA annotations.
- **StudentRepository.java**: JPA repository interface for performing CRUD operations on students.
- **StudentService.java**: Service class containing business logic for student operations.
- **StudentController.java**: RESTful API controller for handling HTTP requests related to students.
- **StudentConfig.java**: Configuration class for initializing sample student data on application startup.
- **pom.xml**: Maven project configuration file.

## Database Configuration
The project uses PostgreSQL as the database. The database connection details can be configured in the `application.properties` file.

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/student
spring.datasource.username=postgres
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.properties.hibernate.format_sql=true
```

## Running the Application
To run the application, execute the following command:

```bash
java -jar demo-0.0.1-SNAPSHOT.jar --server.port=8080
```

## API Endpoints
- **GET /api/v1/student**: Retrieve a list of all students.
- **POST /api/v1/student**: Register a new student.
- **DELETE /api/v1/student/{studentId}**: Delete a student by ID.
- **PUT /api/v1/student/{studentId}**: Update a student by ID.

## Sample Data
Sample student data is pre-loaded into the database during application startup, thanks to the `StudentConfig` class.

## Testing
A simple test class, `DemoApplicationTests.java`, is included to ensure that the application context loads successfully.

```java
package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

}
```

## Dependencies
- Spring Boot 2.7.17
- Spring Data JPA
- PostgreSQL
- JUnit Jupiter

## Build and Package
This project is built and packaged using Maven. The `pom.xml` file includes the necessary dependencies and the Spring Boot Maven plugin.

## Conclusion
This Student Management System provides a foundation for managing student records with basic CRUD operations. Feel free to extend and customize the functionality according to your requirements. If you have any questions or suggestions, please feel free to reach out. Happy coding!
