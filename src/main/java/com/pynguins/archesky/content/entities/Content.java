package com.pynguins.archesky.content.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.util.Date;

import static javax.persistence.GenerationType.AUTO;

@Entity
public class Content {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Integer id;
    private String name;
    private String displayName;
    private Boolean published;
    private Date created;
    private Date updated;

    public Content(Integer id, String name, String displayName, Boolean published, Date created, Date updated) {
        this.id = id;
        this.name = name;
        this.displayName = displayName;
        this.published = published;
        this.created = created;
        this.updated = updated;
    }

    public Content() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Boolean getPublished() {
        return published;
    }

    public Date getCreated() {
        return created;
    }

    public Date getUpdated() {
        return updated;
    }
}
