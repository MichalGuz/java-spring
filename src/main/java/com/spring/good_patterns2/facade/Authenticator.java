package com.spring.good_patterns2.facade;

import java.util.Random;

public class Authenticator {
    public boolean isAuthenticated(Long userId) {
        Random random = new Random();
        return random.nextBoolean();
    }
}
