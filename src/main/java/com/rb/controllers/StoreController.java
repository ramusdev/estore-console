package com.rb.controllers;

import com.rb.database.Database;
import com.rb.exceptions.NoProductFoundException;
import com.rb.model.Bread;
import com.rb.model.Product;
import com.rb.model.ProductWrapper;
import com.rb.view.StoreView;

import javax.xml.crypto.Data;
import java.util.HashMap;
import java.util.List;

public class StoreController {
    public void fillStore() {
        Bread breadWhite = new Bread("Bread white", 1000, 5.1);
        Bread breadBlack = new Bread("Bread black", 1001, 6);
        Bread milk = new Bread("Milk white", 2000, 11.2);

        Database database = Database.getInstance();
        // System.out.println("show fill store link");
        // System.out.println(database.toString());

        // database.insert(breadWhite, 1);
        // database.insert(breadBlack, 1);
        // database.insert(milk, 1);

        // System.out.println("Inside fill store function");
        // System.out.println(database.getProducts().size());
    }

    public void showStore() {
        Database database = Database.getInstance();
        List<ProductWrapper> products = database.getProducts();

        // System.out.println("show store link");
        // System.out.println(database.toString());
        // System.out.println("from show store function");
        // System.out.println(database.getProducts().size());

        StoreView storeView = new StoreView(products);
        storeView.show();
    }

    public void addProduct(Product product, int quantity) {

        ProductWrapper productWrapper = null;
        Database database = Database.getInstance();

        // try {
            productWrapper = database.getProduct(product.getId());
        // } catch (NoProductFoundException e) {
            // System.out.println(e.getMessage());
        // }

        // System.out.println("After catch");

        if (productWrapper != null) {
            int quantityOld = productWrapper.getQuantity();
            productWrapper.setQuantity(quantityOld + quantity);
            database.insert(product.getId(), productWrapper);
        } else {
            database.insert(product.getId(), new ProductWrapper(product, quantity));
        }

    }
}