# Live Gifting Backend

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.x-brightgreen)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-17-blue)
![Docker](https://img.shields.io/badge/Docker-Enabled-2496ED)

A backend REST API project built with **Spring Boot**, **PostgreSQL**, and **Docker**, inspired by the virtual gifting workflow used in live streaming platforms.

The project demonstrates backend engineering concepts including layered architecture, REST API development, data persistence with Spring Data JPA, DTO-based communication, exception handling, API documentation, and containerized deployment.

---

# Project Overview

This application simulates a live gifting platform where users can:

* Create and manage streamers
* Send virtual gifts
* Track gift transaction history
* View streamer leaderboards
* Retrieve platform-wide statistics

The project was developed to strengthen practical backend engineering skills commonly used in production systems.

---

# Tech Stack

* Java 21
* Spring Boot
* Spring Data JPA
* PostgreSQL
* Docker
* Maven
* REST API
* Swagger / OpenAPI

---

# Architecture

```
                +------------------+
                |      Client      |
                +------------------+
                          |
                          v
                +------------------+
                |  REST Controller |
                +------------------+
                          |
                          v
                +------------------+
                | Business Service |
                +------------------+
                          |
                          v
                +------------------+
                | Spring Data JPA  |
                |    Repository    |
                +------------------+
                          |
                          v
                +------------------+
                |   PostgreSQL DB  |
                +------------------+
```

---

# Project Structure

```
src/main/java
├── controller
├── service
├── repository
├── entity
├── dto
├── exception
└── LiveGiftingBackendApplication
```

---

# Key Features

* RESTful API design using Spring Boot
* Layered architecture (Controller → Service → Repository)
* Streamer management APIs
* Virtual gift processing
* Gift transaction history
* Leaderboard retrieval
* Platform statistics aggregation
* DTO-based request and response models
* Global exception handling
* PostgreSQL integration via Spring Data JPA
* Dockerized deployment
* Interactive API documentation with Swagger UI

---

# API Endpoints

| Method | Endpoint                        | Description                           |
| ------ | ------------------------------- | ------------------------------------- |
| GET    | `/streamers`                    | Retrieve all streamers                |
| POST   | `/streamers`                    | Create a new streamer                 |
| GET    | `/streamers/{id}`               | Retrieve streamer details             |
| GET    | `/streamers/leaderboard`        | Retrieve leaderboard                  |
| GET    | `/gifts`                        | Retrieve available gifts              |
| POST   | `/gifts/streamers/{streamerId}` | Send a gift                           |
| GET    | `/gifts/streamers/{streamerId}` | Retrieve gifts received by a streamer |
| GET    | `/transactions`                 | Retrieve all gift transactions        |
| GET    | `/streamers/{id}/history`       | Retrieve transaction history          |
| GET    | `/statistics`                   | Retrieve platform statistics          |

---

# API Documentation

Interactive API documentation is available through Swagger UI after starting the application.

```
http://localhost:8080/swagger-ui/index.html
```

![Swagger UI](docs/swagger.png)

---

# Running the Project

## Prerequisites

* Java 21
* Maven
* PostgreSQL
* Docker (optional)

## Local Setup

Create a PostgreSQL database:

```
live_gifting_db
```

Update `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/live_gifting_db
spring.datasource.username=postgres
spring.datasource.password=YOUR_PASSWORD
```

Run the application:

```bash
./mvnw spring-boot:run
```

---

# Docker

Build the image:

```bash
docker build -t live-gifting-backend .
```

Run the container:

```bash
docker run -p 8080:8080 live-gifting-backend
```

The application will be available at:

```
http://localhost:8080
```

---

# Skills Demonstrated

* Java backend development
* Spring Boot framework
* REST API design
* Layered architecture
* Spring Data JPA
* PostgreSQL integration
* DTO pattern
* Exception handling
* Docker containerization
* API documentation with Swagger
* Git and GitHub workflow

---

# Future Improvements

* JWT authentication and authorization
* Redis caching
* Unit and integration testing
* GitHub Actions CI/CD pipeline
* Cloud deployment (AWS / Azure / GCP)
* Pagination support
* Rate limiting
* Monitoring and logging
* API versioning

---

# Learning Outcomes

This project strengthened practical experience in:

* Designing scalable REST APIs
* Structuring maintainable backend applications
* Working with relational databases using Spring Data JPA
* Implementing service-oriented architecture
* Managing persistent data with PostgreSQL
* Containerizing applications using Docker
* Documenting APIs with Swagger/OpenAPI
* Using Git and GitHub for version control

---

# Author

**Seoyeon Lee**

Personal backend engineering project created as part of software engineering internship portfolio preparation.
