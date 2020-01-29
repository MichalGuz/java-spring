package com.spring.good_patterns2.facade;

public class Item {
    private final Long productId;
    private final double quantity;
    private final double price;

    public Item(Long productId, double quantity, double price) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public Long getProductId() {
        return productId;
    }

    public double getQuantity() {
        return quantity;
    }

    private double getPrice() {
        return price;
    }
}
