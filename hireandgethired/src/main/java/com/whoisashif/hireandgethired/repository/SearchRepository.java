package com.whoisashif.hireandgethired.repository;

import java.util.List;
import com.whoisashif.hireandgethired.model.Post;

public interface SearchRepository {
	
	public List<Post> findByText(String text);
	
}
