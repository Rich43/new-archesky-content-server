package com.pynguins.archesky.content.repository;

import com.pynguins.archesky.content.entities.Content;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ContentRepository extends PagingAndSortingRepository<Content, Integer> {
    Content findByName(String name);
}
