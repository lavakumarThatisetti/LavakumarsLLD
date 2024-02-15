package com.practiceproblems.shopping;

import jdk.internal.org.objectweb.asm.Handle;

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
