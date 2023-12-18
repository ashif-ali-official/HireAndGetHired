package com.whoisashif.hireandgethired.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.whoisashif.hireandgethired.model.Post;
import com.whoisashif.hireandgethired.repository.JobPostRepository;
import com.whoisashif.hireandgethired.repository.SearchRepository;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobPostController {

	@Autowired
	JobPostRepository jobPostRepository;
	
	@Autowired
	SearchRepository searchRepository;
	
	@GetMapping("/allPosts")
	@ResponseStatus(HttpStatus.OK)
	@CrossOrigin
	public List<Post> getAllPosts(){
		return jobPostRepository.findAll();
	}
	
	@GetMapping("/posts/{text}")
	@ResponseStatus(HttpStatus.OK)
	@CrossOrigin
	public List<Post> search(@PathVariable String text){
		return searchRepository.findByText(text);
	}
	
	@PostMapping("/post")
	@ResponseStatus(HttpStatus.CREATED)
	@CrossOrigin
	public Post createPost(@RequestBody Post post) {
		return jobPostRepository.save(post);
	}
	
}
