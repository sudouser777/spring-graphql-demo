# Spring GraphQL Demo

A demo project showcasing GraphQL implementation using Spring Boot.

## Prerequisites

- Java 17 or higher
- Gradle 8.13 or higher

## Technologies

- Spring Boot 3.4.4
- Spring GraphQL
- Spring WebFlux
- Project Lombok
- JUnit 5

## Getting Started

### Building the project

```bash
./gradlew build
```

### Running the application

```bash
./gradlew bootRun
```

The application will start on `http://localhost:8080`

## GraphQL API

The GraphQL endpoint is available at: `http://localhost:8080/graphql`

### Sample Query

```graphql
query {
    pets {
        name
        color
    }
}
```

This will return a list of pets with their names and colors.

Example response:
```json
{
  "data": {
    "pets": [
      {
        "name": "cat",
        "color": "black"
      },
      {
        "name": "dog",
        "color": "white"
      }
    ]
  }
}
```

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── org/example/spring/graphql/demo/
│   │       ├── controller/
│   │       │   └── PetsController.java
│   │       ├── model/
│   │       │   └── Pet.java
│   │       └── SpringGraphqlDemoApplication.java
│   └── resources/
│       ├── graphql/
│       │   └── schema.graphqls
│       └── application.properties
```

## Development

The project includes Spring Boot DevTools for development convenience. The application will automatically reload when changes are detected.

## Testing

Run the tests using:

```bash
./gradlew test
```

## License

This project is licensed under the Apache License 2.0 - see the LICENSE file for details.