package com.example.Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServerApplication {

    @RequestMapping(value = "/available")
    public String available() {
        return "Spring Boot in Action avaiable";
    }

    @RequestMapping(value = "/checked-out")
    public String checkedOut() {
        return "Spring Boot in Action checkout";
    }

    public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}
}
