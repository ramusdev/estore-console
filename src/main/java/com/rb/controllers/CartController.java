package com.rb.controllers;

import com.rb.database.Database;
import com.rb.exceptions.NoProductFoundException;
import com.rb.model.*;
import com.rb.view.CartView;

import java.util.List;

public class CartController {
    private Cart cart;

    public CartController(Cart cart) {
        this.cart = cart;
    }

    public void addProduct(long id, int quantity) {
        Database database = Database.getInstance();

        ProductWrapper productWrapper = database.getProduct(id);
        Product product = productWrapper.getProduct();

        cart.addProduct(product, quantity);
    }

    public void showCart() {
        List<ProductWrapper> productWrappers = cart.getProducts();
        double totalPrice = cart.getTotalPrice();

        CartView cartView = new CartView(productWrappers, totalPrice);
        cartView.show();
    }
}
