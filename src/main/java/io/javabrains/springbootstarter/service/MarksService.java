package io.javabrains.springbootstarter.service;

import io.javabrains.springbootstarter.dao.Topic;
import io.javabrains.springbootstarter.repo.MarksRepository;
import io.javabrains.springbootstarter.dao.Marks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MarksService {
    @Autowired
    private MarksRepository marksRepository;

    public List<Marks> getAllMarks(){
        List<Marks> marks =new ArrayList<>();
        marksRepository.findAll().forEach(marks::add);
        return marks;
    }
//    add marks
    public Marks addMarks(Marks marks) {
        return marksRepository.save(marks);
    }
//    delete marks based on id
    public void deleteMarks(Integer id) {
        marksRepository.deleteById(id);
    }
    //    update topic based on id
    public void updateMarks(Integer id, Marks marks) {
        marksRepository.save(marks);
    }
}
