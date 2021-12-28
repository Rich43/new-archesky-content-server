package com.pynguins.archesky.content.entities;

import javax.naming.OperationNotSupportedException;
import javax.persistence.*;
import java.util.Date;

import static java.lang.Integer.MAX_VALUE;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class ContentRevision {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "content", length = MAX_VALUE)
    private String content;

    @Column(name = "summary")
    private String summary;

    @Column(name = "html", nullable = false)
    private Boolean html;

    @Column(name = "created", nullable = false)
    private Date created;

    @Column(name = "createdBy")
    private String createdBy;

    @ManyToOne
    private Content parent;

    public ContentRevision(Integer id, String content, String summary, Boolean html, Date created, String createdBy,
                           Content parent) {
        this.id = id;
        this.summary = summary;
        this.html = html;
        this.created = created;
        this.createdBy = createdBy;
        this.content = content;
        this.parent = parent;
    }

    @PrePersist
    void preInsert() {
        if (this.created == null) {
            this.created = new Date();
        }
    }

    @PreUpdate
    void preUpdate() throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }

    public ContentRevision() {
    }

    public Integer getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getSummary() {
        return summary;
    }

    public Boolean getHtml() {
        return html;
    }

    public Date getCreated() {
        return created;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Content getParent() {
        return parent;
    }
}
