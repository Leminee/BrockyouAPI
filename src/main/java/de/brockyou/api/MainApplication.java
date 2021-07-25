package de.brockyou.api;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);


    }

    public @Bean
    MongoClient mongoClient() {
        return MongoClients.create("mongodb://localhost:27017");
    }
}
