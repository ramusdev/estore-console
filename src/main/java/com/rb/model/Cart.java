package com.rb.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class Cart {
    private HashMap<Long, ProductWrapper> cart = new HashMap<>();

    public void addProduct(Product product, int quantity) {
        cart.put(product.getId(), new ProductWrapper(product, quantity));
    }

    public List<ProductWrapper> getProducts() {
        Collection<ProductWrapper> productList = cart.values();
        return new ArrayList<>(productList);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (ProductWrapper productWrapper : cart.values()) {
            Product product = productWrapper.getProduct();
            Integer quantity = productWrapper.getQuantity();

            totalPrice += product.getPrice() * quantity;
        }

        return totalPrice;
    }

    /*
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
    */
}
