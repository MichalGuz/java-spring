package com.spring.basic.start.social_media;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SocialMediaTestSuite {
    @Test
    public void testGetUserName(){
        // given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.basic.start.social_media");
        SocialMediaUser user = context.getBean(SocialMediaUser.class);

        // when
        String name = user.getUsername();

        // then
        Assert.assertEquals("John Smith", name);
    }
}
