# Serenity JUnit 5 Starter Project

This project provides a quick starting point for using Serenity BDD with JUnit 5. It supports both Maven and Gradle, and demonstrates best practices for organizing tests and configuration.

## Project Structure

**Note:** This project has no application code in `src/main/java/`—it is solely for acceptance/functional test automation with Serenity BDD.
- `src/test/java/` - Test code (organised by feature and action)
- `src/test/resources/` - Test resources and configuration, e.g. `serenity.conf`, `junit-platform.properties`
- `serenity.properties` - Serenity configuration

## Getting Started
### 1. Get the Code
- Click [Use This Template](https://github.com/serenity-bdd/serenity-junit-starter/generate) to copy this project to your own GitHub account, **or**
- [Download as zip](https://github.com/serenity-bdd/serenity-junit-starter/archive/master.zip)

### 2. Build and Run the Tests

**With Maven:**
```sh
  ./mvnw clean verify
```

**With Gradle:**
```sh
  ./gradlew test 
```

### 3. View Serenity Reports

After tests run, open the Serenity report at:

- `target/site/serenity/index.html` (for Maven)
- `build/reports/serenity/index.html` (for Gradle)

## Customization
- Update `serenity.properties` and `serenity.conf` for custom configuration
- Add your own application code under `src/main/java/`
- Add new acceptance tests under `src/test/java/`

## More Information
For full Serenity BDD documentation, visit [serenity-bdd.info](https://serenity-bdd.info/).
