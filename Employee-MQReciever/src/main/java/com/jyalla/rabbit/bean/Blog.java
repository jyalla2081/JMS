package com.jyalla.rabbit.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

public class Blog implements Serializable {

    private static final long serialVersionUID = 1L;

    private UUID id;
    private String title;
    private String description;
    private String url;
    private User authorId;
    private Date createdOn;
    private String createdBy;
    private Date updatedOn;
    private String updatedBy;

    public Blog(UUID id, String title, String description, String url, User authorId, Date createdOn, String createdBy) {
        super();
        this.id = id;
        this.title = title;
        this.description = description;
        this.url = url;
        this.authorId = authorId;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
    }

    public Blog() {
        super();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public User getAuthorId() {
        return authorId;
    }

    public void setAuthorId(User authorId) {
        this.authorId = authorId;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public String toString() {
        return "Blog [id=" + id + ", title=" + title + ", description=" + description + ", url=" + url + ", createdOn=" + createdOn + ", createdBy=" + createdBy + ", updatedOn="
                + updatedOn + ", updatedBy=" + updatedBy + "]";
    }



}
