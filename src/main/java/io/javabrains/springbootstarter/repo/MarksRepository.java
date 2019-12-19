package io.javabrains.springbootstarter.repo;

import io.javabrains.springbootstarter.dao.Topic;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import io.javabrains.springbootstarter.dao.Marks;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MarksRepository extends CrudRepository<Marks, Integer> {
//    join topic and marks using query annotation
    @Query(value = "select t from Topic t INNER JOIN t.marks m")
    List<Topic> findByGrade();
}
