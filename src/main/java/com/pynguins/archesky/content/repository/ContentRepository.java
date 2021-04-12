package com.pynguins.archesky.content.repository;

import com.pynguins.archesky.content.entities.Content;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "content", path = "content")
public interface ContentRepository extends CrudRepository<Content, Integer> {
}
