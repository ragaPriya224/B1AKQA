package com.training.springBootDemo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.training.springBootDemo.model.Topic;

@Service
public class TopicService {

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

		topicList.add(topic);
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
