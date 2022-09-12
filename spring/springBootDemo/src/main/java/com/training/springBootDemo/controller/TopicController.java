package com.training.springBootDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.springBootDemo.model.Topic;
import com.training.springBootDemo.service.TopicService;

@RestController
public class TopicController {
	
	
	@Autowired
	TopicService topicService;
	
	@RequestMapping("/topic")
	public List<Topic> getAllTopic(){
//		return Arrays.asList(new Topic("1","java"),new Topic("5","spidy"),new Topic("10","avengers"));
		return topicService.getAllTopic();
	}
	
	
	@RequestMapping("/topic/{id}")
	public Topic getTopic(@PathVariable String  id) {
		return topicService.getTopic(id);
		
	}

}
