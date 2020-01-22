package com.spring.good_patterns2.facade;

import java.util.ArrayList;
import java.util.List;

public class ShopService {
    private final List<Order> orders = new ArrayList<>();
}
