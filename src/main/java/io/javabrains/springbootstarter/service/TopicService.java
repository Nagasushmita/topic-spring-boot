package io.javabrains.springbootstarter.service;
import io.javabrains.springbootstarter.repo.TopicRepository;
import io.javabrains.springbootstarter.dao.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;
//    get topic
    public Topic getTopic(Integer id){
       return topicRepository.findById(id).get();
    }
//    add topic
    public Topic addTopic(Topic topic) {
        return topicRepository.save(topic);
    }
//    delete topic based on id
    public void deleteTopic(Integer id) {
    topicRepository.deleteById(id);
    }
//    update topic based on id
    public void updateTopic(Integer id, Topic topic) {
     topicRepository.save(topic);
    }
//    get all based on description
    public List<Topic> getAllByDescription(String desc) {
        List<Topic> topics;
        topics = topicRepository.findByDescription(desc);
        return topics;
    }
//    find top 3 based on name
    public List<Topic> findTop3ByName(String name){
        return topicRepository.findTop3ByName(name);
    }
//    get topic based on name and branch
    public List<Topic> findByNameAndBranch(String name, int branch){
        return topicRepository.findByNameAndBranch(name, branch);
    }
}



