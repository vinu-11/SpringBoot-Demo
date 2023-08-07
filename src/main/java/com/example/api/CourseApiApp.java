package com.example.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

    public static void main(String[] args) {
        /* It contains class which has SpringApplication Annotation and args as a second argument
         Setup default Configuration
         Start Spring Application Context and Tomcat Server */
        SpringApplication.run(CourseApiApp.class, args);


    }
}
