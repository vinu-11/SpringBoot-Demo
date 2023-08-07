package com.example.api.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topics> getAllTopics(){
        return Arrays.asList(
                new Topics("Spring","Spring Framework","Spring Framework Description"),
                new Topics("Java 8","Java Core","Java Core Description"),
                new Topics("JavaScript","JavaScript","Javascript Description")
        );
    }
}
