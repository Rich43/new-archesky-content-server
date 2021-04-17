package com.pynguins.archesky.content.repository;

import com.pynguins.archesky.content.entities.Content;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(collectionResourceRel = "content", path = "content")
public interface ContentRepository extends PagingAndSortingRepository<Content, Integer> {
    @RestResource(rel = "by-name")
    Iterable<Content> findAllByName(String name);
}
