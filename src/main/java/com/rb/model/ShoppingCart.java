package com.rb.model;

import java.util.HashMap;

public class ShoppingCart {
    HashMap<Product, Integer> cart = new HashMap<>();

    public HashMap<Product, Integer> getCart() {
        return cart;
    }

    public void setCart(HashMap<Product, Integer> cart) {
        this.cart = cart;
    }

    public void add(Product product, int quantity) {
        if (cart.containsKey(product)) {
            int quantityOld = cart.get(product);
            cart.put(product, quantityOld + quantity);
        } else {
            cart.put(product, quantity);
        }
    }

    public void delete(Product product, int quantity) throws Exception {
        int quantityOld = cart.get(product);
        if (quantityOld < quantity) {
            throw new Exception("Error you are trying to delete more than there are items");
        }

        cart.put(product, quantityOld - quantity);

        if ((quantityOld - quantity) < 1) {
            cart.remove(product);
        }

    }
}
