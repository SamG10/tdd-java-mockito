package com.example.testingjavamockito.shop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTest {
    private Shop shop;

    @BeforeEach
    void init() {
        Shop shop = new Shop();
    }

    @Test
    public void updateProductAfterExpirationDate() {
        Product product = new Product("cereale", "Muesli", 10, 20);

        shop.update(product);

        assertEquals(9, product.getSellIn());
        assertEquals(18, product.getQuality());
    }

}
