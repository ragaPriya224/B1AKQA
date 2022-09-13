package com.training.jpaDemo.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.jpaDemo.model.Topic;

@Repository
public interface TopicRepository extends CrudRepository<Topic, String>{
	
//can extend CRUD or JPA repository too.. For simplicity, used CRUD repo here. 
	//CRUD repository has logic for all common methods
	//if u need, u can create specific custom methods too 
}
