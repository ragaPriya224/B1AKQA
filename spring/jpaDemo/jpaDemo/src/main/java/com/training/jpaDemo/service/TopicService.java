package com.training.jpaDemo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.jpaDemo.model.Topic;
import com.training.jpaDemo.repository.TopicRepository;

@Service
public class TopicService {

	@Autowired
	TopicRepository topicRepository;
	
	public List<Topic>topicList =new ArrayList(Arrays.asList(new Topic("1","java"),
			new Topic("5","spidy"),new Topic("10","avengers")));

	public List<Topic> getAllTopic(){
		return topicList;
	}

	public Topic getTopic(String id) {
		// TODO Auto-generated method stub
		return topicList.stream().filter(data -> data.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {

//		topicList.add(topic);
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic, String id) {

		for(int i = 0; i<topicList.size();i++) {
			if(topicList.get(i).getId().equals(id)) {
				topicList.set(i, topic);
			}
		}


	}

	public void delete(String id) {
		topicList.removeIf(data -> data.getId().equals(id));
	}


}
