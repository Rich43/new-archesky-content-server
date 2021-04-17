package com.pynguins.archesky.content.entities;

import javax.persistence.*;

import java.util.Date;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="content")
public class Content {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "name", unique = true, nullable = false)
    private String name;
    @Column(name = "display_name", nullable = false)
    private String displayName;
    @Column(name = "published", nullable = false)
    private Boolean published;
    @Column(name = "created", nullable = false)
    private Date created;
    @Column(name = "updated")
    private Date updated;
    @OneToMany
    private List<ContentRevision> contentRevisions;

    @PrePersist
    void preInsert() {
        if (this.created == null) {
            this.created = new Date();
        }
    }

    @PreUpdate
    void preUpdate() {
        this.updated = new Date();
    }

    public Content(Integer id, String name, String displayName, Boolean published, Date created, Date updated, List<ContentRevision> contentRevisions) {
        this.id = id;
        this.name = name;
        this.displayName = displayName;
        this.published = published;
        this.created = created;
        this.updated = updated;
        this.contentRevisions = contentRevisions;
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

    public List<ContentRevision> getContentRevisions() {
        return contentRevisions;
    }
}
