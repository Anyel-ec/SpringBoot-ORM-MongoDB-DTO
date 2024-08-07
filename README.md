# Introduce-CRUD-MongoDB-SpringBoot

This is a Spring Boot project demonstrating CRUD operations with MongoDB. The project includes various endpoints to manage student records.

## Table of Contents

- [Installation](#installation)
- [Configuration](#configuration)
- [Project Structure](#project-structure)
- [Endpoints](#endpoints)
- [Usage Examples](#usage-examples)
- [Contribution](#contribution)
- [License](#license)

## Installation

1. Clone the repository:

    ```sh
    git clone https://github.com/Anyel-ec/SpringBoot-ORM-MongoDB-DTO
    cd SpringBoot-ORM-MongoDB-DTO
    ```

2. Build the project:

    ```sh
    mvn clean install
    ```

3. Run the application:

    ```sh
    mvn spring-boot:run
    ```

## Configuration

Ensure you have MongoDB installed and running on your local machine. The default configuration expects MongoDB to be running on `localhost:27017`. You can modify the MongoDB settings in the `application.properties` file if necessary.

### `application.properties` Example

```properties
spring.application.name=Introduce-CRUD-MongoDB

springdoc.api-docs.enabled=true
springdoc.swagger-ui.enabled=true

# Define the path for swagger-ui
springdoc.swagger-ui.path=/swagger-ui.html
spring.data.mongodb.host=localhost 
spring.data.mongodb.port=27017 
spring.data.mongodb.database=introduce_mongo
```

## Project Structure

```
├── src
│   ├── main
│   │   ├── java
│   │   │   └── top.anyel.mongo
│   │   │       ├── collections
│   │   │       │   ├── Student.java
│   │   │       │   └── dto
│   │   │       │       ├── StudentDto.java
│   │   │       │       ├── StudentExistingDto.java
│   │   │       │       └── StudentNewDto.java
│   │   │       ├── controller
│   │   │       │   ├── DocController.java
│   │   │       │   └── StudentController.java
│   │   │       ├── exception
│   │   │       │   └── GlobalExceptionHandlerController.java
│   │   │       ├── repository
│   │   │       │   └── StudentRepository.java
│   │   │       ├── service
│   │   │       │   ├── StudentService.java
│   │   │       │   └── StudentServiceImpl.java
│   │   │       └── IntroduceCrudMongoDbApplication.java
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
│           └── top.anyel.mongo
│               └── IntroduceCrudMongoDbApplicationTests.java
└── pom.xml
```

## Endpoints

### Student Management

- `POST /students/add` - Add a new student
- `POST /students/update` - Update an existing student
- `DELETE /students/{studentId}/delete` - Delete a student by ID
- `GET /students/{studentId}` - Get a student by ID
- `GET /students/all` - Get all students with pagination

### Documentation

- `GET /doc/` - Redirect to Swagger UI

## Usage Examples

### Adding a Student

```json
POST /students/add
{
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com",
  "contactNumber": "1234567890",
  "courseName": "Computer Science"
}
```

### Updating a Student

```json
POST /students/update
{
  "id": "60d5f9b3e1b8f9262c8a5e9c",
  "firstName": "John",
  "lastName": "Smith",
  "email": "john.smith@example.com",
  "contactNumber": "0987654321",
  "courseName": "Software Engineering"
}
```

### Getting a Student by ID

```sh
GET /students/60d5f9b3e1b8f9262c8a5e9c
```

### Deleting a Student

```sh
DELETE /students/60d5f9b3e1b8f9262c8a5e9c/delete
```

### Getting All Students with Pagination

```sh
GET /students/all?page=0&size=30&sort=modified,DESC
```

## Contribution

If you would like to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/new-feature`).
3. Make your changes and commit them (`git commit -am 'Add new feature'`).
4. Push your branch (`git push origin feature/new-feature`).
5. Create a Pull Request.

## License

This project is licensed under the ISC License. See the `LICENSE` file for details.
