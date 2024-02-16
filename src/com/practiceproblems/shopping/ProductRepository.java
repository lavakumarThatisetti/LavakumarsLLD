package com.practiceproblems.shopping;

import java.util.List;

public class ProductRepository {

    List<Product> products;

    public List<Product>  getProducts () {
        return products;
    }

    public void   addProduct (Product product) {
        products.add(product);
    }
}
