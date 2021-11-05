package com.rb.controllers;

import com.rb.model.*;
import com.rb.view.ProductAllView;

import java.util.concurrent.ExecutionException;

public class ShoppingCartController {
    private ShoppingCart shoppingCart;
    private Shop shop;

    public ShoppingCartController(ShoppingCart shoppingCart, Shop shop) {
        this.shoppingCart = shoppingCart;
        this.shop = shop;
    }

    public void addProductToCart(Product product, int quantity) {
        try {
            shop.delete(product, quantity);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteProduct(Product product, int quantity) {
        try {
            shoppingCart.delete(product, quantity);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void printShoppingCart(ShoppingCart shoppingCart) {
        ProductAllView productAllView = new ProductAllView(shoppingCart);
        productAllView.show();
    }

    public void addProduct(Product product) {
        // shop.transferProductToCart(product);
    }
}
