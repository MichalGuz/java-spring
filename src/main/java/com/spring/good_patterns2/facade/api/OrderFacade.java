package com.spring.good_patterns2.facade.api;

import com.spring.good_patterns2.facade.ShopService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public final class OrderFacade {
    @Autowired
    private ShopService shopService;
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderFacade.class);
}
