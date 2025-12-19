# 🌤️ Mausam Backend

> **Real-time weather data aggregation and forecasting API built with Spring Boot.**

![Build Status](https://img.shields.io/badge/build-passing-brightgreen) ![Java](https://img.shields.io/badge/Java-17-orange) ![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.0-green)

## 📖 About The Project

Mausam is a robust backend service designed to fetch, process, and serve weather data. Unlike basic weather apps that just pass data through, this backend handles caching, user location management, and historical data analysis.
This project is a part of https://roadmap.sh/projects/weather-api-wrapper-service

**Why this exists:**
* To provide low-latency weather updates.
* To decouple the frontend from direct 3rd party API dependencies.
* To manage user preferences and alert systems efficiently.

## 🛠️ Tech Stack

* **Core:** Java 17, Spring Boot 3.x
* **Database:** PostgreSQL / MySQL (Choose one)
* **ORM:** Spring Data JPA (Hibernate)
* **External APIs:** OpenWeatherMap / WeatherAPI
* **Tools:** Maven/Gradle, Docker, Swagger UI (OpenAPI)
* **Caching:** Redis (Optional)

## 🚀 Getting Started

Follow these steps to set up the project locally. Bawli booch mat banna, steps dhang se follow karna.

### Prerequisites

* **JDK 17** or higher
* **Maven** or **Gradle** installed
* **PostgreSQL/MySQL** running locally or via Docker
* An API Key from [OpenWeatherMap](https://openweathermap.org/api)

### Installation

1.  **Clone the Repo**
    ```bash
    git clone [https://github.com/your-username/mausam-backend.git](https://github.com/your-username/mausam-backend.git)
    cd mausam-backend
    ```

2.  **Configure Environment Variables**
    Rename `application.properties.example` to `application.properties` inside `src/main/resources/` and update the values:
    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/mausam_db
    spring.datasource.username=your_db_user
    spring.datasource.password=your_db_password
    
    # External Weather API Key
    weather.api.key=YOUR_SECRET_API_KEY_HERE
    ```

3.  **Build the Project**
    ```bash
    ./mvnw clean install
    ```

4.  **Run the Application**
    ```bash
    ./mvnw spring-boot:run
    ```

The server will start at `http://localhost:8080`.

## 🔌 API Endpoints

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `GET` | `/api/v1/weather/current` | Get current weather by coordinates |
| `GET` | `/api/v1/weather/{city}` | Get weather by city name |

## 🧪 Testing

Run the test suite to make sure you haven't broken anything.
```bash
./mvnw test
