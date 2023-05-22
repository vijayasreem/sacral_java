package com.Sacral.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Sacral.com.service.HomeScreenService;
import com.Sacral.com.model.HomeScreen;

@RestController
@RequestMapping("/home")
public class HomeScreenController {

    @Autowired
    private HomeScreenService homeScreenService;

    @GetMapping("/login/{login}")
    public HomeScreen findByLogin(@PathVariable String login) {
        return homeScreenService.findByLogin(login);
    }

    @GetMapping("/navigationLinks/{navigationLinks}")
    public HomeScreen findByNavigationLinks(@PathVariable String navigationLinks) {
        return homeScreenService.findByNavigationLinks(navigationLinks);
    }

    @GetMapping("/url/{url}")
    public HomeScreen findByUrl(@PathVariable String url) {
        return homeScreenService.findByUrl(url);
    }

    @GetMapping("/homeLink/{homeLink}")
    public HomeScreen findByHomeLink(@PathVariable String homeLink) {
        return homeScreenService.findByHomeLink(homeLink);
    }

}