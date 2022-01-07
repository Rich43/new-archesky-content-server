package com.archesky.content.repository;

import com.archesky.content.entities.Content;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.security.access.prepost.PreAuthorize;

import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "content", path = "content")
public interface ContentRepository extends PagingAndSortingRepository<Content, Integer> {
    @RestResource(rel = "by-name")
    Optional<Content> findByName(String name);

    @PreAuthorize("hasAuthority('archesky.create_content')")
    @Override
    <S extends Content> S save(S entity);

    @PreAuthorize("hasAuthority('archesky.create_content')")
    @Override
    <S extends Content> Iterable<S> saveAll(Iterable<S> entities);

    @PreAuthorize("hasAuthority('archesky.delete_content')")
    @Override
    void deleteById(Integer integer);

    @PreAuthorize("hasAuthority('archesky.delete_content')")
    @Override
    void delete(Content entity);

    @PreAuthorize("hasAuthority('archesky.delete_content')")
    @Override
    void deleteAllById(Iterable<? extends Integer> integers);

    @PreAuthorize("hasAuthority('archesky.delete_content')")
    @Override
    void deleteAll(Iterable<? extends Content> entities);

    @PreAuthorize("hasAuthority('archesky.delete_content')")
    @Override
    void deleteAll();
}
