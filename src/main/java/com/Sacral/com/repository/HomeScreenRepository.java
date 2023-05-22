package com.Sacral.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeScreenRepository extends JpaRepository<HomeScreen, Long>{
    HomeScreen findByLogin(String login);
    HomeScreen findByNavigationLinks(String navigationLinks);
    HomeScreen findByUrl(String url);
    HomeScreen findByHomeLink(String homeLink);
}