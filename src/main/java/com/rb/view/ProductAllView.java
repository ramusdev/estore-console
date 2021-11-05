package com.rb.view;

import com.rb.model.Product;
import com.rb.model.ShoppingCart;

import java.util.HashMap;

public class ProductAllView {
    ShoppingCart shoppingCart;

    public ProductAllView(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void show() {
        HashMap<Product, Integer> cart = shoppingCart.getCart();

        // System.out.println(cart.size());

        System.out.println("|------------- My Cart ---------------|");
        System.out.println("| product              id    quantity |");
        System.out.println("|                                     |");
        for (Product product : cart.keySet()) {
            int quantity = cart.get(product);
            System.out.format("| %-20s %-9d %-5d|\n", product.getName(), product.getId(), quantity);
        }
        System.out.println("|-------------------------------------|");

    }
}
