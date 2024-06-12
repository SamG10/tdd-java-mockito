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

    @Test
    public void increaseAgedBrieQuality() {
        Product brie = new Product("brie", "Aged Brie", 10, 20);
        shop.update(brie);

        assertEquals(9, brie.getSellIn());
        assertEquals(21, brie.getQuality());
    }

}
