package io.javabrains.springbootstarter.controller;
import io.javabrains.springbootstarter.dto.TopicDto;
import io.javabrains.springbootstarter.dao.Marks;
import io.javabrains.springbootstarter.dao.Topic;
import io.javabrains.springbootstarter.service.MarksService;
import io.javabrains.springbootstarter.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class  TopicController {
    @Autowired
    private TopicService topicService;

    @Autowired
    MarksService marksService;

    @RequestMapping("/topics/{id}")
    public Topic getTopicById(@PathVariable Integer id){
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public Topic addTopic(@RequestBody TopicDto topicDto){

        //mapper
        Topic topic = new Topic(topicDto.getName(),topicDto.getDescription(),topicDto.getBranch());
        Marks marks = new Marks(topicDto.getGrade(), topicDto.getTot_marks(), topicDto.getCertificateno());
        Marks returnedMarks = marksService.addMarks(marks);
        topic.setMarks(returnedMarks);
        Topic returenedTopic  = topicService.addTopic(topic);
        return returenedTopic;
    }

    @RequestMapping(method = RequestMethod.GET,value = "/topics/find")
    public List<Topic> findByDescription(@RequestParam String desc){
        return topicService.getAllByDescription(desc);
        //return topic;
    }


    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{id}")
    public void deleteTopicById(@PathVariable Integer id){
        topicService.deleteTopic(id);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/topics/{id}")
    public void updateTopicById(@RequestBody Topic topic,@PathVariable Integer id){
        topicService.updateTopic(id,topic);
    }

    @GetMapping("/topics/top")
    public List<Topic> findTop3(@RequestParam String name)
    {
        return topicService.findTop3ByName(name);
    }

    @GetMapping("/topics/filter")
    public List<Topic> findByNameAndBranch(@RequestParam String name, @RequestParam int branch) {
        return topicService.findByNameAndBranch(name, branch);}
}