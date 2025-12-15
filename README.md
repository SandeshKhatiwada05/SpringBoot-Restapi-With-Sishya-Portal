# Spring Boot REST API - Sishya Portal

A Spring Boot REST API project demonstrating clean MVC architecture and three-layered design.  Built by following a structured tutorial to learn REST API development from fundamentals through full CRUD operations with validation.


---

## What This Project Covers

### Core Concepts

- What REST APIs are and how they function
- MVC (Model-View-Controller) architecture
- Spring MVC framework basics
- Internal working of web servers
- REST API request-response lifecycle

### Architecture

Three-layered architecture pattern:

- **Controller Layer** - Handles HTTP requests and responses
- **Service Layer** - Contains business logic
- **Repository Layer** - Manages database access


### REST API Operations

- **GET** - Retrieve resources using Repository interface
- **POST** - Create new resources
- **PUT** - Full resource updates
- **PATCH** - Partial resource updates
- **DELETE** - Remove resources
- Path variables in controllers
- Request validation with annotations

### Tools & Libraries

- ModelMapper for entity-DTO conversion
- Postman for API testing

---

## Tech Stack

- Java 17+
- Spring Boot
- Spring MVC
- Spring Data JPA
- MySQL
- Hibernate ORM
- ModelMapper
- Maven

---

## Project Structure

```
src/main/java
└── com.example/
    ├── controller/    # HTTP request handlers
    ├── service/       # Business logic layer
    ├── repository/    # Database access layer
    ├── entity/        # JPA entity classes
    ├── dto/           # Data Transfer Objects
    ├── config/        # Configuration classes
    └── Application.java
```

---

## How to Run

### Prerequisites

- Java 17 or higher
- Maven 3.6+
- MySql
- Postman (optional, for testing)

### Setup Steps

**1. Clone the repository**

```bash
git clone https://github.com/SandeshKhatiwada05/SpringBoot-Restapi-With-Sishya-Portal.git
cd SpringBoot-Restapi-With-Sishya-Portal
```


**4. Run the application**

```bash
mvn spring-boot:run
```

Application runs on `http://localhost:8080` by default.

**5. Test APIs**

Used Postman to interact with the endpoints. 


## Learning Outcomes

After working through this project, you will understand:

- How REST APIs operate internally within Spring Boot
- How MVC and three-layered architecture are implemented
- How Spring Boot connects to databases using JPA
- How to design maintainable and testable APIs
- Proper separation of concerns across layers
- Entity-DTO mapping patterns
- Input validation strategies

---

## Key Design Patterns

### Three-Layered Architecture

Separates concerns into distinct layers with single responsibilities:

1. **Controller** — Receives HTTP requests, validates input, returns responses
2. **Service** — Implements business rules and logic
3. **Repository** — Abstracts database operations

### DTO Pattern

Data Transfer Objects decouple internal entity structure from API contracts, preventing direct exposure of database schema.

### Repository Pattern

Spring Data JPA repositories abstract database queries, reducing boilerplate and improving testability.
