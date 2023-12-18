package com.whoisashif.hireandgethired.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.whoisashif.hireandgethired.model.Post;
import com.whoisashif.hireandgethired.repository.JobPostRepository;

@RestController
@RequestMapping("/hireandgethired")
public class JobPostController {

	@Autowired
	JobPostRepository jobPostRepository;
	
	@GetMapping("/posts")
	@ResponseStatus(HttpStatus.OK)
	public List<Post> getAllPosts(){
		return jobPostRepository.findAll();
	}
	
	@PostMapping("/post")
	@ResponseStatus(HttpStatus.CREATED)
	public Post createPost(@RequestBody Post post) {
		return jobPostRepository.save(post);
	}
	
}
