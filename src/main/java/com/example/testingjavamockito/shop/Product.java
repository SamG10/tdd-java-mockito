package com.example.testingjavamockito.shop;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private String type;
    private String name;
    private int sellIn;
    private int quality;
}
