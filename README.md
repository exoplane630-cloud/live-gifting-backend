# Live Gifting Backend

A Spring Boot backend project that simulates a TikTok LIVE-style gifting system.

## Project Overview

This project provides REST APIs for managing streamers, sending gifts, tracking gift transactions, and viewing platform statistics.

The project was built to practice backend development concepts such as layered architecture, DTOs, exception handling, validation, PostgreSQL integration, and Docker containerization.

## Tech Stack

- Java 21
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Docker
- Maven
- REST API
- Swagger / OpenAPI

## Architecture

```text
Client
  ↓
Controller
  ↓
Service
  ↓
Repository
  ↓
PostgreSQL
```

## Main Features

- Create and view streamers
- Send gifts to streamers
- Track transaction history
- View platform statistics
- DTO-based request and response structure
- Global exception handling
- Request validation
- PostgreSQL database integration
- Dockerized backend application

## API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/streamers` | Get all streamers |
| POST | `/streamers` | Create a streamer |
| GET | `/streamers/{id}` | Get streamer by ID |
| GET | `/streamers/leaderboard` | Get streamer leaderboard |
| GET | `/gifts` | Get all gifts |
| POST | `/gifts/streamers/{streamerId}` | Send gift to streamer |
| GET | `/gifts/streamers/{streamerId}` | Get gifts by streamer |
| GET | `/transactions` | Get all gift transactions |
| GET | `/streamers/{id}/history` | Get transaction history by streamer |
| GET | `/statistics` | Get platform statistics |

## How to Run Locally

1. Start PostgreSQL.
2. Create a database named:

```text
live_gifting_db
```

3. Update `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/live_gifting_db
spring.datasource.username=postgres
spring.datasource.password=your_password
```

4. Run the application:

```bash
./mvnw spring-boot:run
```

## How to Run with Docker

Build the Docker image:

```bash
docker build -t live-gifting-backend .
```

Run the container:

```bash
docker run -p 8080:8080 live-gifting-backend
```

## Future Improvements

- Add JWT authentication
- Add Redis caching
- Add unit and integration tests
- Add CI/CD with GitHub Actions
- Deploy to cloud platform