package com.example.api.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topics> topicsList = Arrays.asList(
            new Topics("Spring","Spring Framework","Spring Framework Description"),
            new Topics("Java 8","Java Core","Java Core Description"),
            new Topics("JavaScript","JavaScript","Javascript Description")
    );

    public List<Topics> getAllTopics(){
        return topicsList;
    }
}
