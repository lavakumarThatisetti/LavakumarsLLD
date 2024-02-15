package com.practiceproblems.shopping;

import java.util.Map;

public class ElectronicProduct implements Product {

    String name;
    String price;
    Map<String, Object> information;

    public ElectronicProduct(String name, String price, Map<String, Object> information) {
        this.name = name;
        this.price = price;
        this.information = information;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPrice() {
        return price;
    }

    @Override
    public Map<String, Object> getInformation() {
        return information;
    }

    @Override
    public ProductCategory getCategory() {
        return ProductCategory.ELECTRONICS;
    }

    // Private
}
