package com.example._2consumingrest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumingRestApplication {

    private static final Logger log = LoggerFactory.getLogger(ConsumingRestApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ConsumingRestApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    // CommandLineRunner is a simple Spring Boot interface with a run method.
    // Spring Boot will automatically call the run method of all beans implementing this interface after the application context has been loaded.
    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            ResponseEntity<User[]> response = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/users", User[].class);
            User[] users = response.getBody();
            if (users != null) {
                for (User user : users) {
                    log.info(user.toString());
                }
            }
        };
    }
}
