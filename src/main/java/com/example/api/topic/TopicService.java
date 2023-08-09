package com.example.api.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topics> topicsList = Arrays.asList(
            new Topics("spring","Spring Framework","Spring Framework Description"),
            new Topics("java","Java Core","Java Core Description"),
            new Topics("javaScript","JavaScript","Javascript Description")
    );

    public List<Topics> getAllTopics(){
        return topicsList;
    }

    /* Method Service to getTopicsById using Lambda Function Stream, Filter ,FindFirst */
    public Topics getTopicById(String id){
        return topicsList.stream().filter(topics -> topics.getId().equals(id)).findFirst().get();
    }
}
