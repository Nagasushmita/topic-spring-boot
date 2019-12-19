package io.javabrains.springbootstarter.repo;

import io.javabrains.springbootstarter.dao.Topic;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TopicRepository extends CrudRepository<Topic,Integer>{

//    list all the topics based on description
    List<Topic> findByDescription(String description);
//    list  top 3 topics
    List<Topic> findTop3ByName(String name);
//    list all the topics based on name and branch
    @Query(value = "select * from topic t where t.name = :name AND t.branch = :branch", nativeQuery = true)
    List<Topic> findByNameAndBranch(@Param("name") String name, @Param("branch") int branch);
}
