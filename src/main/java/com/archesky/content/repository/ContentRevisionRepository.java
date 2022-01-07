package com.archesky.content.repository;

import com.archesky.content.entities.ContentRevision;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;

@RepositoryRestResource(collectionResourceRel = "contentRevision", path = "contentRevision")
public interface ContentRevisionRepository extends PagingAndSortingRepository<ContentRevision, Integer> {
    @PreAuthorize("hasAuthority('archesky.create_content_revision')")
    @Override
    <S extends ContentRevision> S save(S entity);

    @PreAuthorize("hasAuthority('archesky.create_content_revision')")
    @Override
    <S extends ContentRevision> Iterable<S> saveAll(Iterable<S> entities);

    @PreAuthorize("hasAuthority('archesky.delete_content_revision')")
    @Override
    void deleteById(Integer integer);

    @PreAuthorize("hasAuthority('archesky.delete_content_revision')")
    @Override
    void delete(ContentRevision entity);

    @PreAuthorize("hasAuthority('archesky.delete_content_revision')")
    @Override
    void deleteAllById(Iterable<? extends Integer> integers);

    @PreAuthorize("hasAuthority('archesky.delete_content_revision')")
    @Override
    void deleteAll(Iterable<? extends ContentRevision> entities);

    @PreAuthorize("hasAuthority('archesky.delete_content_revision')")
    @Override
    void deleteAll();
}
