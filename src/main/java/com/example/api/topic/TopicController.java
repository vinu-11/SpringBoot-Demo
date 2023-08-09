package com.example.api.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;  // Created Instance of Class Service

    @RequestMapping("/topics")
    public List<Topics> getAllTopics(){
        return topicService.getAllTopics();
    }
}
