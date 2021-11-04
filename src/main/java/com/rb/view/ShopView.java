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

        System.out.println(cart.size());

        System.out.println("|-------------- Shop -----------------|");
        for (Product product : cart.keySet()) {
            int quantity = cart.get(product);
            System.out.format("| %-32s %-3d|\n", product.getName(), quantity);
        }
        System.out.println("|-------------------------------------|");
    }
}
