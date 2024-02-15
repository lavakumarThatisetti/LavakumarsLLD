package com.practiceproblems.shopping;

import java.util.List;
import java.util.stream.Collectors;

public class ProductService {

    ProductRepository productRepository;

    public ProductService(){
        this.productRepository = new ProductRepository();
    }

    public List<Product>  getProducts (List<ProductCategory> productFilters){
        if (productFilters.isEmpty()) return productRepository.getProducts();

        return productRepository.getProducts().stream().filter( product -> productFilters.contains(product.getCategory()))
                .collect(Collectors.toList());
    }
}
