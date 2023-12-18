package com.whoisashif.hireandgethired.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.whoisashif.hireandgethired.model.Post;

public interface JobPostRepository extends MongoRepository<Post, String>{
	
}
