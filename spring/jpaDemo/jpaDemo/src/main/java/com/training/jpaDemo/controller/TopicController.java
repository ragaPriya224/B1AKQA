package com.training.jpaDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.jpaDemo.model.Topic;
import com.training.jpaDemo.service.TopicService;

@RestController
@RequestMapping("/api")
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
	@RequestMapping(method = RequestMethod.POST, value = "/topic")
	public void addTopic(@RequestBody Topic topic ) {
		topicService.addTopic(topic);
	}
	@RequestMapping(method = RequestMethod.PUT, value = "/topic/{id}")
	public void updateTopic(@RequestBody Topic topic ,@PathVariable String id ) {
		topicService.updateTopic(topic,id);
	}
	@RequestMapping(method = RequestMethod.DELETE, value = "/topic/{id}")
	public void updateTopic(@PathVariable String id ) {
		topicService.delete(id);
	}
}
