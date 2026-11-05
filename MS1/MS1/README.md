# MS1 – MockMvc Controller Test

## Requirements
- JDK 17
- Spring Tool Suite 4 (or Eclipse with Spring Tools)
- Maven (STS can use its embedded Maven)

## Project structure
```text
MS1
├── pom.xml
└── src
    ├── main/java/com/example/ms1
    │   ├── Ms1Application.java
    │   ├── controller/MS1Controller.java
    │   └── service/ArithmeticService.java
    └── test/java/com/example/ms1/controller
        └── MS1ControllerTest.java
```

## Import into STS4
1. Extract this ZIP file.
2. In STS4 select File → Import → Maven → Existing Maven Projects.
3. Browse to the extracted `MS1-MockMvc-Project` folder.
4. Select the `pom.xml` project and click Finish.
5. Right-click the project → Maven → Update Project → OK.
6. Right-click `MS1ControllerTest.java` → Run As → JUnit Test.

## Expected test
- Request: `GET /ms1/add?a=5&b=10`
- HTTP status: `200 OK`
- Response body: `MS 1.1 - Additon = 15`

The test uses `@WebMvcTest` to load the MVC slice and `@MockitoBean` to provide a mock
for the service dependency. It does not start the full application server or use a database.

## Optional: run the application
Run `Ms1Application.java` as Spring Boot App, then open:
`http://localhost:8080/ms1/add?a=5&b=10`
