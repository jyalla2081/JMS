package com.jyalla.rabbit.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private UUID id;
    private String username;
    private String email;
    private String phoneNo;
    private String profilePic;
    private boolean status;
    private String createdBy;
    private Date createdOn;
    private String updatedBy;
    private Date updatedOn;

    private List<Blog> articles;

    public User(UUID id, String username, String email, String phoneNo, String profilePic, boolean status, String createdBy, Date createdOn, String updatedBy, Date updatedOn,
            List<Blog> articles) {
        super();
        this.id = id;
        this.username = username;
        this.email = email;
        this.phoneNo = phoneNo;
        this.profilePic = profilePic;
        this.status = status;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.updatedBy = updatedBy;
        this.updatedOn = updatedOn;
        this.articles = articles;
    }

    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public List<Blog> getArticles() {
        return articles;
    }

    public void setArticles(List<Blog> articles) {
        this.articles = articles;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", email=" + email + ", phoneNo=" + phoneNo + ", profilePic=" + profilePic + ", status=" + status + ", createdBy="
                + createdBy + ", createdOn=" + createdOn + ", updatedBy=" + updatedBy + ", updatedOn=" + updatedOn + ", articles=" + articles + "]";
    }

}


