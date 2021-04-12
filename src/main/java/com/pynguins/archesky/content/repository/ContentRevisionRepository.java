package com.pynguins.archesky.content.repository;

import com.pynguins.archesky.content.entities.ContentRevision;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "contentRevision", path = "contentRevision")
public interface ContentRevisionRepository extends PagingAndSortingRepository<ContentRevision, Integer> {
}
