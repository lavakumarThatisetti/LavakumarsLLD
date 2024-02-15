package com.practiceproblems.shopping;

import java.util.Map;

public class ClothingProduct implements Product{

    String name;
    String price;
    Map<String, Object> information;

    public ClothingProduct(String name, String price, Map<String, Object> information) {
        this.name = name;
        this.price = price;
        this.information = information;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getPrice() {
        return null;
    }

    @Override
    public Map<String, Object> getInformation() {
        return null;
    }

    @Override
    public ProductCategory getCategory() {
        return ProductCategory.CLOTHING;
    }
}
