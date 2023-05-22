package com.Sacral.com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HomeScreen {
    @Id
    private Long id;
    private String login;
    private String navigationLinks;
    private String url;
    private String homeLink;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNavigationLinks() {
        return navigationLinks;
    }

    public void setNavigationLinks(String navigationLinks) {
        this.navigationLinks = navigationLinks;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHomeLink() {
        return homeLink;
    }

    public void setHomeLink(String homeLink) {
        this.homeLink = homeLink;
    }
}