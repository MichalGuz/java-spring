package com.spring.basic.start.social_media;

import org.springframework.stereotype.Component;

@Component
public class SocialMediaUser {
    private String username;

    public SocialMediaUser() {
        this.username = "John Smith";
    }
}
