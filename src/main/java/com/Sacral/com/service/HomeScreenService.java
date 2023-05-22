package com.Sacral.com.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.Sacral.com.repository.HomeScreenRepository;

@Service
public class HomeScreenService {

    @Autowired
    private HomeScreenRepository homeScreenRepository;

    public HomeScreen findByLogin(String login) {
        return homeScreenRepository.findByLogin(login);
    }

    public HomeScreen findByNavigationLinks(String navigationLinks) {
        return homeScreenRepository.findByNavigationLinks(navigationLinks);
    }

    public HomeScreen findByUrl(String url) {
        return homeScreenRepository.findByUrl(url);
    }

    public HomeScreen findByHomeLink(String homeLink) {
        return homeScreenRepository.findByHomeLink(homeLink);
    }
}