package com.archesky.content.repository;

import com.archesky.content.entities.Content;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "content", path = "content")
public interface ContentRepository extends PagingAndSortingRepository<Content, Integer> {
    @RestResource(rel = "by-name")
    Optional<Content> findByName(String name);
}
