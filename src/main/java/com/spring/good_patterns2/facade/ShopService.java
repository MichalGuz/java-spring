package com.spring.good_patterns2.facade;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ShopService {
    private final List<Order> orders = new ArrayList<>();

    @Autowired
    private Authenticator authenticator;

    @Autowired
    private ProductService productService;

    public Long openOrder(Long userId) {
        if (authenticator.isAuthenticated(userId)) {
            Long maxOrder = (long) orders.stream()
                    .mapToInt(o -> o.getOrderId().intValue())
                    .max().orElse(0);
            orders.add(new Order(productService, maxOrder + 1, userId));
            return maxOrder + 1;
        } else {
            return -1L;
        }
    }
}
