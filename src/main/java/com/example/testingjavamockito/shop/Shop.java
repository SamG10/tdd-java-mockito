package com.example.testingjavamockito.shop;

import java.util.List;

public class Shop {
    private List<Product> products;

    public void update(Product product) {
        product.setSellIn(product.getSellIn() - 1);

        switch (product.getType()) {
            case "normal":
                if (product.getSellIn() <= 0) {
                    product.setQuality(Math.max(0, product.getQuality() - 2));
                } else {
                    product.setQuality(Math.max(0, product.getQuality() - 1));
                }
                break;
            case "brie":
                product.setQuality(Math.min(50, product.getQuality() + 1));
                break;
            default:
                throw new UnsupportedOperationException("Not yet implemented");
        }
    }
}
