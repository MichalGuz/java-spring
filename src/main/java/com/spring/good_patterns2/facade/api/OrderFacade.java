package com.spring.good_patterns2.facade.api;

import com.spring.good_patterns2.facade.ShopService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.logging.Logger;

public final class OrderFacade {
    @Autowired
    private ShopService shopService;
    private static final Logger LOGGER = LoggerFactory(OrderFacade.class);
}
