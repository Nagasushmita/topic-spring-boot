package io.javabrains.springbootstarter.controller;

import io.javabrains.springbootstarter.dao.Topic;
import io.javabrains.springbootstarter.dto.TopicDto;
import io.javabrains.springbootstarter.service.MarksTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MarksTopicController {
    @Autowired
    MarksTopicService marksTopicService;
    @RequestMapping("/filter/grade")
    public List<Topic> findBygrade(@RequestParam Character grade){
        return marksTopicService.findBygrade();
    }
}
