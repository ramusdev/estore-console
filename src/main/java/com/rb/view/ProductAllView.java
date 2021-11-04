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

        System.out.println(cart.size());

        System.out.println("|------------- My Cart ---------------|");
        for (Product product : cart.keySet()) {
            int quantity = cart.get(product);
            // String productString = "| " + product.getName() + " ----------|";
            System.out.format("| %-32s %-3d|\n", product.getName(), quantity);
            // System.out.println(productString);
        }
        System.out.println("|-------------------------------------|");

    }
}
