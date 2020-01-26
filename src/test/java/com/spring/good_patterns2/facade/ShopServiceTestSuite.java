package com.spring.good_patterns2.facade;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopServiceTestSuite {
    @Autowired
    private ShopService shopService;

    @Test
    public void testShopServiceSubmitOrderWithoutFacade(){
        long orderId = shopService.openOrder(1L);
        System.out.println("Registering new order, ID: " + orderId);
    }
}
