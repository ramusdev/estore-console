package com.rb.view;

import com.rb.model.Product;
import com.rb.model.Shop;
import com.rb.model.ShoppingCart;

import java.util.HashMap;

public class ShopView {
    private Shop shop;

    public ShopView(Shop shop) {
        this.shop = shop;
    }

    public void show() {
        HashMap<Product, Integer> cart = shop.getWarehouse();

        // System.out.println(cart.size());

        System.out.println("|-------------- Shop -----------------|");
        System.out.println("| product              id    quantity |");
        System.out.println("|                                     |");
        for (Product product : cart.keySet()) {
            int quantity = cart.get(product);
            System.out.format("| %-20s %-9d %-5d|\n", product.getName(), product.getId(), quantity);
        }
        System.out.println("|-------------------------------------|\n");
    }
}
