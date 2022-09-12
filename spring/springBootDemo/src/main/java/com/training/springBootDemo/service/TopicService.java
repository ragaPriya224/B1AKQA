package com.training.springBootDemo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.training.springBootDemo.model.Topic;

@Service
public class TopicService {
	
	public List<Topic> getAllTopic(){
		return Arrays.asList(new Topic("1","java"),new Topic("5","spidy"),new Topic("10","avengers"));
	}
	

}
