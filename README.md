# spring-tutorials

## Building a REST-ful Web Service

- create a resource representation class;
- `spring-boot-starter-web` dependency includes Jackson JSON library by default, to automatically marshal instances of resource type into JSON;
- create a resource controller using `@RestController`
- use `@RequestMapping` (or `@GetMapping`,`@PostMapping` etc.) for mapping requests paths to methods; 
- `@RequestParam` binds the value of the query string parameter;
- `@SpringBootApplication` is a convenience annotation that adds the following:
    - `@Configuration` -> tags the class as a source of bean definitions for the application context;
    - `@EnableAutoConfiguration` -> tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.\
      For example, if `spring-webmvc` is on the classpath, this annotation flags the application as a web application and activates key behaviors, such as setting up a `DispatcherServlet`.
    - `@ComponentScan` -> tells Spring to look for other components, configurations, and services, letting it find the controllers.
    
**NOTE**\
MVC controller -> relies on view technology to perform server-side rendering into HTML as a response\
REST-ful web service -> data is written directly to HTTP response as JSON

```
./mvnw spring-boot:run \\ run the application
// OR 
./mvnw clean package \\ build the jar file
java -jar target/name-of-project-0.1.0.jar \\ run the jar file 
```

