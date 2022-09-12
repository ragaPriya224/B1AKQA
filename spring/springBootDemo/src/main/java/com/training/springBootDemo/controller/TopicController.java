package com.training.springBootDemo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.springBootDemo.model.Topic;

@RestController
public class TopicController {
	
	@RequestMapping("/topic")
	public List<Topic> getAllTopic(){
		return Arrays.asList(new Topic("1","java"),new Topic("5","spidy"),new Topic("10","avengers"));
	}

}
