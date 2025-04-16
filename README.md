# Contacts API (Spring Boot)

A RESTful API for managing contacts using Spring Boot, Spring Data JPA, and H2 database.

## Features

- Create, read, update, delete (CRUD) operations for contacts
- Contact fields: `UUID`, `name`, `phoneNumber`, `email`, `tags`
- H2 in-memory database (with file-based option for persistence)
- RESTful endpoints with clear response structure
- Postman-ready

## Technologies Used

- Java 21
- Spring Boot 3
- Spring Data JPA
- H2 Database (dev)
- Maven

## Endpoints

| Method | Endpoint         | Description               |
|--------|------------------|---------------------------|
| GET    | `/contacts`      | Get all contacts          |
| GET    | `/contacts/{id}` | Get a contact by ID       |
| POST   | `/contacts`      | Create a new contact      |
| PUT    | `/contacts/{id}` | Update a contact          |
| DELETE | `/contacts/{id}` | Delete a contact by ID    |

## Run Locally

1. Clone the repo:
```
git clone https://github.com/your-username/java-spring-contacts-api.git
cd java-spring-contacts-api
```

2. Build and run with IntelliJ or:
```
mvn clean install
mvn spring-boot:run
```

3. Visit:
```
http://localhost:8080/contacts
```

## H2 Database Console

- URL: `http://localhost:8080/h2-console`
- JDBC: `jdbc:h2:file:./data/contactsdb`
- Username: `sa`
- Password: *(leave blank)*
