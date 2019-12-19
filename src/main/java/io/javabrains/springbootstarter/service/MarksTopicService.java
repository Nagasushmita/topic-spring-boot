package io.javabrains.springbootstarter.service;

import io.javabrains.springbootstarter.dao.Marks;
import io.javabrains.springbootstarter.dao.Topic;
import io.javabrains.springbootstarter.dto.TopicDto;
import io.javabrains.springbootstarter.repo.MarksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarksTopicService {
    @Autowired
    MarksRepository marksRepository;
//    list all marks and topics based on grade
    public List<Topic> findBygrade(){
        return marksRepository.findByGrade();
    }
}
