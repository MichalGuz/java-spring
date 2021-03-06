package com.spring.good_patterns2.facade;

import com.spring.good_patterns2.facade.api.ItemDto;
import com.spring.good_patterns2.facade.api.OrderDto;
import com.spring.good_patterns2.facade.api.OrderFacade;
import com.spring.good_patterns2.facade.api.OrderProcessingException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopServiceTestSuite {
    @Autowired
    private ShopService shopService;

    @Autowired
    private OrderFacade orderFacade;

    @Test
    public void testShopServiceSubmitOrderWithoutFacade() {
        long orderId = shopService.openOrder(1L);
        System.out.println("Registering new order, ID: " + orderId);
        if (orderId > 0) {
            shopService.addItem(orderId, 107L, 12);
            System.out.println("Adding item: 107, 12 pcs");
            shopService.addItem(orderId, 35L, 15);
            System.out.println("Adding item: 35, 15 pcs");
            shopService.addItem(orderId, 10L, 5);
            System.out.println("Adding item: 10, 5 pcs");
            shopService.addItem(orderId, 83L, 2);
            System.out.println("Adding item: 83, 2 pcs");
            shopService.addItem(orderId, 19L, 45);
            System.out.println("Adding item: 19, 45 pcs");
            if (shopService.removeItem(orderId, 10L)) {
                System.out.println("Item 10 was deleted");
            } else {
                throw new IllegalArgumentException("Order data is corrupted");
            }

            BigDecimal value = shopService.calculateValue(orderId);
            System.out.println("Order  value is: " + value + "PLN");
            if (shopService.doPayment(orderId)) {
                System.out.println("Payment for order was done.");
            } else {
                System.out.println("Payment was rejected.");
            }
            if (shopService.verifyOrder(orderId)) {
                System.out.println("Order is ready to submit.");
            } else {
                System.out.println("Order cannot be submitted.");
            }
            if (shopService.submitOrder(orderId)) {
                System.out.println("Order submitted - thank you for your purchase.");
            } else {
                System.out.println("Order not submitted - cancelling");
                shopService.cancelOrder(orderId);
                System.out.println("Order is cancelled.");
            }
        } else {
            System.out.println("Access denied. User is not authenticated.");
        }
    }

    @Test
    public void testShopFacade() {
        OrderDto orderDto = new OrderDto();
        orderDto.addItem(new ItemDto(23L, 1));
        orderDto.addItem(new ItemDto(30L, 2));
        orderDto.addItem(new ItemDto(33L, 3));
        orderDto.addItem(new ItemDto(40L, 4));
        try {
            orderFacade.processOrder(orderDto, 1L);
        } catch (OrderProcessingException d) {

        }
    }
}