package io.javabrains.springbootstarter.controller;

import io.javabrains.springbootstarter.dao.Topic;
import io.javabrains.springbootstarter.service.MarksService;
import io.javabrains.springbootstarter.dao.Marks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MarksController {
    @Autowired
    private MarksService marksService;

    @GetMapping("/marks")
    public List<Marks> getAllMarks() {
        return marksService.getAllMarks();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/marks")
    public Marks addMarks(@RequestBody Marks marks) {
        marksService.addMarks(marks);
        return marks;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/marks/{id}")
    public void deleteMarksById(@PathVariable Integer id) {
        marksService.deleteMarks(id);
    }

}
