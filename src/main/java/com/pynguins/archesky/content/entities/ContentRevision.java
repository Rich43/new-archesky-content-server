package com.pynguins.archesky.content.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

import static javax.persistence.GenerationType.AUTO;

@Entity
public class ContentRevision {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Integer id;
    private String content;
    private String summary;
    private Boolean html;
    private Date created;
    private Date updated;

    public ContentRevision(Integer id, String content, String summary, Boolean html, Date created, Date updated) {
        this.id = id;
        this.content = content;
        this.summary = summary;
        this.html = html;
        this.created = created;
        this.updated = updated;
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

    public Date getUpdated() {
        return updated;
    }
}
