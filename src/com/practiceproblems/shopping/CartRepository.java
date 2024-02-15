package com.practiceproblems.shopping;

import java.util.HashMap;

public class CartRepository {
    HashMap<String, Cart> cartData;

    public void addToCart(String customerId, Product product){
        Cart cart = cartData.get(customerId);
        cart.getProducts().add(product);
        cartData.put(customerId, cart);
    }
}
