package com.spring.good_patterns2.facade.api;

import com.spring.good_patterns2.facade.ShopService;
import org.springframework.beans.factory.annotation.Autowired;

public final class OrderFacade {
    @Autowired
    private ShopService shopService;
}
