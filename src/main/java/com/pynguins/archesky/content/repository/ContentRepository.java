package com.pynguins.archesky.content.repository;

import com.pynguins.archesky.content.entities.Content;
import org.springframework.data.repository.CrudRepository;

public interface ContentRepository extends CrudRepository<Content, Integer> {
}
