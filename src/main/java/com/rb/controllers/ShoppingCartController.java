package com.rb.controllers;

import com.rb.model.Bread;
import com.rb.model.Milk;
import com.rb.model.Product;
import com.rb.model.ShoppingCart;
import com.rb.view.ProductAllView;

import java.util.concurrent.ExecutionException;

public class ShoppingCartController {
    private ShoppingCart shoppingCart;

    public ShoppingCartController(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void addProductToCart(Product product, int quantity) {
        shoppingCart.add(product, quantity);
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
}
