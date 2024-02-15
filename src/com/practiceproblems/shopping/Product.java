package com.practiceproblems.shopping;

import java.util.Map;

public interface Product {

    String getName();
    String getPrice();
    Map<String, Object> getInformation();
    ProductCategory getCategory();
}
