package com.example.testingjavamockito.shop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTest {
    private Shop shop;

    @BeforeEach
    void init() {
        shop = new Shop();
    }

    @Test
    public void updateProductAfterExpirationDate() {
        Product product = new Product("normal", "name", 0, 20);

        shop.update(product);

        assertEquals(-1, product.getSellIn());
        assertEquals(18, product.getQuality());
    }

}
