package org.geethu.springboot.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Marks this as a service, like a service. You can use in multiple classes

@Service
public class TopicService {
    public List<Topic> topics =  new ArrayList<>(Arrays.asList(
                new Topic("spring", "Spring framework", "Basics of Spring"),
                new Topic("js", "Javascript", "Basics of Javascript"),
                new Topic("java", "Java", "Basics of Java")
        ));

    public List<Topic> getAllTopics(){
        return topics;
    }
    public Topic getTopic(String id){
        return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
    }
    public List<Topic> addTopic(Topic topic){
        topics.add(topic);
        return topics;
    }
    public List<Topic> updateTopic(String id, Topic topic){
        for(int i=0; i< topics.size(); i++){
            Topic t = topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i,topic);
                return topics;
            }
        }
        return topics;
    }
    public List<Topic>  deleteTopic(String id){
        topics.removeIf(t->t.getId().equals(id));
        return topics;
    }
}
